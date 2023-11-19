package cruiseAndHotel3;

public class ScenicCruise3 extends Cruise3 {
	String cruiseName;
	double priceAdult;
	double priceChild;
	int noOfDays;


	public ScenicCruise3(String cruiseName, double priceAdult, double priceChild, int noOfDays) {
		super(cruiseName, priceAdult, priceChild, noOfDays);
		this.cruiseName = cruiseName;
		this.priceAdult = priceAdult;
		this.priceChild = priceChild;
		this.noOfDays = noOfDays;

	}

	@Override
	public double calculateTotalCruisePrice(String cruiseSelected) {

		double totalCruisePrice = 0.0;
		System.out.println("Scenic cruise have Spa for $50 per person,Do you want to pre-book ?");
		String isSpaNeed = sc.next();

		double cruisePriceAdults =priceAdult * numOfAdults * noOfDays;
		System.out.println("Scenic Cruise Adults                   @ " + numOfAdults + "  :$" + cruisePriceAdults);

		double cruisePriceChildren = priceChild * numOfChildren * noOfDays;
		System.out.println("Scenic Cruise Children above 5         @ " + numOfChildren + "  :$" + cruisePriceChildren);

		totalCruisePrice = cruisePriceAdults + cruisePriceChildren;
		if (isSpaNeed.equalsIgnoreCase("Yes")) {
			System.out.println("Spa booked for " + numOfAdults + " adults and " + numOfChildren + " children           :$"
					+ ((numOfAdults + numOfChildren) * 50));
			totalCruisePrice =	totalCruisePrice +((numOfAdults + numOfChildren) * 50);
		}

		return totalCruisePrice;
	}

}
