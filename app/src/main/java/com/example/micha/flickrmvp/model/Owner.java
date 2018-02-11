
package com.example.micha.flickrmvp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Owner {

    @SerializedName("-nsid")
    @Expose
    private String nsid;
    @SerializedName("-username")
    @Expose
    private String username;
    @SerializedName("-realname")
    @Expose
    private String realname;
    @SerializedName("-location")
    @Expose
    private String location;

    public String getNsid() {
        return nsid;
    }

    public void setNsid(String nsid) {
        this.nsid = nsid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
