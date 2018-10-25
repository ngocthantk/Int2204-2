package lab06;

public class Circle extends shape{
	protected int ban_kinh=10;
	protected Point I;// tọa độ tâm
	
	public int getBan_kinh() {
		return ban_kinh;
	}
	public void setBan_kinh(int ban_kinh) {
		this.ban_kinh = ban_kinh;
	}
	public Point getI() {
		return I;
	}
	public void setI(Point i) {
		I = i;
	}
	
}
