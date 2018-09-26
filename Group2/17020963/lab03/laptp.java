public class laptop {
	private String firm = "ASUS";
	private String core = "I5 8th Gen";
	private String ram =  "4GB";
	private String screen = " 15.6\" 16:9 FHD (1920 x 1080) LED Backlight - AntiGlare";
	private String weight = "1.6kg";
	private String pin = "3 Cell";
//	
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
	public String getPin() {
		return this.pin;
	}
//	
	public void setFilm(String firm) {
		this.firm = firm;
	}
	public void setCore(String core) {
		this.core = core;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public void Print() {
		System.out.println("LAPTOP INFO :");
		System.out.println("- Firm\t\t: "+ this.firm);
		System.out.println("- Core\t\t: "+ this.core);
		System.out.println("- Ram \t: "+ this.ram);
		System.out.println("- Screen \t: "+ this.screen);
		System.out.println("- Weight \t: "+ this.weight);
		System.out.println("- Pin \t: "+ this.pin);	
	}
//
	public static void main(String[] args) {
		laptop A = new laptop();
		A.Print();
	}
}