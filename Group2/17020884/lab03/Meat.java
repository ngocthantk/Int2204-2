package obj;

public class Meat {
	private boolean editable;
	private int weight, price;
	
	public Meat() {
		editable = true;
		weight=0;
		price=0;
	}
	
	public Meat(int weight, int price) {
		this.weight=weight;
		this.price=price;
		editable=true;
	}
	
	public void setEditable (boolean editable) {
		this.editable=editable;
		if (!editable) price=0;
	}
	public void setWeight(int w) {
		weight=w;
	}
	public void setPrice(int p) {
		price=p;
	}
	
	public void checkMeat() {
		System.out.println("Editable: " + editable);
		System.out.println("Weight: " + weight);
		System.out.println("Price: " + price);
	}
	
}
