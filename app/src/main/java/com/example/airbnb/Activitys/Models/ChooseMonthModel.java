package com.example.airbnb.Activitys.Models;

public class ChooseMonthModel {

    String mothName;
    String year;

    public ChooseMonthModel(String mothName, String year) {
        this.mothName = mothName;
        this.year = year;
    }

    public String getMothName() {
        return mothName;
    }

    public void setMothName(String mothName) {
        this.mothName = mothName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
