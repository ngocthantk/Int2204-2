package lab03.java;

public class PhanSo {
	private int tu;
	private int mau;
	public PhanSo(int tu,int mau)
	{
		this.tu=tu;
		this.mau=mau;
	}
	public PhanSo()
	{
		this.tu=1;
		this.mau=1;
	}
	public void setTu(int tu)
	{
		this.tu=tu;
	}
	public void setMau(int mau)
	{
		this.mau=mau;
	}
	public int getTu() {
		return tu;
	}
	public int getMau() {
		return mau;
	}
	public PhanSo ADD(PhanSo a)
	{
		PhanSo b=new PhanSo();
		Bai01 test=new Bai01();
		b.tu=this.tu*a.mau+this.mau*a.tu;
		b.mau=this.mau*a.mau;
		int x=test.UCLN_(b.tu, b.mau);
		b.tu=b.tu/x;
		b.mau=b.mau/x;
		return b;
		
	}
	public PhanSo Minus(PhanSo a)
	{
		PhanSo b=new PhanSo();
		Bai01 test=new Bai01();
		b.tu=this.tu*a.mau-this.mau*a.tu;
		b.mau=this.mau*a.mau;
		int x=test.UCLN_(b.tu, b.mau);
		b.tu=b.tu/x;
		b.mau=b.mau/x;
		return b;
		
	}
	public PhanSo Mul(PhanSo a)
	{
		PhanSo b=new PhanSo();
		Bai01 test=new Bai01();
		b.tu=this.tu*a.tu;
		b.mau=this.mau*a.mau;
		int x=test.UCLN_(b.tu, b.mau);
		b.tu=b.tu/x;
		b.mau=b.mau/x;
		return b;
		
	}
	public PhanSo Div(PhanSo a)
	{
		int m=a.mau;
		int n=a.tu;
		//a.tu=a.mau;
		//a.mau=k;
		PhanSo b=new PhanSo();
		Bai01 test=new Bai01();
		b.tu=this.tu*m;
		b.mau=this.mau*n;
		int x=test.UCLN_(b.tu, b.mau);
		b.tu=b.tu/x;
		b.mau=b.mau/x;
		return b;
		
	}
     public boolean equals(Object obj)
     {
    	 if(this==obj) {return true;}
    	 if(obj instanceof PhanSo) {
    		 PhanSo ps1 = (PhanSo) obj;
    		 return(this.tu*ps1.mau==ps1.tu*this.mau);
    	 }
    	 return false;
     }

}
