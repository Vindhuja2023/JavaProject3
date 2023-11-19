package abstractionExample;

public class Hourly implements RevenueCalculate{
	
	private static double HOURLY_PRICE = 50;

	@Override
	public double calculate(ClientEngagement engagement) {
	
		return HOURLY_PRICE*engagement.getHoursWorked();
	}

}
