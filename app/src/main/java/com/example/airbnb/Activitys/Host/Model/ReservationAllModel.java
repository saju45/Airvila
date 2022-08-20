package com.example.airbnb.Activitys.Host.Model;

public class ReservationAllModel {

    String request,name,date;
    int image;

    public ReservationAllModel(String request, String name, String date, int image) {
        this.request = request;
        this.name = name;
        this.date = date;
        this.image = image;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
