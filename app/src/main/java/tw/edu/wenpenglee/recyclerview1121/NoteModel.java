package tw.edu.wenpenglee.recyclerview1121;

public class NoteModel {     //NoteModel class
    private final String title;    //title
    private final String detail;   //detail

    public NoteModel(String title, String detail) {  //Constructor
        this.title = title;
        this.detail = detail;
    }

    public String getTitle() {  //getTitle method
        return title;
    }

    public String getDetail() { //getDetail method
        return detail;
    }
}
