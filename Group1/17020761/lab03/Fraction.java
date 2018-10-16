package chap03.oop;

public class Fraction {
	private int Num = 1;  //Numerator
	private int Deno = 1; // Denominator
	public int getNum() {
		return this.Num;
	}
	public void setNum(int x) {
		this.Num = x;
	}
	public int getDeno() {
		return this.Deno;
	}
	public void setDeno(int y) {
		this.Deno = y;
	}
	public void getIf() {
		System.out.println(this.Num + "/" + this.Deno);
	}
	public Fraction (int a, int b) {
		this.Num = a;
		this.Deno = b;
	}
	public Fraction(int a) {
		this.Num=a;
		this.Deno=1;
	}
	public Fraction() {
	}
	
//	tong 
	public Fraction sumF(Fraction y) {
		Fraction temp = new Fraction();
		temp.setNum((this.getNum()*y.getDeno()) + (y.getNum()*this.getDeno())) ;
		temp.setDeno(this.getDeno()*y.getDeno());
		temp.simplifyF();
		return temp;
	}
//	hieu
	public Fraction minusF(Fraction y) {
		Fraction minusFraction = new Fraction();
		minusFraction.setNum((this.getNum()*y.getDeno()) - (y.getNum()*this.getDeno())) ;
		minusFraction.setDeno(this.getDeno()*y.getDeno());
		minusFraction.simplifyF();
		return minusFraction;
	}
	
//	nhan	
	public Fraction mutiplyF(Fraction y) {
		Fraction mutiplyFraction = new Fraction();
		mutiplyFraction.setNum(this.getNum()*y.getNum()) ;
		mutiplyFraction.setDeno(this.getDeno()*y.getDeno());
		mutiplyFraction.simplifyF();
		return mutiplyFraction;
	}
	
//	chia
	public Fraction divisionF(Fraction y) {
		Fraction divisionFraction = new Fraction();
		divisionFraction.setNum(this.getNum()*y.getDeno()) ;
		divisionFraction.setDeno(this.getDeno()*y.getNum());
		divisionFraction.simplifyF();
		return divisionFraction;
	}
	public boolean equals(Object y) {
		if(y instanceof Fraction) {
			//so sanh xem y cos phai kieu fraction khong
			Fraction other = (Fraction) y;
			return((this.getNum()*other.getDeno())==(other.getNum()*this.getDeno()));
		}
		return false;
	}
	
	
//	ham rut gon phan so
	public void simplifyF() {
		int x = UCLN(this.getNum(),this.getDeno());
		this.setNum(this.getNum()/x);
		this.setDeno(this.getDeno()/x) ;
		
	}
//	tim UCLN
	public int UCLN(int a,int b) {
		if(a<0) {
			a=-a;
		} else if(b<0) {b=-b;}
		while(a!=b) {
			if(a>b) {
				a-=b;
			} else {
				b-=a;
			}
		}
		return a;
	}
}