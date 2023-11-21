package com.prblmsts.lsp;

public class Lion extends Animal{
	
	@Override
	public void pet() {
		
		System.out.println("it is not a pet");
	}
	
	@Override
	public void sound() {
		System.out.println("roar");
	}
	
	@Override
	public void eat() {
		
		System.out.println("it eats flesh");
	}
}
