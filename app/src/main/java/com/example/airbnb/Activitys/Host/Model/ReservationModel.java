package com.example.airbnb.Activitys.Host.Model;

public class ReservationModel {

    int arrivingCount,profile;
    String elegant,name,date;


    public ReservationModel(int arrivingCount, int profile, String elegant, String name, String date) {
        this.arrivingCount = arrivingCount;
        this.profile = profile;
        this.elegant = elegant;
        this.name = name;
        this.date = date;
    }

    public int getArrivingCount() {
        return arrivingCount;
    }

    public void setArrivingCount(int arrivingCount) {
        this.arrivingCount = arrivingCount;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getElegant() {
        return elegant;
    }

    public void setElegant(String elegant) {
        this.elegant = elegant;
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
}
