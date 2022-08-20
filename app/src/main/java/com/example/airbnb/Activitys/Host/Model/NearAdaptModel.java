package com.example.airbnb.Activitys.Host.Model;

public class NearAdaptModel {

    int image;
    String text1,text2;
    int downCounter,upCounter;


    public NearAdaptModel(int image, String text1, String text2, int downCounter, int upCounter) {
        this.image = image;
        this.text1 = text1;
        this.text2 = text2;
        this.downCounter = downCounter;
        this.upCounter = upCounter;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public int getDownCounter() {
        return downCounter;
    }

    public void setDownCounter(int downCounter) {
        this.downCounter = downCounter;
    }

    public int getUpCounter() {
        return upCounter;
    }

    public void setUpCounter(int upCounter) {
        this.upCounter = upCounter;
    }
}
