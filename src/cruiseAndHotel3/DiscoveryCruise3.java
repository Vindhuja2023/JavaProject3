package cruiseAndHotel3;

public class DiscoveryCruise3 extends Cruise3 {
	String cruiseName;
	double priceAdult;
	double priceChild;
	int noOfDays;


	public DiscoveryCruise3(String cruiseName, double priceAdult, double priceChild, int noOfDays) {
		super(cruiseName, priceAdult, priceChild, noOfDays);
		this.cruiseName = cruiseName;
		this.priceAdult = priceAdult;
		this.priceChild = priceChild;
		this.noOfDays = noOfDays;

	}

	@Override
	public double calculateTotalCruisePrice(String cruiseSelected) {

		double totalCruisePrice = 0.0;

		System.out.println("Discovery cruise have adventure game for $50 per person ,Do you want to pre-book?");
		String isAdvGameOpted = sc.next();

		double cruisePriceAdults = priceAdult * numOfAdults * noOfDays;
		System.out.println("DiscoveryCruise Adults                   @ " + numOfAdults + "  :$" + cruisePriceAdults);

		double cruisePriceChildren = priceChild * numOfChildren * noOfDays;
		System.out.println("Discovery Children above 5         @ " + numOfChildren + "  :$" + cruisePriceChildren);

		totalCruisePrice = cruisePriceAdults + cruisePriceChildren;
		if (isAdvGameOpted.equalsIgnoreCase("Yes")) {
			System.out.println("Adventure game booked for " + numOfAdults + " adults and " + numOfChildren
					+ " children           :$" + ((numOfAdults + numOfChildren) * 50));
			totalCruisePrice = totalCruisePrice+((numOfAdults + numOfChildren) * 50);
		}

		return totalCruisePrice;
	}
}
