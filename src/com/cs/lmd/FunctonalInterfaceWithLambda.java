package com.cs.lmd;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FunctonalInterfaceWithLambda{
	public static void main(String[] args) {
		MyFunctionalInterface fif=()->System.out.println("hi shubham");
        fif.printMessage();
        
        Predicate<Integer> FindGreater=(input)->input>8;
        System.out.println("4 is greater than 8:"+FindGreater.test(4));
        System.out.println("12 is greater than 8:"+FindGreater.test(12));
        
        String strr[]= {"Hello","World","Hello","World","Hello","World","Hello","World"};
        Stream.of(strr).
        filter(str->str.startsWith("H"))
        .forEach(System.out::println);
        
        Function<String, Integer> strlen=str->str.length();
        System.out.println(strlen.apply("dsfasdfsdafasdfsadfasdf"));
        
        Random random=new Random();
        Stream.generate(random::nextBoolean).limit(3).forEach(System.out::println);
        
		ArrayList<Boolean> Listobj = new ArrayList<Boolean>();
        Random rand=new Random();
        while(true) {
        	Listobj.add(rand.nextBoolean());
        }
        
        
        
        
	}
}
