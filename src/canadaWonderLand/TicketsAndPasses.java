package canadaWonderLand;

public class TicketsAndPasses {

	String typeOfUser;
	double finalTicketPrice = 0;

	public TicketsAndPasses(String typeOfUser) {
		this.typeOfUser = typeOfUser;
	}

	void displayTicketPriceses() {

		System.out.println("Displaying the admission type along with the price for Adults ");
		System.out.println("Kids under age 10 are eligible for a discount of 50% on given prices");
		// System.out.println("Employees of Canada's wonderland will get 10% discount on
		// the given prices for tickets");

		System.out.println("2023-24 Gold pass :" + TypeOfAdmission.SEASON_PASS.getPriceOfTicket());
		System.out.println("Daily pass :" + TypeOfAdmission.DAILY_TICKETS.getPriceOfTicket());
		System.out.println("Group pass for 4 :" + TypeOfAdmission.GROUPS.getPriceOfTicket());
	}

	double calculateTicketPrice(String typeOfUser, int age, String admissionType) {

		if (age <= 3) {
			System.out.println("You are allowed to enter without an admission ticket since you are a " + typeOfUser);
		} else if (3 <age && age <= 10) {
			System.out.println("Childers are eligible for 50% discount on normal ticket rate.");
			if (TypeOfAdmission.SEASON_PASS.getAdmissionType().equalsIgnoreCase(admissionType)) {

				finalTicketPrice = TypeOfAdmission.SEASON_PASS.getPriceOfTicket() * 0.5;
			} else if (TypeOfAdmission.DAILY_TICKETS.getAdmissionType().equalsIgnoreCase(admissionType)) {
				finalTicketPrice = TypeOfAdmission.DAILY_TICKETS.getPriceOfTicket() * 0.5;

			} else if (TypeOfAdmission.GROUPS.getAdmissionType().equalsIgnoreCase(admissionType)) {

				finalTicketPrice = TypeOfAdmission.GROUPS.getPriceOfTicket() * 0.5;
			}

			else {
				System.out.println("Invalid entry ");

			}
		} else {
			System.out.println("Above age 10 is considered as Adults.");
		}
		return finalTicketPrice;
	}

	double calculateTicketPrice(String typeOfUser, String admissionType) {

		if (TypeOfAdmission.SEASON_PASS.getAdmissionType().equalsIgnoreCase(admissionType)) {

			finalTicketPrice = TypeOfAdmission.SEASON_PASS.getPriceOfTicket();
		} else if (TypeOfAdmission.DAILY_TICKETS.getAdmissionType().equalsIgnoreCase(admissionType)) {
			finalTicketPrice = TypeOfAdmission.DAILY_TICKETS.getPriceOfTicket();

		} else if (TypeOfAdmission.GROUPS.getAdmissionType().equalsIgnoreCase(admissionType)) {

			finalTicketPrice = TypeOfAdmission.GROUPS.getPriceOfTicket();
		}

		else {
			System.out.println("Invalid entry ");

		}
		return finalTicketPrice;
	}

	double calculateTicketPrice( String admissionType) {

		if (TypeOfAdmission.SEASON_PASS.getAdmissionType().equalsIgnoreCase(admissionType)) {

			finalTicketPrice = TypeOfAdmission.SEASON_PASS.getPriceOfTicket() * 0.1;
		} else if (TypeOfAdmission.DAILY_TICKETS.getAdmissionType().equalsIgnoreCase(admissionType)) {
			finalTicketPrice = TypeOfAdmission.DAILY_TICKETS.getPriceOfTicket() * 0.1;

		} else if (TypeOfAdmission.GROUPS.getAdmissionType().equalsIgnoreCase(admissionType)) {

			finalTicketPrice = TypeOfAdmission.GROUPS.getPriceOfTicket() * 0.1;
		}

		else {
			System.out.println("Invalid entry ");

		}
		return finalTicketPrice;
	}

	public enum TypeOfAdmission {

		SEASON_PASS("2023-24 Gold pass", 99), DAILY_TICKETS("Daily pass", 49), GROUPS("Group pass for 4", 149);

		String admissionType;
		int priceOfTicket;

		TypeOfAdmission(String ticketType, int price) {

			admissionType = ticketType;
			priceOfTicket = price;
		}

		String getAdmissionType() {
			return admissionType;
		}

		int getPriceOfTicket() {
			return priceOfTicket;
		}
	}

}
