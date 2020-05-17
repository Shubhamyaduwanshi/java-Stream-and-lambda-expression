package com.cs.lmd;

public class WithoutLambdaExpressionImp implements LambdaExpression1 {

	@Override
	public void apply() {
		System.out.println("Hello World");
	}
	public static void main(String[] args) {
     System.out.println("Interface without LX");
	LambdaExpression1 lx=new WithoutLambdaExpressionImp();
	lx.apply();
	}

}
