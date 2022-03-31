package com.christy;

import java.util.Locale;

public class Car {
    //Fields variable of Car
    private int doors;
    private int wheels;
    private  String model;
    private  String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("is300 sport") || validModel.equals("toyota")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
