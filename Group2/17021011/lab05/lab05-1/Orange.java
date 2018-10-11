package lab05;

public class Orange extends Fruit {
	protected String dateImport;
	protected double price;
	
	// Constructor
	public Orange() {
		name = "Orange";
		color = "green";
		flavor = "sour";
		nutritional = "Vitamin C";
	}
	
	public Orange(String dateImport) {
		this();
		this.dateImport = dateImport;
	}



	// Setter, getter
	public String getDateImport() {
		return dateImport;
	}

	public void setDateImport(String dateImport) {
		this.dateImport = dateImport;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void doSomething() {
		System.out.println("Squeezing orange!");
	}
	
	public void showInfo() {
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Date Import: " + dateImport);
	}
	
}
