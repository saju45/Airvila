package com.example.airbnb.Activitys.Host.Model;

public class FromGuestsModel {

    int image;
    String name,city,date,description;

    public FromGuestsModel(int image, String name, String city, String date, String description) {
        this.image = image;
        this.name = name;
        this.city = city;
        this.date = date;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
