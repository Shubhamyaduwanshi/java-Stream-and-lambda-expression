package com.cs.stream;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class SequentialParallelComparison {
	
	
	private static void run(Stream<String> stream) {
		// TODO Auto-generated method stub
		stream.forEach(s->{
			System.out.println(LocalTime.now()+"-value:"+s+"Thread"+Thread.currentThread().getName());
	   
	    	try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	});
	
	}
	
	public static void main(String[] args) {
		String [] string= {"1","2","3","4","5","6","7","8","9","10"};
		
		System.out.println("Sequential stream running");
		long startTime1=System.nanoTime();
		run(Arrays.stream(string).sequential());
		long endTime1=System.nanoTime();
		System.out.println("Time elapsed for sequential Stream:"+( endTime1-startTime1));
		
		System.out.println("Sequential stream running");
		long startTime2=System.nanoTime();
		run(Arrays.stream(string).parallel());
		long endTime2=System.nanoTime();
		System.out.println("Time elapsed for parallel Stream:"+( endTime2-startTime2));
	}
	
}
