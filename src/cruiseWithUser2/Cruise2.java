package cruiseWithUser2;

import java.util.Scanner;

public class Cruise2 {
	
	Scanner sc = new Scanner(System.in);

	String[] cruiseName;
	double[] priceAdult;
	double[] priceChild;
	int[] noOfDays;

	int numOfAdults;
	int numOfChildren;

	public Cruise2(String[] cruiseName, double[] priceAdult, double[] priceChild, int[] noOfDays) {
		super();
		this.cruiseName = cruiseName;
		this.priceAdult = priceAdult;
		this.priceChild = priceChild;
		this.noOfDays = noOfDays;
	}

	public String displayCruise() {
		
		boolean isCruiseSelected=false;
		System.out.println(
				"We offer 4 different packages as displayed as below.Please enter the cruise that you want to select. ");
		for (int i = 0; i < cruiseName.length; i++) {
			System.out.println(cruiseName[i]);
		}
		String cruiseSelected = sc.nextLine();
		for (int i = 0; i < cruiseName.length; i++) {
			if (cruiseSelected.equalsIgnoreCase(cruiseName[i])) {
				isCruiseSelected=true;
				System.out.println("The cruise that you have selected is " + cruiseName[i] + " which is " + noOfDays[i]
						+ " day cruise");
				System.out.println("Price for Adults(greater than 12)   : " + priceAdult[i] + " per day");
				System.out.println("Price for kids above 5   : " + priceChild[i] + " per day");
				
			}

		}
		if(isCruiseSelected==false) {
			System.out.println("Invalid entry for selecting the Cruise,Please try again");
		}
		return cruiseSelected;
	}

	public void userDetails() {

		System.out.println("Enter the number of Adults");
		numOfAdults = sc.nextInt();
		System.out.println("Enter the number of Children");
		int numOfChildren = sc.nextInt();
		int count = 0;
		int[] ageOfChild = new int[numOfChildren];
		if (numOfChildren != 0) {
			for (int i = 0; i < numOfChildren; i++) {
				System.out.println("Enter the age of child " + (i + 1));
				ageOfChild[i] = sc.nextInt();
			}
		}
		for (int i = 0; i < ageOfChild.length; i++) {
			if (ageOfChild[i] > 5) {
				count++;
			}
		}
		this.numOfChildren = count;
	}
	public String foodSelection() {
		System.out.println(
				"All our cruises have food service on board.Do you want to pre-bookfor dinner buffet meals at 20.99 per day for Adults and 4.99 per day for kids?");
		String preBookFood = sc.next();
		return preBookFood;
	}
	public double calculateTotalCruisePrice(String cruiseSelected) {
		
		double totalCruisePrice=0.0;
		for (int i = 0; i < cruiseName.length; i++) {
			if (cruiseSelected.equalsIgnoreCase(cruiseName[i])) {

		double cruisePriceAdults = priceAdult[i] * numOfAdults * noOfDays[i];
		System.out.println(cruiseName[i]+" Adults                   @ " + numOfAdults + "  :$" + cruisePriceAdults);

		double cruisePriceChildren = priceChild[i] * numOfChildren * noOfDays[i];
		System.out.println( cruiseName[i]+ " Children above 5         @ " + numOfChildren + "  :$" + cruisePriceChildren);

		totalCruisePrice = cruisePriceAdults + cruisePriceChildren;
			}}
		return totalCruisePrice;
		}
	public double calculateFoodBill(String preBookFood) {
		double totalFoodPrice = 0;
		if (preBookFood.equalsIgnoreCase("Yes")) {
			double foodPriceAdult = 20.99 * numOfAdults;
			System.out.println("Buffet Special Price Adult             @ " + numOfAdults + "  :$" + foodPriceAdult);
			double foodPriceChildren = 4.99 * numOfChildren;
			System.out
					.println("Buffet Special Price Children above 5  @ " + numOfChildren + "  :$" + foodPriceChildren);

			totalFoodPrice = foodPriceAdult + foodPriceChildren;

		}
		return totalFoodPrice;
	}

	public double calculateFinalBill(double totalCruisePrice,double totalFoodPrice) {
		double totalPrice = totalCruisePrice + totalFoodPrice;
		double taxPrice = (totalCruisePrice + totalFoodPrice) * 0.15;
		System.out.println("Total price                                 :$" + totalPrice);
		System.out.println("HST     @15%                                :$" + taxPrice);
		double finalPrice = totalPrice + taxPrice;
		return finalPrice;
	}

}
