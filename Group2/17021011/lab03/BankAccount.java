package lab03;

public class BankAccount {
	private String name;
	private String password;
	private double balance;
	
	// Constructor
	public BankAccount(String name, String password) {
		this.name = name;
		this.password = password;
		this.balance = 0;
	}
	
	// Getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	// Methods
	public void deposit(double d) {
		balance += d;
	}
	
	public boolean withdraw(double d) {
		if(d > balance) {
			System.out.println("Fail");
			return false;
		}
		else {
			balance -= d;
			return true;
		}
	}
	
}
