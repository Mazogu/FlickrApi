
package com.example.micha.flickrmvp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Note {

    @SerializedName("-id")
    @Expose
    private String id;
    @SerializedName("-author")
    @Expose
    private String author;
    @SerializedName("-authorname")
    @Expose
    private String authorname;
    @SerializedName("-x")
    @Expose
    private String x;
    @SerializedName("-y")
    @Expose
    private String y;
    @SerializedName("-w")
    @Expose
    private String w;
    @SerializedName("-h")
    @Expose
    private String h;
    @SerializedName("#text")
    @Expose
    private String text;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getW() {
        return w;
    }

    public void setW(String w) {
        this.w = w;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
