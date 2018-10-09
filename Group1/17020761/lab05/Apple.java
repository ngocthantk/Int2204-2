package chap05.oop;

public class Apple extends HoaQua{
	private int Number = 1;
	protected String taste ;
	public int getNumber() {
		return this.Number;
	}
	public void setNumber(int a) {
		this.Number = a;
	}
	public String getTaste() {
		return this.taste;
	}
	public void setTaste(String s) {
		this.taste= s;
	}
}
