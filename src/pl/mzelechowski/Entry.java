package pl.mzelechowski;

import java.util.Date;

public abstract class Entry {
    private final int id;
    private final Date posterDate;
    private final User author;
    private final String content;
    private static int COUNTER_ID=0;

    public Entry( Date posterDate, User author, String content) {
        this.id = ++COUNTER_ID;
        this.posterDate = posterDate;
        this.author = author;
        this.content = content;
    }

    public Date getPosterDate() {
        return posterDate;
    }

    public int getId() {
        return id;
    }

    public User getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }
}
