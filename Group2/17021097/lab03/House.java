package lab03.tu;

public class House {
	private int storey, length,width;
	public int getStorey() {
		return this.storey;
	}
	public void setStorey(int x) {
		this.storey = x;
	}
	public int getLength() {
		return this.length;
	}
	public void setLength(int x) {
		this.length = x;
	}
	public int getWidth() {
		return this.width;
	}
	public void setWidth(int x) {
		this.width = x;
	}
	public House(int x,int y,int z) {
		this.storey = x;
		this.length = y;
		this.width = z;
	}
	public void xuat() {
		System.out.println(this.storey + " " + this.length + " " + this.width);
	}
	public static void main(String[] args) 
	{

	}

}



