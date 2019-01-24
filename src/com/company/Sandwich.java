package com.company;

public class Sandwich {
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

    public Sandwich(){
        breadType = "Rye";
        proteinType = "Pastrami";
        cheeseType = "Swiss";
        veggies = false;

    }

    public Sandwich(String bread, String meat, String cheese, boolean vegs){
        breadType = bread;
        proteinType = meat;
        cheeseType = cheese;
        veggies = vegs;

    }

    public Sandwich(String meat, String cheese, boolean vegs){
        breadType = "Whole Grain";
        proteinType = meat;
        cheeseType = cheese;
        veggies = vegs;
    }

    public void describeSandwich(){
        System.out.println("Bread: " + breadType + "\nProtein: " + proteinType + "\nCheese: " + cheeseType + "\nVeggies: " + veggies);
    }


}
