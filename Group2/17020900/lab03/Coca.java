package minh.dim;

public class Coca {
	private int price;
	private String weight;
	private String loai;
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getWeight() {
		return this.weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getLoai() {
		return this.loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public Coca(int x, String y , String z) {
		this.price = x;
		this.weight = y;
		this.weight = z;
	}
	public void xuat() {
		System.out.println(this.price + " " + this.weight + " "  + this.loai);
	}
	public static void main(String[] args) {
		Coca c = new Coca(500, "xyz", "abc");
		c.xuat();
	}

}
