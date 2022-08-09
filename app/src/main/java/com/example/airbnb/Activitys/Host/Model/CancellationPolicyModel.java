package com.example.airbnb.Activitys.Host.Model;

public class CancellationPolicyModel {


    String header,headerDes,title,titleDes;


    public CancellationPolicyModel(String header, String headerDes, String title, String titleDes) {
        this.header = header;
        this.headerDes = headerDes;
        this.title = title;
        this.titleDes = titleDes;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getHeaderDes() {
        return headerDes;
    }

    public void setHeaderDes(String headerDes) {
        this.headerDes = headerDes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleDes() {
        return titleDes;
    }

    public void setTitleDes(String titleDes) {
        this.titleDes = titleDes;
    }
}
