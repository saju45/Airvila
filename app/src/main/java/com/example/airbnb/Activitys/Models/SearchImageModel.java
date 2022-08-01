package com.example.airbnb.Activitys.Models;

public class SearchImageModel {

    String name;
    String Image;


    public SearchImageModel(String name, String image) {
        this.name = name;
        Image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
