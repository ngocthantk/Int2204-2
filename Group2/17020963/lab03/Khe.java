public class Khe {
	private String name;
	private String color;
	private String shape;
	private String taste;
	
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public String getShape() {
		return shape;
	}
	public String getTaste() {
		return taste;
	}
//
	public void setName(String name) {
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
//
	public void MyKhe() {
		this.name = "Qua Khe";
		this.color = "mau vang";
		this.shape = "hinh sao, co nam mui";
		this.taste = "vi ngot, co qua chua";
	}
//	
	public void Print() {
		System.out.println(this.name + ": " + this.color + " co "+ this.shape + " " + this.taste);
	}
//
	public static void main(String[] args) {
		Khe fruit = new Khe();
		fruit.MyKhe();
		fruit.Print();
	}
}