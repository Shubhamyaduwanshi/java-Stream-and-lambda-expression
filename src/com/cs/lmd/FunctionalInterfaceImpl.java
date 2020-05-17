package com.cs.lmd;

public class FunctionalInterfaceImpl implements MyFunctionalInterface{

	@Override
	public void printMessage() {
		System.out.println("Hi shubham");
	}
	
	public static void main(String[] args) {
		FunctionalInterfaceImpl callMethod=new FunctionalInterfaceImpl();
		callMethod.printMessage();
	}
	

}
