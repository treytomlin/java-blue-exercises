package com.techelevator;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	
		
		//User weight input
		System.out.println("Please enter the weight of the package:");
		String weightInput = in.nextLine();
		int weight = Integer.parseInt(weightInput); 
		
		//User Pounds or Ounces input
		System.out.println("(P)ounds or (O)unces?");
		String lbOrOzInput = in.nextLine();
		if (lbOrOzInput.toUpperCase().equals("p")) {
			weight = (weight * 16);
		}
		
		//User distance input
		System.out.println("What is the distance the package will be traveling?");
		String distInput = in.nextLine();
		int distance = Integer.parseInt(distInput);
		
		
		
		DeliveryDriver[] deliverydriver = new DeliveryDriver[] {new PostalFirstClass(), new PostalSecondClass(), new PostalThirdClass(), new FexEd(), new SpuFourDay(), new SpuTwoDay(), new SpuNextDay()};
		 
		 for (DeliveryDriver company: deliverydriver) {
			 System.out.println("Delivery Method: " + company.getName() + " / Cost $" + company.calculateRate(distance, weight));
			 in.close();
		 }

	}
	

}
