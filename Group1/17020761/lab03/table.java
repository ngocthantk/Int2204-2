package chap03.oop;

public class table {
	private String category="sofa";
	private String madeIn="Viet Nam";
	private String rate = "100$";
	public String getCategory() {
		return this.category;
	}
	public String getMadeIn() {
		return this.madeIn;
	}
	public String getRate() {
		return this.rate;
	}
	public void setCategory(String a) {
		this.category = a;
	}
	public void setMadeIn(String a) {
		this.madeIn = a;
	}
	public void setRate(String a) {
		this.rate = a;
	}
	
	public void getInfo() {
		System.out.println("Table Info : ");
		System.out.println("Category\t\t : " + this.category);
		System.out.println("Made In \t :" + this.madeIn);
		System.out.println("Rate \t\t : " + this.rate);
	}
}
