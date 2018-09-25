package chap03.oop;

public class laptop {
	private String firm ="Dell";
	private String core ="I5 7th Gen";
	private String ram = "4GB";
	private String screen = " 15.6\" 16:9 FHD (1920 x 1080) LED Backlight - AntiGlare";
	private String weight = "1.6kg";
	private String pin = "3 Cell";
	public String getFirm() {
		return this.firm;
	}
	public String getcore() {
		return this.core;
	}
	public String getRam() {
		return this.ram;
	}
	public String getScreen() {
		return this.screen;
	}
	public String getWeight() {
		return this.weight;
	}
	public void setFilm(String a) {
		this.firm = a;
	}
	public void setCore(String a) {
		this.core = a;
	}
	public void setRam(String a) {
		this.ram = a;
	}
	public void setScreen(String a) {
		this.screen = a;
	}
	public void setWeight(String a) {
		this.weight = a;
	}
	public void setPin(String a) {
		this.pin = a;
	}
	public String getPin() {
		return this.pin;
	}
	public void getInfo() {
		System.out.println("LAPTOP INFO :");
		System.out.println("- Firm\t\t: "+ this.firm);
		System.out.println("- Core\t\t: "+ this.core);
		System.out.println("- Ram \t: "+ this.ram);
		System.out.println("- Screen \t: "+ this.screen);
		System.out.println("- Weight \t: "+ this.weight);
		System.out.println("- Pin \t: "+ this.pin);
		
	}
}
