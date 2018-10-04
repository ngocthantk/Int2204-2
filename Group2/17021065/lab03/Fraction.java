package tuan2;

public class Fraction { // class phan so
	private int nume; // tu so
	private int deno; // mau so
	
	public int getNume() {
		return nume;
	}
	public void setNume(int nume) {
		this.nume = nume;
	}
	public int getDeno() {
		return deno;
	}
	public void setDeno(int deno) {
		this.deno = deno;
	}
// cau 2a:
	public Fraction() { // constructor
		this.setNume(1);
		this.setDeno(1);
	}
// cau 2b:
	public int GCD(int a, int b) { // ham tim uoc chung lon nhat
		int x;
		while(b!=0) {
		x=a%b;
		a=b;
		b=x;
		}
		return a;
	}
	public void Add(Fraction a) { // ham cong 2 phan so
		this.setNume(this.getNume()*a.getDeno() + a.getNume()*this.getDeno()); // tinh tu so
		this.setDeno(this.getDeno()*a.getDeno()); // tinh mau so
		// rut gon phan so
		int tmp = this.GCD(this.getNume(), this.getDeno()); 
		this.setNume(this.getNume()/tmp); 
		this.setDeno(this.getDeno()/tmp);
		System.out.println(this.getNume() + "/" + this.getDeno());
	}
	public void Sub(Fraction a) { // ham tru 2 phan so
		this.setNume(this.getNume()*a.getDeno() - a.getNume()*this.getDeno()); // tinh tu so
		this.setDeno(this.getDeno()*a.getDeno()); // tinh mau so
		// rut gon phan so
		int tmp = this.GCD(this.getNume(), this.getDeno()); 
		this.setNume(this.getNume()/tmp); 
		this.setDeno(this.getDeno()/tmp);
		System.out.println(this.getNume() + "/" + this.getDeno());
	}
	public void Multi(Fraction a) { // ham nhan 2 phan so
		this.setNume(this.getNume()*a.getNume()); // tinh tu so
		this.setDeno(this.getDeno()*a.getDeno()); // tinh mau so
		// rut gon phan so
		int tmp = this.GCD(this.getNume(), this.getDeno()); 
		this.setNume(this.getNume()/tmp); 
		this.setDeno(this.getDeno()/tmp);
		System.out.println(this.getNume() + "/" + this.getDeno());
	}
	public void Divi(Fraction a) { // ham chia 2 phan so
		this.setNume(this.getNume()*a.getDeno()); // tinh tu so
		this.setDeno(this.getDeno()*a.getNume()); // tinh mau so
		// rut gon phan so
		int tmp = this.GCD(this.getNume(), this.getDeno()); 
		this.setNume(this.getNume()/tmp); 
		this.setDeno(this.getDeno()/tmp);
		System.out.println(this.getNume() + "/" + this.getDeno());
	}
//cau 2c:
	public boolean equals(Object obj) { // ham so sanh 2 phan so
		if (this == obj) {  
	          return true;  
	      }  
	      if (obj instanceof Fraction) {  
	          Fraction f1 = (Fraction) obj;
	          return (this.getNume()*f1.getDeno() == this.getDeno()*f1.getNume());
	      }  
	      return false;  
	}
	public static void main (String[] args) {
		Fraction k1 = new Fraction();
		Fraction k2 = new Fraction();
		k1.setNume(15);
		k1.setDeno(7);
		k2.setNume(9);
		k2.setDeno(13);
		k1.Add(k2);
		k1.Sub(k2);
		k1.Multi(k2);
		k1.Divi(k2);
		System.out.println(k1.equals(k2));
	}
}
