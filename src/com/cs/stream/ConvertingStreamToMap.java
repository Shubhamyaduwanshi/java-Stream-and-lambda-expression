package com.cs.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertingStreamToMap {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stream<Integer> intStream=Stream.of(1,2,3,4,5,6,7,8,9);
		List<Integer> list=intStream.collect(Collectors.toList());
		System.out.println(intStream);
		System.out.println(list);
		
		Stream<Integer> intStream1=Stream.of(1,2,3,14,5,6,7,8,9);
		Map<Integer, Integer> map=intStream1.collect(Collectors.toMap(i->i, i->i+10));
		System.out.println(map);
		
		
	}

}
