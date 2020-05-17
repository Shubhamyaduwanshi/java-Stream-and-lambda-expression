package com.cs.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
	    List<Integer> list2=Arrays.asList(1,2,3,4,5,7);
	    
		Optional<Integer> first=list.stream().filter(i->i>1).findAny();
       
		if(first.isPresent()) {
			System.out.println(first.get());
		}else {
			System.out.println("Error");
		}
	     
	
	}
}
