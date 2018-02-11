
package com.example.micha.flickrmvp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PhotoMini {

    @SerializedName("-id")
    @Expose
    private String id;
    @SerializedName("-owner")
    @Expose
    private String owner;
    @SerializedName("-secret")
    @Expose
    private String secret;
    @SerializedName("-server")
    @Expose
    private String server;
    @SerializedName("-title")
    @Expose
    private String title;
    @SerializedName("-ispublic")
    @Expose
    private String ispublic;
    @SerializedName("-isfriend")
    @Expose
    private String isfriend;
    @SerializedName("-isfamily")
    @Expose
    private String isfamily;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIspublic() {
        return ispublic;
    }

    public void setIspublic(String ispublic) {
        this.ispublic = ispublic;
    }

    public String getIsfriend() {
        return isfriend;
    }

    public void setIsfriend(String isfriend) {
        this.isfriend = isfriend;
    }

    public String getIsfamily() {
        return isfamily;
    }

    public void setIsfamily(String isfamily) {
        this.isfamily = isfamily;
    }

}
