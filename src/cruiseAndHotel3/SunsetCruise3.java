package cruiseAndHotel3;

public class SunsetCruise3 extends Cruise3 {
	String cruiseName;
	double priceAdult;
	double priceChild;
	int noOfDays;
	
	public SunsetCruise3(String cruiseName, double priceAdult, double priceChild, int noOfDays) {
		super(cruiseName, priceAdult, priceChild, noOfDays);
		this.cruiseName = cruiseName;
		this.priceAdult = priceAdult;
		this.priceChild = priceChild;
		this.noOfDays = noOfDays;

	}

	@Override
	public double calculateTotalCruisePrice(String cruiseSelected) {

		double totalCruisePrice = 0.0;
		System.out.println("Sunset cruise offers candle light dinner for $50 per person,Do you want to pre-book?");
		String isCandleLightDinnerneed = sc.next();
		double cruisePriceAdults = priceAdult * numOfAdults * noOfDays;
		System.out.println("Sunset Cruise Adults                   @ " + numOfAdults + "  :$" + cruisePriceAdults);

		double cruisePriceChildren = priceChild * numOfChildren * noOfDays;
		System.out.println("Sunset Cruise Children above 5         @ " + numOfChildren + "  :$" + cruisePriceChildren);
		totalCruisePrice = cruisePriceAdults + cruisePriceChildren;
		if (isCandleLightDinnerneed.equalsIgnoreCase("Yes")) {
			System.out.println("Candle light dinner booked for " + numOfAdults + " adults and " + numOfChildren
					+ " children          :$" + ((numOfAdults + numOfChildren) * 45));
			totalCruisePrice = totalCruisePrice+((numOfAdults + numOfChildren) * 45);
		}

		return totalCruisePrice;
	}
}
