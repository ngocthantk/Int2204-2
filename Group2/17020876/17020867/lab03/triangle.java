package triangle;

public class triangle {

	private int a;//cạnh
	private int b; //cạnh
	private int c;//cạnh
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
	public triangle() {
		this.setA(5);
		this.setB(7);
		this.setC(6);
	}
	//tính chu vi tam giác
	public int perimeter()
	{
		int perimeter=this.getA()+this.getB()+this.getC();
		return perimeter;
	}
	public static void main(String[] args) {
		triangle a = new triangle();
		System.out.println(a.perimeter());

	}

	

}
