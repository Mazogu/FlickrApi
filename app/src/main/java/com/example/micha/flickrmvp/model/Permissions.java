
package com.example.micha.flickrmvp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Permissions {

    @SerializedName("-permcomment")
    @Expose
    private String permcomment;
    @SerializedName("-permaddmeta")
    @Expose
    private String permaddmeta;

    public String getPermcomment() {
        return permcomment;
    }

    public void setPermcomment(String permcomment) {
        this.permcomment = permcomment;
    }

    public String getPermaddmeta() {
        return permaddmeta;
    }

    public void setPermaddmeta(String permaddmeta) {
        this.permaddmeta = permaddmeta;
    }

}
