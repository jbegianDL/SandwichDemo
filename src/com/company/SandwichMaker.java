package com.company;

public class SandwichMaker {

    public static void main(String[] args) {
        Sandwich sammie1 = new Sandwich();
	    Sandwich sammie2 = new Sandwich("Everthing", "Turkey", "Cheddar", true);
        Sandwich sammie3 = new Sandwich("Ham", "Gouda", true);

	    sammie1.describeSandwich();
	    System.out.println();
	    sammie2.describeSandwich();
	    System.out.println();
	    sammie3.describeSandwich();
    }
}
