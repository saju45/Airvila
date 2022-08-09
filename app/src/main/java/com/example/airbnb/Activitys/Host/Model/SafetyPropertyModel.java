package com.example.airbnb.Activitys.Host.Model;

public class SafetyPropertyModel {


    String layout,header,headerDescription,title,titleDescription,learMore;


    public SafetyPropertyModel(String layout, String header, String headerDescription, String title, String titleDescription, String learMore) {
        this.layout = layout;
        this.header = header;
        this.headerDescription = headerDescription;
        this.title = title;
        this.titleDescription = titleDescription;
        this.learMore = learMore;
    }


    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getHeaderDescription() {
        return headerDescription;
    }

    public void setHeaderDescription(String headerDescription) {
        this.headerDescription = headerDescription;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleDescription() {
        return titleDescription;
    }

    public void setTitleDescription(String titleDescription) {
        this.titleDescription = titleDescription;
    }

    public String getLearMore() {
        return learMore;
    }

    public void setLearMore(String learMore) {
        this.learMore = learMore;
    }
}
