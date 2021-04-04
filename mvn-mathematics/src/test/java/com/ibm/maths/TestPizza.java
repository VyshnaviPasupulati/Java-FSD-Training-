package com.ibm.maths;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPizza {
	private Pizza p;
	@BeforeEach
	public void setup() {
		p =new Pizza();
	}
	@Test
	public void testSmall() throws PizzaOrderException {
		assertEquals(250, p.order("s", 3));
	}
	public void testmedium() throws PizzaOrderException {
		assertEquals(350, p.order("m", 3));
	}
	public void testLarge() throws PizzaOrderException {
		assertEquals(500, p.order("l", 4));
	}
	public void testInvalidSize() throws PizzaOrderException {
		assertThrows(PizzaOrderException.class,()-> {p.order("v",5);} );
	}
	public void testInvalidToppings() throws PizzaOrderException {
		assertThrows(PizzaOrderException.class,()-> {p.order("s",7);} );
	}

}
