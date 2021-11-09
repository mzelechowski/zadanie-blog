package pl.mzelechowski;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post extends Entry {
    private List<Comment> comments;


    public Post(Date posterDate, User author, String content) {
        super(posterDate, author, content);
        this.comments=new ArrayList<>();
    }

    public List<Comment> getComments() {
        return comments;
    }
}
