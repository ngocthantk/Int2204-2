package chap03.oop;

public class car {
	private int numberPerson;
	private String firm="honda";
	private String madeIn="Viet Nam";
	private String rate = "20000$";
	private String horsePower = "6000r/m";// cong suat suoi
	public int getNumber() {
		return this.numberPerson;
	}
	public void setNumber(int a) {
		this.numberPerson = a;
	}
	public String getFirm() {
		return this.firm;
	}
	public String getMadeIn() {
		return this.madeIn;
	}
	public String getRate() {
		return this.rate;
	}
	public void setFirm(String a) {
		this.firm = a;
	}
	public void setMadeIn(String a) {
		this.madeIn = a;
	}
	public void setRate(String a) {
		this.rate = a;
	}
	public String getHorse() {
		return this.horsePower;
	}
	public void setHorse(String a) {
		this.horsePower = a;
	}
			
	public void getInfo() {
		System.out.println("Car Info : ");
		System.out.println("Firm\t\t : " + this.firm);
		System.out.println("Made In \t :" + this.madeIn);
		System.out.println("Number Person \t :" + this.numberPerson);
		System.out.println("Rate \t\t : " + this.rate);
		System.out.println("Horse Power \t\t : " + this.horsePower);
	}

}












