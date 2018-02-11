
package com.example.micha.flickrmvp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photo {

    @SerializedName("-id")
    @Expose
    private String id;
    @SerializedName("-secret")
    @Expose
    private String secret;
    @SerializedName("-server")
    @Expose
    private String server;
    @SerializedName("-isfavorite")
    @Expose
    private String isfavorite;
    @SerializedName("-license")
    @Expose
    private String license;
    @SerializedName("-rotation")
    @Expose
    private String rotation;
    @SerializedName("-originalsecret")
    @Expose
    private String originalsecret;
    @SerializedName("-originalformat")
    @Expose
    private String originalformat;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("visibility")
    @Expose
    private Visibility visibility;
    @SerializedName("dates")
    @Expose
    private Dates dates;
    @SerializedName("permissions")
    @Expose
    private Permissions permissions;
    @SerializedName("editability")
    @Expose
    private Editability editability;
    @SerializedName("comments")
    @Expose
    private String comments;
    @SerializedName("notes")
    @Expose
    private Notes notes;
    @SerializedName("tags")
    @Expose
    private Tags tags;
    @SerializedName("urls")
    @Expose
    private Urls urls;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getIsfavorite() {
        return isfavorite;
    }

    public void setIsfavorite(String isfavorite) {
        this.isfavorite = isfavorite;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getRotation() {
        return rotation;
    }

    public void setRotation(String rotation) {
        this.rotation = rotation;
    }

    public String getOriginalsecret() {
        return originalsecret;
    }

    public void setOriginalsecret(String originalsecret) {
        this.originalsecret = originalsecret;
    }

    public String getOriginalformat() {
        return originalformat;
    }

    public void setOriginalformat(String originalformat) {
        this.originalformat = originalformat;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public Dates getDates() {
        return dates;
    }

    public void setDates(Dates dates) {
        this.dates = dates;
    }

    public Permissions getPermissions() {
        return permissions;
    }

    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    public Editability getEditability() {
        return editability;
    }

    public void setEditability(Editability editability) {
        this.editability = editability;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public Urls getUrls() {
        return urls;
    }

    public void setUrls(Urls urls) {
        this.urls = urls;
    }

}
