package com.cs.lmd;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class LambdaExpressionImpl {
	public static void main(String[] args) throws FileNotFoundException {
		LambdaExpression lx = text -> System.out.println(text);
		lx.apply("Hello shubham");
		lx.stringToUTF8("I am shubham yaduwanshi", new FileOutputStream("data.txt"));
		LambdaExpression.printMessage();
	}
}
