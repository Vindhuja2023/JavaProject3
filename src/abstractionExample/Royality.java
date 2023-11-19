package abstractionExample;

public class Royality implements RevenueCalculate{
private static double PERCENTAGE = 0.145;
	@Override
	public double calculate(ClientEngagement engagement) {
		
		return PERCENTAGE*engagement.getAnticipatedRevnue();
	}

}
