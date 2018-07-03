package com.example.snippetconsumer;

import java.util.Date;

public class SnippetNotifier {

    private String title;
    private Date created;

    public SnippetNotifier() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
