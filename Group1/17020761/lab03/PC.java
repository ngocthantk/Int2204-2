package chap03.oop;

public class PC {
	private String core ="I7 5th Gen";
	private String ram = "4 x 4GB";
	private String cardGraphics = "Geforce GTX 1080 Ti"; // card màn hình
	private String radiators = ""; // tản nhiệt
	public String getcore() {
		return this.core;
	}
	public String getRam() {
		return this.ram;
	}
	public String getCard() {
		return this.cardGraphics;
	}
	public String getRaditors() {
		return this.radiators;
	}
	public void setCore(String a) {
		this.core = a;
	}
	public void setRam(String a) {
		this.ram = a;
	}
	public void setCard(String a) {
		this.cardGraphics = a;
	}
	public void setRaditors(String a) {
		this.radiators = a;
	}
	public void getInfo() {
		System.out.println("PC INFO :");
		System.out.println("- Core\t\t: "+ this.core);
		System.out.println("- Ram \t: "+ this.ram);
		System.out.println("- Screen \t: "+ this.cardGraphics);
		System.out.println("- Weight \t: "+ this.radiators);
	}
}
