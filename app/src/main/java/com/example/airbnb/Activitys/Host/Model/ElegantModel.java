package com.example.airbnb.Activitys.Host.Model;

public class ElegantModel {


    String dayofMoth,chek,name;
    int guestCount,nightCount,image;


    public ElegantModel(String dayofMoth, String chek, String name, int guestCount, int nightCount, int image) {
        this.dayofMoth = dayofMoth;
        this.chek = chek;
        this.name = name;
        this.guestCount = guestCount;
        this.nightCount = nightCount;
        this.image = image;
    }

    public String getDayofMoth() {
        return dayofMoth;
    }

    public void setDayofMoth(String dayofMoth) {
        this.dayofMoth = dayofMoth;
    }

    public String getChek() {
        return chek;
    }

    public void setChek(String chek) {
        this.chek = chek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGuestCount() {
        return guestCount;
    }

    public void setGuestCount(int guestCount) {
        this.guestCount = guestCount;
    }

    public int getNightCount() {
        return nightCount;
    }

    public void setNightCount(int nightCount) {
        this.nightCount = nightCount;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
