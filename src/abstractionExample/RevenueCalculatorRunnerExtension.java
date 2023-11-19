package abstractionExample;

public class RevenueCalculatorRunnerExtension {

	public static void main(String[] args) {

		ClientEngagement[] engagments = { new ClientEngagement("TD", 70, 20000), new ClientEngagement("RBC", 45, 15000),
				new ClientEngagement("BMO", 60, 18000) };

		System.out.println("Fixed Fee");
		printRevenue(engagments, new Fixed());
		System.out.println("Hourly Fee");

		printRevenue(engagments, new Hourly());

		System.out.println("Royalty Fee");
		printRevenue(engagments, new Royality());

	}

	public static void printRevenue(ClientEngagement[] engagement, RevenueCalculate revnueCalculate) {
		double total = 0;

		for (ClientEngagement clientEngagement : engagement) {

			total = total + revnueCalculate.calculate(clientEngagement);

		}

		System.out.println(total);

	}
}