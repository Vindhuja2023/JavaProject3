package abstractionExample;

public class ClientEngagement {
	private String client;
	private int hoursWorked;
	private double anticipatedRevnue;
	
	public ClientEngagement(String client, int hoursWorked, double anticipatedRevnue) {
		this.client = client;
		this.hoursWorked = hoursWorked;
		this.anticipatedRevnue = anticipatedRevnue;
		
	}

	public String getClient() {
		return client;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public double getAnticipatedRevnue() {
		return anticipatedRevnue;
	}


	
}
