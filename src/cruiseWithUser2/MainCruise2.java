package cruiseWithUser2;

import java.util.Scanner;

import cruise1.Cruise1;

public class MainCruise2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char confirmSelection = 0;
		String cruiseSelected = null;
		char changeInfo = 0;

		System.out.println("Welcome to Cruise.");
		User2 user = new User2();
		boolean isLogInSucess = user.userLogIn();
		if (isLogInSucess) {
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
					System.out.println("Final price                                 :$"
							+ cruise.calculateFinalBill(totalCruisePrice, totalFoodPrice));
				}
			}

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
			sc.close();
		} else {
			System.out.println("Log in failed,Incorrect email id or password.");
		}
	}
}
