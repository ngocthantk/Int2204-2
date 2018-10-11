package c1fruit;

public class QuaCam extends HoaQua{
	
	private int price;
	
	public QuaCam() {		
		setTree("Cay Cam");
		price = 0;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
}
