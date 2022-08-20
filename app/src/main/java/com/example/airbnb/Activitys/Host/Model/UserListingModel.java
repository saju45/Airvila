package com.example.airbnb.Activitys.Host.Model;

public class UserListingModel {

    int image,count;
    String location;

    public UserListingModel(int image, int count, String location) {
        this.image = image;
        this.count = count;
        this.location = location;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
