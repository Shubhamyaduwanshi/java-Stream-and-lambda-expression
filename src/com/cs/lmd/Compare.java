package com.cs.lmd;

import java.util.Comparator;

public class Compare {
	Comparator<String> stringCompare = (String s1, String s2) -> s1.compareTo(s2);

	public static void main(String[] args) {
		System.out.println(new Compare().stringCompare.compare("hello", "world"));
	}

}
