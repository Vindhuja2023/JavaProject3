package cruiseAndHotel3;

public abstract class Cruise3 extends User3 {
	

	public String cruiseName;
	double priceAdult;
	double priceChild;
	int noOfDays;
	double foodPriAdult = 20.99;
	double foodPriChildren = 4.99;
	double taxRate = 0.15;

	public Cruise3(String cruiseName, double priceAdult, double priceChild, int noOfDays) {
		super();
		this.cruiseName = cruiseName;
		this.priceAdult = priceAdult;
		this.priceChild = priceChild;
		this.noOfDays = noOfDays;
	}

	public void displayCruise(String cruiseSelected) {

		if (cruiseSelected.equalsIgnoreCase(cruiseName)) {
			System.out.println(
					"The cruise that you have selected is " + cruiseName + " which is " + noOfDays + " day cruise");
			System.out.println("Price for Adults(greater than 12)   : " + priceAdult + " per day");
			System.out.println("Price for kids above 5   : " + priceChild + " per day");

		}
	}

	public String foodSelection() {
		System.out.println(
				"All our cruises have food service on board.Do you want to pre-bookfor dinner buffet meals at 20.99 per day for Adults and 4.99 per day for kids?");
		String preBookFood = sc.next();
		return preBookFood;
	}

	public abstract double calculateTotalCruisePrice(String cruiseSelected);

	public double calculateFoodBill(String preBookFood) {
		double totalFoodPrice = 0;
		if (preBookFood.equalsIgnoreCase("Yes")) {
			double foodPriceAdult = foodPriAdult * numOfAdults;
			System.out.println("Buffet Special Price Adult             @ " + numOfAdults + "  :$" + foodPriceAdult);
			double foodPriceChildren = foodPriChildren * numOfChildren;
			System.out
					.println("Buffet Special Price Children above 5  @ " + numOfChildren + "  :$" + foodPriceChildren);

			totalFoodPrice = foodPriceAdult + foodPriceChildren;

		}
		return totalFoodPrice;
	}

	public double calculateFinalBill(double totalCruisePrice, double totalFoodPrice) {
		double totalPrice = totalCruisePrice + totalFoodPrice;
		double taxPrice = (totalCruisePrice + totalFoodPrice) * taxRate;
		System.out.println("Total price                                 :$" + totalPrice);
		System.out.println("HST     @15%                                :$" + taxPrice);
		double finalPrice = totalPrice + taxPrice;
		return finalPrice;
	}

}
