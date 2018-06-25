package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

import com.techelevator.vehicleexercise.Car;
import com.techelevator.vehicleexercise.Tank;
import com.techelevator.vehicleexercise.Truck;
import com.techelevator.vehicleexercise.Vehicle;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
			Car civic = new Car(false, new BigDecimal ("40.00"));
			Car crv = new Car(true, new BigDecimal ("20.00"));
			Truck toyota = new Truck(4, new BigDecimal ("10.00"));
			Truck ford = new Truck(6, new BigDecimal ("30.00"));
			Truck semi = new Truck(12, new BigDecimal ("50.00"));
			Tank army = new Tank(new BigDecimal ("500.00"));
			
			Vehicle[] listOfVehicles = {civic, crv, toyota, ford, semi, army};
			
			System.out.printf("%-15s%-26s%-22s\n","Vehicle","Distance Traveled","Toll $");
			System.out.println("-----------------------------------------------");

		
		while(true) {
			
			System.out.println("Please enter the weight of the package?");
			System.out.print(">>>>>");
			String packageWeight = in.nextLine();
			
			System.out.println("(P)ounds of (O)unces?");
			System.out.print(">>>>>");
			String weightType = in.nextLine();
			
			System.out.println("What distance will it be traveling?");
			System.out.print(">>>>>");
			int distanceTraveling = in.nextInt();
			
			System.out.println("Delivery Method               $ cost");
			System.out.print("------------------------------------");
			
			
			
			for(Vehicle thisVehicle : listOfVehicles) {
				String thisCar = thisVehicle.getClass().getSimpleName();
				int distance = (int) (Math.random()*240+10);
				BigDecimal toll = thisVehicle.calculateToll(distance);
				System.out.printf("%-15s%-26s%-22s\n",thisCar,distance,toll);
			}
			
			
			
		}
			
		
	}

}
