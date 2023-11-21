package com.problemsts.ocp;

public class ShoppingCart {

	public void finalCost(FixedPrice price) {
		price.CalculatePrice(0.0);
	}

	public void finalCost(DiscountPercentage price) {
		price.CalculatePrice(0.0);
	}

}
