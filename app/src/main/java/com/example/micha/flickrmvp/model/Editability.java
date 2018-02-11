
package com.example.micha.flickrmvp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Editability {

    @SerializedName("-cancomment")
    @Expose
    private String cancomment;
    @SerializedName("-canaddmeta")
    @Expose
    private String canaddmeta;

    public String getCancomment() {
        return cancomment;
    }

    public void setCancomment(String cancomment) {
        this.cancomment = cancomment;
    }

    public String getCanaddmeta() {
        return canaddmeta;
    }

    public void setCanaddmeta(String canaddmeta) {
        this.canaddmeta = canaddmeta;
    }

}
