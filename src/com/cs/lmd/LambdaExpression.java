package com.cs.lmd;

import java.io.FileOutputStream;
import java.io.IOException;

public interface LambdaExpression {
	public void apply(String text);

	default public void stringToUTF8(String text, FileOutputStream fileOutPutStram) {
		try {
			fileOutPutStram.write(text.getBytes("UTF-8"));
			System.out.println("data saved in data.txt");
		} catch (IOException e) {
			throw new RuntimeException("error for writiong String as UTF-8 to outpustrem", e);
		}
	}

	static void printMessage() {
		System.out.println("Good mornong");
	}

}
