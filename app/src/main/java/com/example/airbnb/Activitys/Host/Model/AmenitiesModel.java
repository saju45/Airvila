package com.example.airbnb.Activitys.Host.Model;

public class AmenitiesModel {


    String header;
    String title;
    String description;
    String addDetails;

    public AmenitiesModel(String header, String title, String description, String addDetails) {
        this.header = header;
        this.title = title;
        this.description = description;
        this.addDetails = addDetails;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
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

    public String getAddDetails() {
        return addDetails;
    }

    public void setAddDetails(String addDetails) {
        this.addDetails = addDetails;
    }
}
