package tw.edu.wenpenglee.recyclerview1121;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        Bundle bundle = getIntent().getExtras();
        String title = bundle.getString("TITLE");
        String detail = bundle.getString("DETAIL");

        TextView titleTextView = findViewById(R.id.mTitleText2);
        TextView detailTextView = findViewById(R.id.mDetailText2);

        titleTextView.setText(title);
        detailTextView.setText(detail);
    }
}
