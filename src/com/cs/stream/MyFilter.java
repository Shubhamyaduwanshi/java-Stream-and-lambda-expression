package com.cs.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyFilter {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= 100; i++) {
			list.add(i);
		}

		System.out.println(list.stream().filter(i -> i > 90)
		.min(Comparator.naturalOrder())
		.map(i->i)
		.get());;
		
	   
	
	}
}
