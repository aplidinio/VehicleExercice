package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) {
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}
	
	public Vehicle(List<Wheel> wheels) {
		this.wheels = wheels;
	}
	
	public void setFrontWheel(Wheel frontWheel) {
		wheels.add(frontWheel);
		System.out.println("El teu vehicle té rodes davanteres " + wheels.get(0));
	}	
		
	public void setBackWheel(Wheel backWheel) {
		wheels.add(backWheel);
		System.out.println("El teu vehicle té rodes traseres " + wheels.get(1));
	}
	
	public String getVehicleData() {
		
		return "El teu vehicle és un " + brand + ", és de color "
		+ color + " i té matrícula " + plate;
	}
	
	public String getWheelData() {
		
		return "El teu vehicle té rodes de " + wheel. + " polsades y són de la marca " + brand;
	}
	
	//public Vehicle(List<Wheel> frontWheels, List<Wheel> backWheels) {
	//	this.wheels.addAll(frontWheels);
		
	

	public abstract void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception;
	
	//public abstract void addWheels();
	
		
}
