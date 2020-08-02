package com.designPatterns;

public class CarFactory {
	
public Car getCar(String type)
{
	if(type.equalsIgnoreCase("benz"))
	{
		return new MercedesBenz();
	}
	else if(type.equalsIgnoreCase("volvo"))
	{
		return new Volvo();
	}
	else if(type.equalsIgnoreCase("AUDI"))
	{
		return new Audi();
	}
	return null;
}
}
