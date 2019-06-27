package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
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
				List<Wheel> frontWheels = new ArrayList<Wheel>();
				List<Wheel> backWheels = new ArrayList<Wheel>();
				
				System.out.println("Please input front-left wheel data.");				
				frontWheels.add(car1.askWheel());
				System.out.println("Please input front-light wheel data.");				
				frontWheels.add(car1.askWheel());
				
				System.out.println("Please input back-left wheel data.");				
				backWheels.add(car1.askWheel());
				System.out.println("Please input back-right wheel data.");				
				backWheels.add(car1.askWheel());
				
				try {
					car1.addWheels(frontWheels, backWheels);
				} catch (Exception e) {
					System.out.println("You can't put front wheels or back wheels of different brand/diametre!");
					System.out.println(e);	
					e.printStackTrace();
				}
				
				System.out.println(car1.getVehicleData());				
				System.out.println("Your vehicle has front-left wheel of " + frontWheels.get(0).getWheelData());
				System.out.println("Your vehicle has front-right wheel of " + frontWheels.get(1).getWheelData());
				System.out.println("Your vehicle has back-left wheel of " + backWheels.get(0).getWheelData());
				System.out.println("Your vehicle has back-right wheel of " + backWheels.get(1).getWheelData());
								
				break;
		
			case 2:
				
				Vehicle bike1= new Bike(plate, brand, color);
				
				break;
		}
		
		sc.close();

	}
	
	

}
