import java.util.Scanner;
public class Phanso {
    private int tu;
    private int mau;
    public int gettu(){
        return tu;
    }
    public int getmau(){
        return mau;
    }
    public void setPhanso(){
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhap tu so = ");
        int x = input.nextInt();
        System.out.print("Nhap mau so = ");
        int y = input.nextInt();
	this.tu = x;
	this.mau = y;
    }
    //ham tim uoc chung lon nhat
	public int UCLN(int tu, int mau) {
        if (mau == 0) return tu;
        return UCLN(mau, tu % mau);
    }
//ham toi gian phan so
	public void ToiGianPS(Phanso p) {
		int c = UCLN(p.tu, p.mau);
		p.tu = p.tu/c;
		p.mau = p.mau/c;
		if(p.mau < 0) {
			p.tu = -p.tu;
			p.mau = -p.mau;
		}
	}
//ham cong phan so	
	public void CongPhanso(Phanso p)
	{
		Phanso p1 = new Phanso();
		p1.tu = this.tu*p.mau + p.tu*this.mau;
		p1.mau = this.mau*p.mau;
		ToiGianPS(p1);
		System.out.println(this.tu + "/" + this.mau + " + " + p.tu + "/" + p.mau + " = " + p1.tu + "/" + p1.mau);
	}
//ham tru phan so	
	public void TruPhanso(Phanso p)
	{
		Phanso p1 = new Phanso();
		p1.tu = this.tu*p.mau - p.tu*this.mau;
		p1.mau = this.mau*p.mau;
		ToiGianPS(p1);
		System.out.println(this.tu + "/" + this.mau + " - " + p.tu + "/" + p.mau + " = " +  p1.tu + "/" + p1.mau);
	}
//ham nhan han so
	public void NhanPhanso(Phanso p)
	{
		Phanso p1 = new Phanso();
		p1.tu = this.tu*p.tu;
		p1.mau = this.mau*p.mau;
		ToiGianPS(p1);
		System.out.println(this.tu + "/" + this.mau + " * " + p.tu + "/" + p.mau + " = " + p1.tu + "/" + p1.mau);
	}
//ham chia phan so	
	public void ChiaPhanso(Phanso p)
	{
		Phanso p1 = new Phanso();
		p1.tu = this.tu*p.mau;
		p1.mau = this.mau*p.tu;
		ToiGianPS(p1);
		System.out.println(this.tu + "/" + this.mau + " / " + p.tu + "/" + p.mau + " = " + p1.tu + "/" + p1.mau);
	}
//ham so sanh phan so
	public boolean equals(Phanso p) {
		if(this.tu == p.tu && this.mau == p.mau)
			return true;
		else
			return false;
	}
//ham in ket qua so sanh
	public void PrintEquals(Phanso p)
	{
		if(equals(p))
			System.out.println("Hai phan so bang nhau");
		else
			System.out.println("Hai phan so khong bang nhau");
	}
//ham main
	public static void main(String[] args) {
		Phanso p = new Phanso();
		Phanso h = new Phanso();
		h.setPhanso();
		p.setPhanso();
		h.CongPhanso(p);
		h.TruPhanso(p);
		h.NhanPhanso(p);
		h.ChiaPhanso(p);
		h.equals(p);
		h.PrintEquals(p);
	}
	
}
