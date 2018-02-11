
package com.example.micha.flickrmvp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dates {

    @SerializedName("-posted")
    @Expose
    private String posted;
    @SerializedName("-taken")
    @Expose
    private String taken;
    @SerializedName("-takengranularity")
    @Expose
    private String takengranularity;
    @SerializedName("-lastupdate")
    @Expose
    private String lastupdate;

    public String getPosted() {
        return posted;
    }

    public void setPosted(String posted) {
        this.posted = posted;
    }

    public String getTaken() {
        return taken;
    }

    public void setTaken(String taken) {
        this.taken = taken;
    }

    public String getTakengranularity() {
        return takengranularity;
    }

    public void setTakengranularity(String takengranularity) {
        this.takengranularity = takengranularity;
    }

    public String getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(String lastupdate) {
        this.lastupdate = lastupdate;
    }

}
