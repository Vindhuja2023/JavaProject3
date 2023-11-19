package BankAbstraction;

public class MonthlyWage implements EligiblityCheck {

	@Override
	public boolean CheckLoanEligibility(Clients client, boolean isEligible) {
		if (client.getMonthlyWage() > 5000) {
			isEligible = true;
		} else {
			isEligible = false;
		}
		return isEligible;

	}

}
