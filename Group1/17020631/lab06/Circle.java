package lab06;

public class Circle extends shape{
	protected double ban_kinh;
	protected Point I;// tọa độ tâm
	
	public double getBan_kinh() {
		return ban_kinh;
	}
	public void setBan_kinh(double ban_kinh) {
		this.ban_kinh = ban_kinh;
	}
	public Point getI() {
		return I;
	}
	public void setI(Point i) {
		I = i;
	}
	
}
