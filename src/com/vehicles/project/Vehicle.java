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
		
		do {
		
		System.out.println("Input wheel diameter: ");
		diamWheel = Double.parseDouble(sc.nextLine());
		evaluateWheel(diamWheel);
			
			if (evaluateWheel(diamWheel)==false) 
				System.out.println("Illegal wheel diameter. Only diameters between 0.4 and 4 are allowed.");
	
		} while (evaluateWheel(diamWheel)==false);
				
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
	
	public boolean evaluatePlate (String plate) { //hay libreria pattern de java que lo simplifica
						
		if (plate.length()!=7 && plate.length()!=8) return false; 
							
		for (int i=0; i<plate.length(); i++) {
	
			if(i<4) {
				if(Character.isDigit(plate.charAt(i))==false) {
					return false;					
				}
			}
			if(i==4 && plate.charAt(i)!=' ') return false;
			
			if(i>4) {
				if(Character.isLetter(plate.charAt(i))==false) return false;
			}
		}
		return true;		
	}
	
	public boolean evaluateWheel(double diameter) {
		
		if (diameter<=0.4 || diameter>=4) return false;
		return true;
		
	}
			
}
