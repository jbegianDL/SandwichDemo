package com.company;

public class Sandiwch {
    private String breadType;
    private String proteinType;
    private String cheeseType;
    private boolean veggies;

    public void setBreadType(String choiceBread){
        breadType = choiceBread;
    }

    public String getBreadType(){
        return breadType;
    }

    public void setProteinType(String choiceProtein){
        proteinType = choiceProtein;
    }

    public String getProteinType(){
        return proteinType;
    }

    public void setCheeseType(String choiceCheese){
        cheeseType = choiceCheese;
    }

    public String getCheeseType(){
        return cheeseType;
    }

    public void setVeggies(boolean choiceVeggies){
        veggies = choiceVeggies;
    }

    public boolean getVeggies(){
        return veggies;
    }


}
