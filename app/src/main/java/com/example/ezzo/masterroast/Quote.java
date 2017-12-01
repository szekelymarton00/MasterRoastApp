package com.example.ezzo.masterroast;

/**
 * Created by lica on 2017. 12. 01..
 */

public class Quote {

    int id;
    String text;

    public Quote(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
