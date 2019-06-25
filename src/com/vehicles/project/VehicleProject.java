package com.vehicles.project;

import java.util.Scanner;

public class VehicleProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String plate;
		String brand;
		String color;
		int typeOfVehicle;
					
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter vehicle:");
		System.out.println("1.- Car");
		System.out.println("2.- Bike");
		
		typeOfVehicle = Integer.parseInt(sc.nextLine());
		
		System.out.println("Please input vehicle plate: ");
		
		plate = sc.nextLine();
		
		System.out.println("Please input vehicle brand: ");
		
		brand = sc.nextLine();
		
		System.out.println("Please input vehicle color: ");
		
		color = sc.nextLine();
						
		switch (typeOfVehicle) {
		
			case 1:
		
				Vehicle car1 = new Car(plate, brand, color);
				
				System.out.println("Please input front wheel data.");				
				car1.configureWheel();	
				
				System.out.println("Please input back wheel data.");
				car1.configureWheel();  
				
				System.out.println(car1.getVehicleData());				
				System.out.println("Your vehicle has front wheels of " + car1.getWheel(0));
				System.out.println("Your vehicle has back wheels of " + car1.getWheel(1));
								
				break;
		
			case 2:
				
				Vehicle bike1= new Bike(plate, brand, color);
				
				break;
		}
		
		sc.close();

	}
	
	

}
