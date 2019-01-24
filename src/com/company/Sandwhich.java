package com.company;

public class Sandwhich {
    String breadType;
    String proteinType;
    String cheeseType;
    boolean veggies;

    public Sandwhich(){
        breadType = "Wheat";
        proteinType = "Chicken";
        cheeseType = "Cheddar";
        veggies = false;


    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getProteinType() {
        return proteinType;
    }

    public void setProteinType(String proteinType) {
        this.proteinType = proteinType;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(String cheeseType) {
        this.cheeseType = cheeseType;
    }

    public boolean isVeggies() {
        return veggies;
    }

    public void setVeggies(boolean veggies) {
        this.veggies = veggies;
    }



}
