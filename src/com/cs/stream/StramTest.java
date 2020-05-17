package com.cs.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StramTest {

	public static void main(String[] args) {
		
		//Stream.of=> We can use Stream.of() to create a stream from similar type of data
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
		stream.forEach(System.out::print);
		//:: is called method refrence 
		Stream<Integer> stream1 = Stream.of(new Integer[]{1,2,3,4});
		stream1.forEach(System.out::println);
		
		Stream<String> names2 = Stream.of("D", "A", "Z", "R");
        names2.sorted(Comparator.naturalOrder()).forEach(System.out::println);
		 
        
	}
}
