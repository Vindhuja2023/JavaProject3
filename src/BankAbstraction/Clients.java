package BankAbstraction;

public class Clients {

	private String name;
	private int creditScore;
	private double monthlyWage;
	private boolean isAlreadyHaveLoan;

	public Clients(String name, int creditScore, double monthlyWage, boolean isAlreadyHaveLoan) {
		super();
		this.name = name;
		this.creditScore = creditScore;
		this.monthlyWage = monthlyWage;
		this.isAlreadyHaveLoan = isAlreadyHaveLoan;
	}

	public String getName() {
		return name;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public double getMonthlyWage() {
		return monthlyWage;
	}

	public boolean isAlreadyHaveLoan() {
		return isAlreadyHaveLoan;
	}

}
