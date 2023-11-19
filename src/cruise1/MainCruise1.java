package cruise1;

import java.util.*;

public class MainCruise1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char confirmSelection = 0;
		String cruiseSelected = null;
		String[] cruiseName = { "Scenic Cruise", "Sunset Cruise", "Discovery Cruise", "Mystery Cruise" };
		double[] priceAdult = { 43.99, 52.99, 39.99, 45.99 };
		double[] priceChild = { 12.99, 15.99, 9.99, 12.99 };
		int[] noOfDays = { 3, 1, 4, 2 };

		Cruise1 cruise = new Cruise1(cruiseName, priceAdult, priceChild, noOfDays);
		while (confirmSelection != 'Y') {
			cruiseSelected = cruise.displayCruise();
			System.out.println(
					"Please press Y if you want to continue with the selection or press any other alphabet to select another.");
			confirmSelection = sc.next().charAt(0);
		}
		
		for (int i = 0; i < cruiseName.length; i++) {
			if (cruiseSelected.equalsIgnoreCase(cruiseName[i]) && confirmSelection == 'Y') {
				cruise.userDetails();
				String preBookFood = cruise.foodSelection();
				double totalCruisePrice = cruise.calculateTotalCruisePrice(cruiseSelected);
				double totalFoodPrice = cruise.calculateFoodBill(preBookFood);
				System.out.println("Final price                                 :$" + cruise.calculateFinalBill(totalCruisePrice, totalFoodPrice));
			}
		}
		sc.close();
	}

}
