package circle;

public class circle {

	private int radius;//bán kính

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public circle() {
		this.setRadius(5);
	}
	//tính diện tích hình tròn
	public double acreage()
	{
		double acreage=this.getRadius()*this.getRadius()*3.14;
		return acreage;
	}
	public static void main(String[] args) {
		circle a =new circle();
		System.out.println("Radius " + a.getRadius());
		System.out.println("acreage " + a.acreage());

	}
}
