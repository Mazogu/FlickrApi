
package com.example.micha.flickrmvp.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photos {

    @SerializedName("-page")
    @Expose
    private String page;
    @SerializedName("-pages")
    @Expose
    private String pages;
    @SerializedName("-perpage")
    @Expose
    private String perpage;
    @SerializedName("-total")
    @Expose
    private String total;
    @SerializedName("photoMini")
    @Expose
    private List<PhotoMini> photoMini = null;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getPerpage() {
        return perpage;
    }

    public void setPerpage(String perpage) {
        this.perpage = perpage;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<PhotoMini> getPhotoMini() {
        return photoMini;
    }

    public void setPhotoMini(List<PhotoMini> photoMini) {
        this.photoMini = photoMini;
    }

}
