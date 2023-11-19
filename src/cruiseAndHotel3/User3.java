package cruiseAndHotel3;

import java.util.Scanner;

public class User3 {

	Scanner sc = new Scanner(System.in);
	private String userName;
	private String emailId;
	private String password;
	private double phoneNumber;
	int numOfAdults;
	int numOfChildren;

	User3(String welcomeMessage) {
		System.out.println(welcomeMessage);

		userRegistration();

		System.out.println("Thank you for registering.");
	}

	User3() {

	}

	private void userRegistration() {
		System.out.println("Enter your email address.");
		this.emailId = sc.next();
		System.out.println("Enter the password that you want to use. ");
		this.password = sc.next();
		System.out.println("Enter your full name. ");
		this.userName = sc.next();
		System.out.println("Enter your phone number.");
		this.phoneNumber = sc.nextDouble();
	}

	boolean userLogIn() {
		boolean isLogInSuccess = false;
		System.out.println("Enter your email.");
		String email = sc.next();
		System.out.println("Enter your password.");
		String password = sc.next();
		if (this.emailId.equalsIgnoreCase(email) && (this.password.equals(password))) {
			isLogInSuccess = true;
		}
		return isLogInSuccess;
	}

	void userDetails() {

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

	public String getUserName() {
		return userName;
	}

	public void setPassword() {
		System.out.println("Enter your existing password");
		String oldPassword = sc.next();
		if (oldPassword.equals(password)) {
			System.out.println("Enter your new password");
			this.password = sc.next();
			System.out.println("Your password has been changed!");
		} else {
			System.out.println("Entered password do not match with existing password.");
		}
	}

	public void setPhoneNumber() {
		System.out.println("Enter your existing phone number");
		double oldPhonenumber = sc.nextInt();
		if (oldPhonenumber == (phoneNumber)) {
			System.out.println("Enter your new phone number");
			this.phoneNumber = sc.nextDouble();
			System.out.println("Your phone number has been changed!");
		} else {
			System.out.println("Entered phone number do not match with existing phone number.");
		}

	}

	public void setEmailId() {

		System.out.println("Enter your existing email id");
		String oldEmail = sc.next();
		if (oldEmail.equals(emailId)) {
			System.out.println("Enter your new email id");
			this.emailId = sc.next();
			System.out.println("Your email id has been changed!");
		} else {
			System.out.println("Entered email id do not match with existing email id.");
		}
	}
}
