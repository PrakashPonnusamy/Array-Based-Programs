package com.designPatterns;

public class FindCar {
public static void main(String[] args) {
	CarFactory carFactory = new CarFactory();
	Car car = carFactory.getCar("AUDI");
	car.driving();
	Car car1 = carFactory.getCar("VOLVO");
	car1.driving();
	Car car2 = carFactory.getCar("BENZ");
	car2.driving();
}
}
