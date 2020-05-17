package com.cs.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyFlatMap {
	public static void main(String[] args) {
		List<List<String>> flatlist=Arrays.asList(Arrays.asList("shubham","shubhesh"),
				Arrays.asList("rahul","Umesh"),
				Arrays.asList("Usha"));
		       flatlist.stream().flatMap(Collection::stream).map(String::toUpperCase).forEach(System.out::println);;
	
		       Function<Long, Long> adder = (value) -> value + 3;
		       Long resultLambda = adder.apply((long) 8);
		       System.out.println("resultLambda = " + resultLambda);
		       
		       
		       List<String> list=Arrays.asList("shubham","shubhesh");
		       list.stream().map(String::toUpperCase)
		    		   .forEach(System.out::println);

	}

}
