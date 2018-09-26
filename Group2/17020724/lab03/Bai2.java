
public class PhanSo {
	private int tu;
	private int mau;
	//constructor - hàm tạo
	public PhanSo() {
		this.tu = 1;
		this.mau = 1;
	}
	//throws Exception: thông báo phương thức có thể ném ngoại lệ loại Exception
	public PhanSo(int tu, int mau) throws Exception{
		if(mau==0) throw new Exception(); //gọi 1 đối tượng mới, ném nó đến nơi gọi phương thức
			this.tu = tu;
			this.mau = mau;
	}
	//setter, getter
	public int getTu() {
		return tu;
	}
	public void setTu(int tu) {
		this.tu = tu;
	}
	public int getMau() {
		return mau;
	}
	public void setMau(int mau) {
		this.mau = mau;
	}
	public PhanSo cong (PhanSo ps) {
		PhanSo tong = new PhanSo();
		tong.tu = this.tu*ps.getMau() + this.mau*ps.getTu();
		tong.mau = this.mau*ps.getMau();
		tong.rutgon();
		return tong;
	}
	public PhanSo tru (PhanSo ps) {
		PhanSo hieu = new PhanSo();
		hieu.tu = this.tu*ps.getMau() - this.mau*ps.getTu();
		hieu.mau = this.mau*ps.getMau();
		hieu.rutgon();
		return hieu;
	}
	public PhanSo nhan (PhanSo ps) {
		PhanSo tich = new PhanSo();
		tich.tu = this.tu * ps.getTu();
		tich.mau = this.mau * ps.getMau();
		tich.rutgon();
		return tich;
	}
	public PhanSo chia (PhanSo ps) {
		PhanSo thuong = new PhanSo();
		thuong.tu = this.tu * ps.getMau();
		thuong.mau = this.mau * ps.getTu(); 
		thuong.rutgon();
		return thuong;
	}
	// tìm UCLN của 2 số  
	public int findGCD(int a, int b){
		a = Math.abs(a);
		b = Math.abs(b);
		if(b == 0) return a;		
		else 
	    	return findGCD(b, a%b);
	}
	// rút gọn tối giản phân số, nếu mẫu âm đưa về dạng -a/b
	public void rutgon() {
		int uc = findGCD(tu,mau);
		this.tu = getTu()/uc;
		this.mau = getMau()/uc;
		if(this.mau<0 ){
			this.tu *=(-1);
			this.mau *=(-1);
		}
	}
	// in ra màn hình
	public void print() {
		if(this.mau==1) {
			System.out.println(this.tu);
		}else if(this.tu==0) {
			System.out.println(0);
		}else
		System.out.printf("%d/%d\n",this.tu,this.mau);
	}
	// hàm so sánh 2 phân số
	public boolean equals(Object obj) {
		this.rutgon();
		if(this == obj)
			return true;
		if(obj instanceof PhanSo) {
			PhanSo ps = (PhanSo) obj;
			ps.rutgon();
			if(this.getTu()*ps.getMau() - this.getMau()*ps.getTu() == 0) {
				return true;
			}
		}
		return false;
	}
}

public class Main {
	public static void main(String[] args) {
		try{
			PhanSo ps1 = new PhanSo(-3,5);
			PhanSo ps2 = new PhanSo(3,-5);
			System.out.println(ps1.equals(ps2));
			PhanSo tong = ps1.cong(ps2);
			System.out.print("Tong = ");
			tong.print();
			PhanSo tru = ps1.tru(ps2);
			System.out.print("Hieu = ");
			tru.print();
			PhanSo tich = ps1.nhan(ps2);
			System.out.print("Tich = ");
			tich.print();
			PhanSo thuong = ps1.chia(ps2);
			System.out.print("Thuong = ");
			thuong.print();
		}
		catch(Exception e) {
			e.printStackTrace();// neu khong the khac phuc duoc loi thi in ra noi xay ra su co
		}
	}

}
