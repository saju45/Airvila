package com.example.airbnb.Activitys.Host.Model;

public class CheckInInstructionModel {


    int count;
    String text;

    public CheckInInstructionModel(int count, String text) {
        this.count = count;
        this.text = text;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
