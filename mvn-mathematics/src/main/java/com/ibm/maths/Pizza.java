package com.ibm.maths;

public class Pizza {

	public double order(String size, int toppings) throws PizzaOrderException {
    	if(toppings>=2 && toppings<=5) {
    		if(size == "s") {
    			return 100+(50*toppings);
    		}
    		else if(size == "m") {
    			return 200+(50*toppings);
    		}
    		else if(size== "l") {
    			return 300+(50*toppings);
    		}
    		else
    			throw new PizzaOrderException ("Invalid size");
    	}
    	throw new PizzaOrderException("Invalid Toppings");
    }
	
}