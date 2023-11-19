package cruiseAndHotel3;

public class Hotel3 extends User3 {

	String roomType;
	int maxNumAdultsAccomodate;
	int maxNumChildrenAccomodate;
	double roomRate;
	int lunchRateAdult = 25;
	int lunchRateChildren = 5;
	double taxAdd = 0.18;
	int noOfDays;
	String preBookLunch;
	double totalPrice = 0.0;

	public Hotel3(String roomType, int maxNumAdultsAccomodate, int maxNumChildrenAccomodate, double roomRate) {
		super();
		this.roomType = roomType;
		this.maxNumAdultsAccomodate = maxNumAdultsAccomodate;
		this.maxNumChildrenAccomodate = maxNumChildrenAccomodate;
		this.roomRate = roomRate;
	}

	boolean checRoomSuitable() {

		if ((numOfAdults > maxNumAdultsAccomodate) || (this.numOfChildren > maxNumChildrenAccomodate)) {
			System.out.println(roomType + "is not suitable for " + numOfAdults + "  Adults and " + this.numOfChildren
					+ " Children.");
			return false;
		} else {
			return true;

		}
	}

	void selectingDaysAndLunch() {

		System.out.println(
				"All rooms come with free breakfast.Do you want to add lunch in your room as well at a discounted pre-booking rate of $25/adult and $5/child?");
		preBookLunch = sc.next();
		System.out.println("Enter number of days of stay?");
		noOfDays = sc.nextInt();

	}

	void calculateRoomRate() {

		totalPrice = roomRate * noOfDays;
		System.out.println(roomType + "    @" + noOfDays + " nights  : $" + totalPrice);

		if (preBookLunch.equalsIgnoreCase("Yes")) {
			System.out.println(
					"Lunch pre-booked Special rate Adults  @" + numOfAdults + ": $" + (numOfAdults * lunchRateAdult));
			System.out.println("Lunch pre-booked Special rate Children  @" + numOfChildren + ": $"
					+ (numOfChildren * lunchRateChildren));
			totalPrice += totalPrice + (numOfAdults * lunchRateAdult) + (numOfChildren * lunchRateChildren);
		}
		System.out.println("Total price        :  $" + totalPrice);
	}

	void calculateFinalBill() {

		double hstAdded = taxAdd * totalPrice;
		System.out.println("HST    @ 18%     :  $" + hstAdded);
		System.out.println("Final price        :" + (hstAdded + totalPrice));

	}

}
