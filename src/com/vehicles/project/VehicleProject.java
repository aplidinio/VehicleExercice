package com.vehicles.project;

import java.util.Scanner;

public class VehicleProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String plate;
		String brand;
		String color;
		int typeOfVehicle;
		String brandWheel;
		double diamWheel;
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdueix vehicle:");
		System.out.println("1.- Cotxe");
		System.out.println("2.- Moto");
		
		typeOfVehicle = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introdueix la matr�cula del vehicle: ");
		
		plate = sc.nextLine();
		
		System.out.println("Introdueix la marca del vehicle: ");
		
		brand = sc.nextLine();
		
		System.out.println("Introdueix el color del vehicle: ");
		
		color = sc.nextLine();
						
		switch (typeOfVehicle) {
		
			case 1:
		
				Vehicle cotxe1 = new Car(plate, brand, color);
				
				System.out.println("Rodes davanteres: ");
				System.out.println("Introdueix marca: ");
				
				brandWheel = sc.nextLine();
				
				System.out.println("Introdueix di�metre de la roda: ");
				
				diamWheel = Integer.parseInt(sc.nextLine());
				
				Wheel frontWheel = new Wheel(brandWheel, diamWheel);
				Wheel backWheel = new Wheel(brandWheel, diamWheel);
				
				System.out.println(cotxe1.getVehicleData());				
				cotxe1.setFrontWheel(frontWheel);			
				cotxe1.setBackWheel(backWheel);
				
				break;
		
			case 2:
				
				Vehicle moto1= new Bike(plate, brand, color);
				
				break;
		}
		
		

	}
	
	

}
