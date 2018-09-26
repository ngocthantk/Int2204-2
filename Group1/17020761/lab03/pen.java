package chap03.oop;

public class pen {
	private String specie="pencil";
	private String value = "5k";
	private String color = "red";
	
	public String getSpecie() {
		return this.specie;
	}
	public String getValue() {
		return this.value;
	}
	public void getSpecie(String a) {
		this.specie =a;
	}
	public void getValue(String a) {
		this.value = a;
	}
	public String getColor() {
		return this.color;
	}
	public void getColor(String a) {
		this.color =a;
	}
	public void getIf() {
		System.out.println("Money IF:");
		System.out.println("Specie \t :"+this.specie);
		System.out.print("Value \t :" +this.value );
		System.out.println("Color \t :"+this.color);
	}
}