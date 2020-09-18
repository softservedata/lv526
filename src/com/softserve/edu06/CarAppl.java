package com.softserve.edu06;

public class CarAppl {

	public static void main(String[] args) {
		
		Car c1 = new Car("Sedan", 1990, 1500);
		Car c2 = new Car("Van", 2017, 2000);
		Car c3 = new Car("Pickup", 2014, 1600);
		Car c4 = new Car("Truck", 2005, 2500);
		
		Car[] cars = {c1, c2, c3, c4};
		
		Car.carYear(cars);
		Car.carOrderedByYear(cars);
	}

}
