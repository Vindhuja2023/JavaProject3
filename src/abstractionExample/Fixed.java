package abstractionExample;

public class Fixed implements RevenueCalculate{

	private static double FIXED_RATE = 800;
	@Override
	public double calculate(ClientEngagement cl) {
	
		return FIXED_RATE;
	}

}
