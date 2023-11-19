package BankAbstraction;

public class CreditScore implements EligiblityCheck {

	@Override
	public boolean CheckLoanEligibility(Clients client, boolean isEligible) {
		if (client.getCreditScore() > 500) {
			isEligible = true;
		} else {
			isEligible = false;
		}
		return isEligible;
	}

}
