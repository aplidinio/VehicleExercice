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
		int typeOfVehicle=0;
		String typeOfVehicle0;
		Vehicle myVehicle= new Car("", "", "");
		List<Wheel> frontWheels = new ArrayList<Wheel>();
		List<Wheel> backWheels = new ArrayList<Wheel>();
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
		System.out.println("Please enter vehicle:");
		System.out.println("1.- Car");
		System.out.println("2.- Bike");
		typeOfVehicle0 = sc.nextLine();
		
		//Dejo la opción de la captura de excepciones comentada. Funciona bien.
			/*try {
				typeOfVehicle = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e){
				System.out.println ("Invalid option. Try again.");
			}*/
		
		if (!typeOfVehicle0.equals("1") && !typeOfVehicle0.equals("2"))
			System.out.println("Invalid option. Try again.");
		
		} while (!typeOfVehicle0.equals("1") && !typeOfVehicle0.equals("2"));
		
		typeOfVehicle = Integer.parseInt(typeOfVehicle0);
		
		do {
		
			System.out.println("Please input vehicle plate: ");
			plate = sc.nextLine();
				
			myVehicle.evaluatePlate(plate);
			
			if((myVehicle.evaluatePlate(plate) == false))
					System.out.println("Illegal vehicle plate.");
			
		} while (myVehicle.evaluatePlate(plate) == false);
		
		System.out.println("Please input vehicle brand: ");
		brand = sc.nextLine();
			
		System.out.println("Please input vehicle color: ");
		color = sc.nextLine();
						
		switch (typeOfVehicle) {
		
			case 1:
		
				Vehicle car1 = new Car(plate, brand, color);

				System.out.println("Please input front-left wheel data.");				
				frontWheels.add(car1.askWheel());
				System.out.println("Please input front-right wheel data.");				
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
				System.out.println("Your car has front-left wheel of " + frontWheels.get(0).getWheelData());
				System.out.println("Your car has front-right wheel of " + frontWheels.get(1).getWheelData());
				System.out.println("Your car has back-left wheel of " + backWheels.get(0).getWheelData());
				System.out.println("Your car has back-right wheel of " + backWheels.get(1).getWheelData());
								
				break;
		
			case 2:
				
				Vehicle bike1= new Bike(plate, brand, color);
				
				System.out.println("Please input front wheel data.");				
				frontWheels.add(bike1.askWheel());
				
				System.out.println("Please input back wheel data.");				
				backWheels.add(bike1.askWheel());
			
				try {
					bike1.addWheels(frontWheels, backWheels);
				} catch (Exception e) {
					System.out.println(e);	
					e.printStackTrace();
				}
				
				System.out.println(bike1.getVehicleData());
				System.out.println("Your bike has front wheel of " + frontWheels.get(0).getWheelData());
				System.out.println("Your bike has back wheel of " + backWheels.get(0).getWheelData());
			
				break;
		}
		
		sc.close();

	}
	
}
