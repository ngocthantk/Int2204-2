package chap05.oop;

public class Orange extends HoaQua{
	private int Number = 1;
	protected String origin;
	protected String taste;
	public int getNumber() {
		return this.Number;
	}
	public void setNumber(int a) {
		this.Number = a;
	}
	public String getOrigin() {
		return this.origin;
	}
	public void setOrigin(String s) {
		this.origin = s;
	}
	public String getTaste() {
		return this.taste;
	}
	public void setTaste(String s) {
		this.taste= s;
	}
}
