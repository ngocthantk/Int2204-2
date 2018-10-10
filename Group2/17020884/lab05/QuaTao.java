package c1fruit;

public class QuaTao extends HoaQua{
	
	private int price;
	
	public QuaTao() {
		setTree("Cay Tao");
		price = 0;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
}
