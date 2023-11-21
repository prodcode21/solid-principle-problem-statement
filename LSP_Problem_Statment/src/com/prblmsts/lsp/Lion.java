package com.prblmsts.lsp;

public class Lion extends Animal{
	
	@Override
	public void pet() {
		
		
		throw new UnsupportedOperationException("Not supported");
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
