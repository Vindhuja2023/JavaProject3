package abstractionExample;

public class MainRevenueCalculatorRunner {

	public static void main(String[] args) {

		ClientEngagement engagement = new ClientEngagement("MacD", 12, 10000);
		RevenueCalculate cal = null;

		String modeOfPayement = "Hourly";
		switch (modeOfPayement) {

		case "Hourly":
			cal = new Hourly();
			double hourlyPrice = cal.calculate(engagement);
			System.out.println("The hourly price is " + hourlyPrice);
			break;

		case "Fixed":
			cal = new Fixed();
			double fixedPrice = cal.calculate(engagement);
			System.out.println("The fixed price is " + fixedPrice);
			break;

		case "Royality":
			cal = new Fixed();
			double royalityPrice = cal.calculate(engagement);
			System.out.println("The royality price is " + royalityPrice);
			break;

		default:
			System.out.println("Invalid entery for displaying Payment.");
			break;
		}

	}
}
