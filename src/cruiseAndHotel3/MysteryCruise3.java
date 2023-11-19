package cruiseAndHotel3;

public class MysteryCruise3 extends Cruise3 {
	String cruiseName;
	double priceAdult;
	double priceChild;
	int noOfDays;
	public MysteryCruise3(String cruiseName, double priceAdult, double priceChild, int noOfDays) {
		super(cruiseName, priceAdult, priceChild, noOfDays);
		this.cruiseName = cruiseName;
		this.priceAdult = priceAdult;
		this.priceChild = priceChild;
		this.noOfDays = noOfDays;
		
	}

	@Override
	public double calculateTotalCruisePrice(String cruiseSelected) {

		double totalCruisePrice = 0.0;
		System.out.println("Mystery cruise have Casino with entry fee $20per person,Do you want to pre-book ?");
		String isCasinoNeed = sc.next();

		double cruisePriceAdults = priceAdult * numOfAdults * noOfDays;
		System.out.println("Mystery Cruise Adults                   @ " + numOfAdults + "  :$" + cruisePriceAdults);

		double cruisePriceChildren = priceChild * numOfChildren * noOfDays;
		System.out.println("Mystery Cruise Children above 5         @ " + numOfChildren + "  :$" + cruisePriceChildren);
		totalCruisePrice = cruisePriceAdults + cruisePriceChildren;
		if (isCasinoNeed.equalsIgnoreCase("Yes")) {
			System.out.println("Casino entry booked for " + numOfAdults + " adults and " + numOfChildren
					+ " children            :$" + ((numOfAdults + numOfChildren) * 20));
			totalCruisePrice = 	totalCruisePrice+((numOfAdults + numOfChildren) * 20);
		}

		return totalCruisePrice;
	}
}
