package tw.edu.wenpenglee.recyclerview1121;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewInterface {

    ArrayList<NoteModel> noteModels = new ArrayList<>(); //創建ArrayList 命名為noteModels

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView); //與Layout中的元件做綁定

        setUpNoteModels(); //設定假資料

        Note_RecyclerViewAdapter adapter = new Note_RecyclerViewAdapter(this, noteModels, this);  //引用我們寫好的Adapter
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    private void setUpNoteModels() {
        String[] title = getResources().getStringArray(R.array.note_title_text);
        String[] detail = getResources().getStringArray(R.array.note_detail_text);

        for (int i = 0; i < title.length; i++ ) {
            noteModels.add(new NoteModel(title[i], detail[i]));
        }
    }

    @Override
    public void onItemClick(int position) {

        Intent intent = new Intent(MainActivity.this, ItemActivity.class);

        Bundle bundle = new Bundle();
        bundle.putString("TITLE", noteModels.get(position).getTitle());
        bundle.putString("DETAIL", noteModels.get(position).getDetail());

        intent.putExtras(bundle);
        startActivity(intent);

    }
}
