package minh.dim;

public class PS {
	private int tuso, mauso; // thuộc tính của lớp PS
	public PS(int x,int y) {  // khoitao constructor có đối số
		this.tuso = x;
		this.mauso = y;
	}
	public int UCLL(int x,int y) {
		int n = 1;
		int X = Math.abs(x);
		for(int i = 1;i <= X;i++) {
			if(X % i == 0 && y % i == 0) {
				n = i;
			}
		}
		return n;
	}
	public void rutgon() {
		int c = UCLL(this.getTuSo(),this.getMauSo());
		this.setTuSO(this.getTuSo()/c);
		this.setMauSO(this.getMauSo()/c);
	}
	public void setTuSO(int tuso) {
		this.tuso = tuso;
	}
	public int getTuSo() {
		return this.tuso;
	}
	public void setMauSO(int mauso) {
		this.mauso = mauso;
	}
	public int getMauSo() {
		return this.mauso;
	}
	public void congphanso(PS phanso1) {    // phương thức cộng 2 phân số
		
		int tu = this.getTuSo()*phanso1.getMauSo() + phanso1.getTuSo()*this.getMauSo();
		int mau = phanso1.getMauSo()*this.getMauSo();
		PS phanso = new PS(tu, mau);
		phanso.rutgon();
		if(phanso.tuso == 0) {
			System.out.println("tổng 2 phân số " + 0);
		} else if(phanso.mauso == 1) {
			System.out.println("tổng 2 phân số " + phanso.tuso);
		} else {
			System.out.println("tổng 2 phân số " + phanso.tuso + "\\" + phanso.mauso);
		}
			
	}
	public void truphanso(PS phanso1 ) {    // phương thức trừ 2 phân số
		
		int mau = (phanso1.getMauSo()*this.getMauSo());
		int tu = (phanso1.getTuSo()*this.getMauSo() - this.getTuSo()*phanso1.getMauSo());
		PS phanso = new PS(tu, mau);
		phanso.rutgon();
		if(phanso.tuso == 0) {
			System.out.println("hiệu 2 phân số " + 0);
		} else if(phanso.mauso == 1) {
			System.out.println("hiệu 2 phân số " + phanso.tuso);
		} else {
			System.out.println("hiệu 2 phân số " + phanso.tuso + "\\" + phanso.mauso);
		}
	}
	public void nhanphanso(PS phanso1) {    // phương thức nhân 2 phân số
		
		int mau = (phanso1.getMauSo()*this.getMauSo());
		int tu = (phanso1.getTuSo()*this.getTuSo());
		PS phanso = new PS(tu, mau);
		phanso.rutgon();
		if(phanso.tuso == 0) {
			System.out.println("tích 2 phân số " + 0);
		} else if(phanso.mauso == 1) {
			System.out.println("tích 2 phân số " + phanso.tuso);
		} else {
			System.out.println("tích 2 phân số " + phanso.tuso + "\\" + phanso.mauso);
		}
	}
	public void chiaphanso(PS phanso1) {    // phương thức chia 2 phân số
		
		int mau = (phanso1.getMauSo()*this.getTuSo());
		int tu = (phanso1.getTuSo()*this.getMauSo());
		PS phanso = new PS(tu, mau);
		phanso.rutgon();
		if(phanso.tuso == 0) {
			System.out.println("chia 2 phân số " + 0);
		} else if(phanso.mauso == 1) {
			System.out.println("chia 2 phân số " + phanso.tuso);
		} else {
			System.out.println("chia 2 phân số " + phanso.tuso + "\\" + phanso.mauso);
		}
	}
	public boolean Equals(Object obj) {				// phương thức so sánh 2 phân số có bằng nhau hay không
		if(this == obj) {
			return true;
		} 
		if(obj instanceof PS) {
			PS phanso = (PS) obj;
			return (this.tuso*phanso.mauso == this.mauso*phanso.tuso);
		}
		return false;
	}
	public static void main(String[] args) {
		PS so1 = new PS(1, 4);      				// khởi tạo 2 đối tượng PS
		PS so2 = new PS(2, 4);
		so1.congphanso(so2);					
		so1.truphanso(so2);
		so1.nhanphanso(so2);
		so1.chiaphanso(so2);
		System.out.println(so1.Equals(so2));
	}

}
