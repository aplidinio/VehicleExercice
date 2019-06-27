package com.vehicles.project;

import java.util.*;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();
	protected String brandWheel;
	protected double diamWheel;
	

	public Vehicle(String plate, String brand, String color) {
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}
	
	public abstract void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception;
	
	public Vehicle(List<Wheel> wheels) {
		this.wheels = wheels;
	}
	
	public Wheel askWheel( ) {
				
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Input wheel brand: ");
		brandWheel = sc.nextLine();
		
		System.out.println("Input wheel diametre: ");
		diamWheel = Integer.parseInt(sc.nextLine());
				
		Wheel myWheel = new Wheel(brandWheel, diamWheel);
		
		return myWheel;
		
	}
	
	
	public String getWheel(int myWheel) {
				
		return wheels.get(myWheel).getWheelData();
	}	
		
	public String getVehicleData() {
		
		return "Your vehicle is a " + brand + ", his color is "
				+ color + " and his plate is " + plate;
		
	}	
	
}
