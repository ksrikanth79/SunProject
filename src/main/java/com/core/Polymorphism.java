package com.core;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Polymorphism pm=new Polymorphism();
pm.vehicle();
pm.vehicle( 40);
pm.vehicle( 50, "Bus");
	}
	public void vehicle()
	{
		System.out.println("Public Vehicle");
	}

	public void vehicle( int persons)
	{
		System.out.println("Vehicle can carry Persons"     +persons);
	}

	public void vehicle( int persons, String vehicleName)
	{
		System.out.println("Vehicle can carry Persons"     +persons);
		System.out.println("Bus");
	}
	}