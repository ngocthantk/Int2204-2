package Bai02;

import java.util.Scanner;

public class PhanSo {
	protected int tuSo, mauSo;
	
	public void SetPhanSo(int tuSo, int mauSo) {
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}
	
	public int UCLN(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		while(a!=b) {
			if(a>b)	a = a-b;
			else b = b-a;
		}
		return a;
	}
	
	PhanSo congPhanSo(PhanSo a) {
		PhanSo b = new PhanSo();
		if(this.mauSo==a.mauSo) {
			b.tuSo = this.tuSo + a.tuSo;
			b.mauSo = this.mauSo;
		}
		else {
			int c = this.UCLN(this.mauSo, a.mauSo);
			b.tuSo = this.tuSo*(a.mauSo/c)+a.tuSo*(this.mauSo/c);
			b.mauSo = this.mauSo*a.mauSo/c;
		}
		return b;			
	}
	
	PhanSo truPhanSo(PhanSo a) {
		PhanSo b = new PhanSo();
		if(this.mauSo==a.mauSo) {
			b.tuSo = this.tuSo-a.tuSo;
			b.mauSo = this.mauSo;
		}
		else {
			int c = this.UCLN(this.mauSo, a.mauSo);
			b.tuSo = this.tuSo*(a.mauSo/c)-a.tuSo*(this.mauSo/c);
			b.mauSo = this.mauSo*a.mauSo/c;
		}
		return b;			
	}
	
	PhanSo nhanPhanSo(PhanSo a) {
		PhanSo b = new PhanSo();
		b.mauSo = this.mauSo*a.mauSo;
		b.tuSo = this.tuSo*a.tuSo;
		return b;
	}
	
	PhanSo chiaPhanSo(PhanSo a) {
		PhanSo b = new PhanSo();
		b.tuSo = this.tuSo*a.mauSo;
		b.mauSo = this.mauSo*a.tuSo;
		return b;
	}
	
	public boolean equals(Object obj) {
		if(this == obj)	return true;
		if(obj instanceof PhanSo) {
			PhanSo ps1 = (PhanSo)	obj;
			return(this.tuSo*ps1.mauSo == this.mauSo*ps1.tuSo);
		}
		else return false;
	}
	void display()
	{	
		if(this.tuSo*this.mauSo==0)
			System.out.println(0);
		else {
			int c = this.UCLN(this.tuSo, this.mauSo);
			this.tuSo = this.tuSo/c;
			this.mauSo = this.mauSo/c;
			if(this.tuSo==this.mauSo)
				System.out.println(1);
			else if(this.tuSo*this.mauSo<0)
				System.out.println(-Math.abs(this.tuSo)+"/"+Math.abs(this.mauSo));
			else if(this.tuSo*this.mauSo>0)
				System.out.println(Math.abs(this.tuSo)+"/"+Math.abs(this.mauSo));
		}
		
	}
	public static void main(String[] args) {
		PhanSo a = new PhanSo();
		PhanSo b = new PhanSo();
		Scanner check = new Scanner(System.in);
		System.out.print("Tử Số của a là : ");
		a.tuSo= check.nextInt();
		System.out.print("Mẫu Số của a là : ");
		a.mauSo = check.nextInt();
		System.out.print("Tử Số của b là : ");
		b.tuSo = check.nextInt();
		System.out.print("Mẫu Số của b là : ");
		b.mauSo = check.nextInt();
		System.out.print("Tổng 2 phân số là : ");
		a.congPhanSo(b).display();
		System.out.print("Hiệu 2 phân số là : ");
		a.truPhanSo(b).display();
		System.out.print("Tích 2 phân số là : ");
		a.nhanPhanSo(b).display();
		System.out.print("Thương 2 phân số là : ");
		a.chiaPhanSo(b).display();
		System.out.println(a.equals(b));
	}
}
