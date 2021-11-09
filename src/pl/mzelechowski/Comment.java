package pl.mzelechowski;

import java.util.Date;

public class Comment extends Entry{

    public Comment(Date posterDate, User author, String content) {
        super(posterDate, author, content);
    }
}
