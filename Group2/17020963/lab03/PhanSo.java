import java.util.Scanner;

public class PhanSo {
	private int TuSo;
	private int MauSo;
//ham khoi tao 	
	public int getTuSo() {
		return TuSo;
	}
	public int getMauSo() {
		return MauSo;
	}
//ham nhap phan so
	public void setPhanSo() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap tu so = ");
        int x = input.nextInt();
        System.out.print("Nhap mau so = ");
        int y = input.nextInt();
		this.TuSo = x;
		this.MauSo = y;
	}
//ham tim uoc chung lon nhat
	public int USCLN(int TuSo, int MauSo) {
        if (MauSo == 0) return TuSo;
        return USCLN(MauSo, TuSo % MauSo);
    }
//ham toi gian phan so
	public void ToiGianPS(PhanSo p) {
		int c = USCLN(p.TuSo, p.MauSo);
		p.TuSo = p.TuSo/c;
		p.MauSo = p.MauSo/c;
		if(p.MauSo < 0) {
			p.TuSo = -p.TuSo;
			p.MauSo = -p.MauSo;
		}
	}
//ham cong phan so	
	public void CongPhanSo(PhanSo p)
	{
		PhanSo p1 = new PhanSo();
		p1.TuSo = this.TuSo*p.MauSo + p.TuSo*this.MauSo;
		p1.MauSo = this.MauSo*p.MauSo;
		ToiGianPS(p1);
		if(p1.TuSo == 0)
			System.out.println(this.TuSo + "/" + this.MauSo + " + " + p.TuSo + "/" + p.MauSo + " = " + p1.TuSo);
		else if(p1.TuSo == 1 && p1.MauSo == 1)
			System.out.println(this.TuSo + "/" + this.MauSo + " + " + p.TuSo + "/" + p.MauSo + " = " + p1.TuSo);
		else 
			System.out.println(this.TuSo + "/" + this.MauSo + " + " + p.TuSo + "/" + p.MauSo + " = " + p1.TuSo + "/" + p1.MauSo);
	}
//ham tru phan so	
	public void TruPhanSo(PhanSo p)
	{
		PhanSo p1 = new PhanSo();
		p1.TuSo = this.TuSo*p.MauSo - p.TuSo*this.MauSo;
		p1.MauSo = this.MauSo*p.MauSo;
		ToiGianPS(p1);
		if(p1.TuSo == 0)
			System.out.println(this.TuSo + "/" + this.MauSo + " - " + p.TuSo + "/" + p.MauSo + " = " + p1.TuSo);
		else if(p1.TuSo == 1 && p1.MauSo == 1)
			System.out.println(this.TuSo + "/" + this.MauSo + " - " + p.TuSo + "/" + p.MauSo + " = " + p1.TuSo);
		else 
			System.out.println(this.TuSo + "/" + this.MauSo + " - " + p.TuSo + "/" + p.MauSo + " = " + p1.TuSo + "/" + p1.MauSo);
	}
//ham nhan han so
	public void NhanPhanSo(PhanSo p)
	{
		PhanSo p1 = new PhanSo();
		p1.TuSo = this.TuSo*p.TuSo;
		p1.MauSo = this.MauSo*p.MauSo;
		ToiGianPS(p1);
		if(p1.TuSo == 0)
			System.out.println(this.TuSo + "/" + this.MauSo + " * " + p.TuSo + "/" + p.MauSo + " = " + p1.TuSo);
		else if(p1.TuSo == 1 && p1.MauSo == 1)
			System.out.println(this.TuSo + "/" + this.MauSo + " * " + p.TuSo + "/" + p.MauSo + " = " + p1.TuSo);
		else 
			System.out.println(this.TuSo + "/" + this.MauSo + " * " + p.TuSo + "/" + p.MauSo + " = " + p1.TuSo + "/" + p1.MauSo);
	}
//chia phan so	
	public void ChiaPhanSo(PhanSo p)
	{
		PhanSo p1 = new PhanSo();
		p1.TuSo = this.TuSo*p.MauSo;
		p1.MauSo = this.MauSo*p.TuSo;
		ToiGianPS(p1);
		if(p1.TuSo == 0)
			System.out.println(this.TuSo + "/" + this.MauSo + " / " + p.TuSo + "/" + p.MauSo + " = " + p1.TuSo);
		else if(p1.TuSo == 1 && p1.MauSo == 1)
			System.out.println(this.TuSo + "/" + this.MauSo + " / " + p.TuSo + "/" + p.MauSo + " = " + p1.TuSo);
		else 
			System.out.println(this.TuSo + "/" + this.MauSo + " / " + p.TuSo + "/" + p.MauSo + " = " + p1.TuSo + "/" + p1.MauSo);
	}
//so sanh phan so
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj instanceof PhanSo) {
			PhanSo phanso1 = (PhanSo) obj;
			return(this.TuSo*phanso1.MauSo == this.MauSo*phanso1.TuSo);
		}
		else
			return false;
	}
//in ket qua so sanh
	public void PrintEquals(PhanSo p)
	{
		if(equals(p))
			System.out.println("Hai phan so bang nhau");
		else
			System.out.println("Hai phan so khong bang nhau");
	}
//ham main
	public static void main(String[] args) {
		PhanSo p = new PhanSo();
		PhanSo h = new PhanSo();
		h.setPhanSo();
		p.setPhanSo();
		h.CongPhanSo(p);
		h.TruPhanSo(p);
		h.NhanPhanSo(p);
		h.ChiaPhanSo(p);
		h.equals(p);
		h.PrintEquals(p);
	}
	
}