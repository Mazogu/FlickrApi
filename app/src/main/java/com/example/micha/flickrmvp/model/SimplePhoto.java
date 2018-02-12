package com.example.micha.flickrmvp.model;

/**
 * Created by micha on 2/12/2018.
 */

public class SimplePhoto {
    private String id,title,url,owner,description,date;

    public SimplePhoto(String id, String title, String description, String url, String date, String owner) {

        this.id = id;
        this.title = title;
        this.url = url;
        this.owner = owner;
        this.description = description;
        this.date = date;
    }

    @Override
    public String toString() {
        return "SimplePhoto{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", owner='" + owner + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
