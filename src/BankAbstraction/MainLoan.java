package BankAbstraction;

import java.util.*;

public class MainLoan {

	public static void main(String[] args) {

		Clients[] clients = { new Clients("Riya", 668, 5000, false), new Clients("Alia", 489, 4000, true),
				new Clients("Laxmi", 770, 7000, false) };
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"How do you wanna check eligibilty for availing loan ? 1.Credit score check 2.Monthly wage check ");
		int modeOfCheck = sc.nextInt();
		switch (modeOfCheck) {
		case 1:
			System.out.println("People that are eligible for loan based on Credit score ");
			printEligibleCustomers(clients, new CreditScore());
			break;
		case 2:
			System.out.println("People that are eligible for loan based on Monthly wage");
			printEligibleCustomers(clients, new MonthlyWage());
			break;
		default:
			System.out.println("Invalid entry");
			break;
		}
		sc.close();	
	}

	public static void printEligibleCustomers(Clients[] clients, EligiblityCheck check) {
		boolean isEligibleForLoan = false;
		for (Clients client : clients) {
			isEligibleForLoan = check.CheckLoanEligibility(client, false);
			if (isEligibleForLoan) {
				System.out.println(client.getName());
			}

		}
	}
	
}