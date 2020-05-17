package com.cs.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyLambdaTest {
	
	public static boolean isOdd(int i) {
		return i%2!=0;
	}
    public static boolean isGreaterThanThree(int n) {
    	return n>3;
    }
    public static boolean isLessThanEleven(int n) {
    	return n<11;
    }
    public static int findSquareOfMaxOdd(List<Integer> number) {
    	return number.stream()
    			.filter(MyLambdaTest::isOdd)
    			.filter(MyLambdaTest::isGreaterThanThree)
    			.filter(MyLambdaTest::isLessThanEleven)
    			.max(Comparator.naturalOrder())
    			.map(i->i*i)
    			.get();
    }

void printElements(List<String> strings){
    strings.forEach(System.out::println);
}
    
    
    public static void main(String[] args) {
    	List<Integer> list=new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.add(5);
    	list.add(6);
    	list.add(12);
       	System.out.println(findSquareOfMaxOdd(list));	

	}
}
