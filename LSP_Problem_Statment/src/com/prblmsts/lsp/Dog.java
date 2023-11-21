package com.prblmsts.lsp;

public class Dog extends Animal {

	
	@Override
	public void pet() {
		
		System.out.println("it is pet");
	}
	
	@Override
	public void sound() {
		System.out.println("it is a bow bow");
	}
	
	@Override
	public void eat() {
		
		System.out.println("it eats biscuits");
	}
}
