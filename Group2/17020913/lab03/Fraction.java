package week_3;
import java.util.Scanner;

public  class Fraction {
	public int numerator;
	public int denominator;
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	public static void main(String[] args) {

		// tao ps1
		Fraction p1 = new Fraction();
		// tao ps2
			p1.setFrac(-3, 5);
		
		Fraction p2 = new Fraction();
			p2.setFrac(3, -5);
		Fraction str= new Fraction();
		
		System.out.println("Tong 2 phan so la : " );p2.cong(p1);
		System.out.println("Hieu 2 phan so la : " );p2.tru(p1);
		System.out.println("Tich 2 phan so la : " );p2.nhan(p1);
		System.out.println("Thuong 2 phan so la : " );p2.chia(p1);
	
			
		}
		
	
	

public void setFrac(int a, int b) {
	//tu so
	this.numerator = a;
	// mau so
	this.denominator = b;}
	


	

public  void  cong(Fraction p1) {
	
	Fraction p3 = new Fraction();
	p3.denominator= p1.denominator*this.denominator;
	p3.numerator=p1.numerator*this.denominator+p1.denominator*this.numerator;
	// goi ham ucln
	Main uc= new Main();
	int ucln=uc.timUoc(p3.denominator, p3.numerator);
	if(p3.numerator/ucln * p3.denominator/ucln <0) 
		System.out.println(-Math.abs(p3.numerator/ucln) +"/" + Math.abs(p3.denominator/ucln));
	else if(p3.numerator/ucln * p3.denominator/ucln ==0) 
		System.out.println("0");
	else if(p3.numerator/ucln ==1 && p3.denominator/ucln ==1) 
		System.out.println("1");
	else
		if(p3.numerator/ucln <0 && p3.denominator/ucln <0)
			System.out.println(Math.abs(p3.numerator/ucln) +"/" + Math.abs(p3.denominator/ucln));
	else
	System.out.println(p3.numerator/ucln +"/"+p3.denominator/ucln);
	
	
};
public void  tru(Fraction p1) {
	Fraction p3 = new Fraction();
	p3.denominator= p1.denominator*this.denominator;
	p3.numerator=p1.numerator*this.denominator-this.numerator*p1.denominator;
	// goi ham ucln
	Main uc= new Main();
	int ucln=uc.timUoc(p3.denominator, p3.numerator);
	if(p3.numerator/ucln * p3.denominator/ucln <0) 
		System.out.println(-Math.abs(p3.numerator/ucln) +"/" + Math.abs(p3.denominator/ucln));
	else if(p3.numerator/ucln * p3.denominator/ucln ==0) 
		System.out.println("0");
	else if(p3.numerator/ucln ==1 && p3.denominator/ucln ==1) 
		System.out.println("1");
	else
		if(p3.numerator/ucln <0 && p3.denominator/ucln <0)
			System.out.println(Math.abs(p3.numerator/ucln) +"/" + Math.abs(p3.denominator/ucln));
	else
	System.out.println(p3.numerator/ucln +"/"+p3.denominator/ucln);
	
	
};
public  void  nhan(Fraction p1) {
	Fraction p3 = new Fraction();
	p3.denominator= p1.denominator*this.denominator;
	p3.numerator=p1.numerator*this.numerator;
	// goi ham ucln
	Main uc= new Main();
	int ucln=uc.timUoc(p3.denominator, p3.numerator);
	if(p3.numerator/ucln * p3.denominator/ucln <0) 
		System.out.println(-Math.abs(p3.numerator/ucln) +"/" + Math.abs(p3.denominator/ucln));
	else if(p3.numerator/ucln * p3.denominator/ucln ==0) 
		System.out.println("0");
	else if(p3.numerator/ucln ==1 && p3.denominator/ucln ==1) 
		System.out.println("1");
	else
		if(p3.numerator/ucln <0 && p3.denominator/ucln <0)
			System.out.println(Math.abs(p3.numerator/ucln) +"/" + Math.abs(p3.denominator/ucln));
	
	else
	System.out.println(p3.numerator/ucln +"/"+p3.denominator/ucln);
	
};
public  void  chia(Fraction p1) {
	Fraction p3 = new Fraction();
	p3.denominator= p1.denominator*this.numerator;
	p3.numerator=p1.numerator*this.denominator;
	// goi ham ucln
	Main uc= new Main();
	int ucln=uc.timUoc(p3.denominator, p3.numerator);
	if(p3.numerator/ucln * p3.denominator/ucln <0) 
		System.out.println(-Math.abs(p3.numerator/ucln) +"/" + Math.abs(p3.denominator/ucln));
	else if(p3.numerator/ucln * p3.denominator/ucln ==0) 
		System.out.println("0");
	else if(p3.numerator/ucln ==1 && p3.denominator/ucln ==1) 
		System.out.println("1");
	else
		if(p3.numerator/ucln <0 && p3.denominator/ucln <0)
			System.out.println(Math.abs(p3.numerator/ucln) +"/" + Math.abs(p3.denominator/ucln));
		else
	System.out.println(p3.numerator/ucln +"/"+p3.denominator/ucln);
	
	
}
	
public boolean equals(Object obj) {
	if(this == obj)
		return true;
	if(obj instanceof Fraction)
	{
		Fraction p1 =(Fraction ) obj;
		return(this.numerator * p1.denominator == this.denominator* p1.numerator);
	}
	else return false;
	
}

}