import java.util.Scanner;

public class PhanSo {
	private int Tuso;
	private int Mauso;
//ham khoi tao 	
	public int getTuso() {
		return Tuso;
	}
	public int getMauso() {
		return Mauso;
	}
//ham nhap phan so
	public void setPhanSo() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap tu so = ");
        int x = input.nextInt();
        System.out.print("Nhap mau so = ");
        int y = input.nextInt();
	this.Tuso = x;
	this.Mauso = y;
	}
//ham tim uoc chung lon nhat
	public int USCLN(int Tuso, int Mauso) {
        if (Mauso == 0) 
            return Tuso;
        return USCLN(Mauso, Tuso % Mauso);
    }
//ham toi gian phan so
	public void ToiGianPS(PhanSo p) {
		int c = USCLN(p.Tuso, p.Mauso);
		p.Tuso = p.Tuso/c;
		p.Mauso = p.Mauso/c;
		if(p.Mauso < 0) {
			p.Tuso = -p.Tuso;
			p.Mauso = -p.Mauso;
		}
	}
//ham cong phan so	
	public void CongPhanSo(PhanSo p)
	{
		PhanSo p1 = new PhanSo();
		p1.Tuso = this.Tuso*p.Mauso + p.Tuso*this.Mauso;
		p1.Mauso = this.Mauso*p.Mauso;
		ToiGianPS(p1);
		System.out.println(this.Tuso + "/" + this.Mauso + " + " + p.Tuso + "/" + p.Mauso + " = " + p1.Tuso + "/" + p1.Mauso);
	}
//ham tru phan so	
	public void TruPhanSo(PhanSo p)
	{
		PhanSo p1 = new PhanSo();
		p1.Tuso = this.Tuso*p.Mauso - p.Tuso*this.Mauso;
		p1.Mauso = this.Mauso*p.Mauso;
		ToiGianPS(p1);
		System.out.println(this.Tuso + "/" + this.Mauso + " - " + p.Tuso + "/" + p.Mauso + " = " +  p1.Tuso + "/" + p1.Mauso);
	}
//ham nhan han so
	public void NhanPhanSo(PhanSo p)
	{
		PhanSo p1 = new PhanSo();
		p1.Tuso = this.Tuso*p.Tuso;
		p1.Mauso = this.Mauso*p.Mauso;
		ToiGianPS(p1);
		System.out.println(this.Tuso + "/" + this.Mauso + " * " + p.Tuso + "/" + p.Mauso + " = " + p1.Tuso + "/" + p1.Mauso);
	}
//ham chia phan so	
	public void ChiaPhanSo(PhanSo p)
	{
		PhanSo p1 = new PhanSo();
		p1.Tuso = this.Tuso*p.Mauso;
		p1.Mauso = this.Mauso*p.Tuso;
		ToiGianPS(p1);
		System.out.println(this.Tuso + "/" + this.Mauso + " / " + p.Tuso + "/" + p.Mauso + " = " + p1.Tuso + "/" + p1.Mauso);
	}
//ham so sanh phan so
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
                if (obj instanceof PhanSo ) {
                    PhanSo p1 = (PhanSo) obj;
			return(this.Tuso*p1.Mauso == this.Mauso*p1.Tuso);
            }
		else
			return false;
	}
//ham in ket qua so sanh
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