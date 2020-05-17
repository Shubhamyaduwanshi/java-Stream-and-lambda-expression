package com.cs.lmd;

public class FinderImpl {
	public static void main(String[] args) {
		Finder finder=String::indexOf;
		System.out.println(finder.find("Shubham", "b"));
	}
}
