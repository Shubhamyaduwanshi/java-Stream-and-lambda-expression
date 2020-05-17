package com.cs.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MyReduce {
	public static void main(String[] args) {
	 List<Car> carList=new ArrayList<Car>();
	 carList.add(new Car("Audi", 1000000));
	 carList.add(new Car("BMW", 800000));
	 carList.add(new Car("Cadillac",5000000));
	 carList.add(new Car("Datsun", 2000000));
	 
	 Optional<Car> carOpt=carList.stream().reduce((c1, c2)->c1.getPrice()>c2.getPrice()?c1:c2);
	 if(carOpt.isPresent())
		  System.out.println("Expensive car"+carOpt.get());
	 else
		 System.out.println("Car not Available");
	
	}

}
