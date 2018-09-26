package chap03.oop;

public class money {
	private String specie="polime";
	private String value = "500k";
	
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
	public void getIf() {
		System.out.println("Money IF:");
		System.out.println("Specie \t :"+this.specie);
		System.out.print("Value \t :" +this.value );
	}
}
