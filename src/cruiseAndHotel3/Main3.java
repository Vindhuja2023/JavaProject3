package cruiseAndHotel3;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char confirmSelection = 0;
		int selected = 0;
		char changeInfo = 0;
		char PreBookService = 0;

		String welcomeMessage = "Welcome,Please sign up  to book a Cruise or Hotel.";
		User3 userStart = new User3(welcomeMessage);
		User3 user = null;
		boolean isLogInSucess = userStart.userLogIn();
		if (isLogInSucess) {

			do {
				System.out.println("Select the option you want to book. 1.Cruise 2.Hotel");
				int selectBookingType = sc.nextInt();
				switch (selectBookingType) {
				case 1:

					// Cruise3 cruise = null;

					do {
						System.out.println(
								"We offer 4 different packages as displayed as below.Please enter the cruise that you want to select. ");

						System.out.println("1.Scenic Cruise" + "\n" + "2.Sunset Cruise" + "\n" + "3.Discovery Cruise"
								+ "\n" + "4.Mystery Cruise");
						selected = sc.nextInt();
						switch (selected) {
						case 1:
							user = new ScenicCruise3("Scenic Cruise", 43.99, 12.99, 3);

							break;
						case 2:
							user = new SunsetCruise3("Sunset Cruise", 52.99, 15.99, 1);

							break;
						case 3:
							user = new DiscoveryCruise3("Discovery Cruise", 39.99, 9.99, 4);

							break;
						case 4:
							user = new MysteryCruise3("Mystery Cruise", 45.99, 12.99, 2);

							break;

						default:
							System.out.println("Invalid entry for selecting Cruise.");
							break;
						}

						System.out.println(
								"Please press Y if you want to continue with the selection or press any other alphabet to select another.");
						confirmSelection = sc.next().charAt(0);
					} while (confirmSelection != 'Y');

					if (user instanceof Cruise3) {
						Cruise3 cruise = (Cruise3) user;

						user.userDetails();
						String preBookFood = cruise.foodSelection();
						double totalCruisePrice = cruise.calculateTotalCruisePrice(cruise.cruiseName);
						double totalFoodPrice = cruise.calculateFoodBill(preBookFood);
						System.out.println("Final price                                 :$"
								+ cruise.calculateFinalBill(totalCruisePrice, totalFoodPrice));
					}

					break;
				case 2:
					// Hotel3 hotel = null;

					do {
						System.out.println(
								"Please enter the room you want to select.  1.Delux suite:accommodates 2 adults & 2 children at $180/night"
										+ "2.Family suite:accommodates 4 adults & 4 children at $230/night.");
						selected = sc.nextInt();

						switch (selected) {
						case 1:
							user = new DeluxSuite("Delux suite", 2, 2, 180);
							break;
						case 2:
							user = new FamilySuite("Family suite", 4, 4, 230);
							break;

						default:
							System.out.println("Invalid entry for Hotel room selection.");
							break;
						}
						System.out.println(
								"Please press Y if you want to continue with the selection or press any other alphabet to select another.");
						confirmSelection = sc.next().charAt(0);
					} while (confirmSelection != 'Y');

					if (user instanceof Hotel3) {
						Hotel3 hotel = (Hotel3) user;
						user.userDetails();
						boolean isRoomSuitable = hotel.checRoomSuitable();
						if (isRoomSuitable) {
							hotel.selectingDaysAndLunch();
							hotel.calculateRoomRate();
							hotel.calculateFinalBill();
						}
					}
					break;

				default:
					System.out.println("Invalid entry for booking services.");
					break;
				}
				System.out.println("Do you want to book another Hotel room or Cruise?Y/N");
				PreBookService = sc.next().charAt(0);
			} while (PreBookService == 'Y');

			System.out.println(
					"Do you want to change your personal information.Please press Y to change.Press any other alphabet to exit.");
			changeInfo = sc.next().charAt(0);
			if (changeInfo == 'Y') {
				System.out.println("Please enter the information you want to change." + "\n" + "1.Password" + "\n"
						+ "2.Phone number" + "\n" + "3.Email");
				int select = sc.nextInt();
				switch (select) {
				case 1:
					user.setPassword();

					break;
				case 2:
					user.setPhoneNumber();
					break;
				case 3:
					user.setEmailId();
					break;

				default:
					break;
				}

			}
			System.out.println("Thank you for using the service!");

		} else {
			System.out.println("Log in failed,Incorrect email id or password.");
		}
		sc.close();

	}
}