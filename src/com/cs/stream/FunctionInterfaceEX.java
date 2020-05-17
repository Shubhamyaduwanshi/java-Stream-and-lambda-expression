package com.cs.stream;

import java.util.function.IntToDoubleFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class FunctionInterfaceEX {
	public static void main(String[] args) {
		
        ToIntFunction<Double> ob = a -> (int)(a * 10); 
        System.out.println(ob.applyAsInt(3.2));   
        
         ToDoubleFunction<Integer> ob1=a->a*10;
         System.out.println(ob1.applyAsDouble(4));
         

         ToLongFunction<Integer> ob2=a->a*10;
         System.out.println(ob2.applyAsLong(4));
         
         IntToDoubleFunction itd=a->a/2;
         System.out.println("I-T-D:"+itd.applyAsDouble(10));
         
      
        
	}

}
