package lab06;

public class Rectangle extends shape{
	protected int Chieudai,Chieurong;
	protected Point tam;
	public double getChieudai() {
		return Chieudai;
	}
	public void setChieudai(int chieudai) {
		Chieudai = chieudai;
	}
	public double getChieurong() {
		return Chieurong;
	}
	public void setChieurong(int chieurong) {
		Chieurong = chieurong;
	}
	public Point getTam() {
		return tam;
	}
	public void setTam(Point tam) {
		this.tam = tam;
	}
	
}
