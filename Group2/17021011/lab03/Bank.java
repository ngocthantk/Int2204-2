package lab03;

public class Bank {
	private String name;
	private double rate;
	
	// Constructor
	public Bank(String name, double rate) {
		super();
		this.name = name;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	// Show Info
	public void showInfo() {
		System.out.println("Bank: " + this.name + "\nRate: " + this.rate);
	}
}
