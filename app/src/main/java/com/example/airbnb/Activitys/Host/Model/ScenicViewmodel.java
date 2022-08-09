package com.example.airbnb.Activitys.Host.Model;

public class ScenicViewmodel {


    String hearder,title;

    public ScenicViewmodel(String hearder, String title) {
        this.hearder = hearder;
        this.title = title;
    }

    public String getHearder() {
        return hearder;
    }

    public void setHearder(String hearder) {
        this.hearder = hearder;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
