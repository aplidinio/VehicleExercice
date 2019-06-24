package com.vehicles.project;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}
	
	public String getWheelData() {
		
		return "El teu vehicle té rodes de " + diameter + " polsades y són de la marca " + brand;
	}
	
	
}
