package com.example.airbnb.Activitys.Host.Model;

public class BestDescripPlaceModel {

    String name;
    String description;

    public BestDescripPlaceModel(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
