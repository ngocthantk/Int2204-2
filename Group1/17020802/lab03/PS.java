public class PS extends C1 {
	protected int tu, mau;
	public PS() {
		this.tu = 1;
		this.mau = 1;
	}
	public PS(int setTu, int setMau) {
		this.tu = setTu;
		this.mau = setMau;
	}
	// setter and getter thuoc tinh tu va mau
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
	// get PS 
	public void getPs() {
		int ucMax = uocchungMax(this.tu, this.mau);
		this.tu = this.tu / ucMax;
		this.mau = this.mau / ucMax;
		if (this.tu < 0 & this.mau < 0) {
			this.tu = -this.tu;
			this.mau = -this.mau;
		}
		if (this.tu > 0 & this.mau < 0) {
			this.tu = -this.tu;
			this.mau = -this.mau;
		}
	}
	// cong phan so
	public void addPs(PS a, PS b) {
		this.tu = a.getTu() * b.getMau() + b.getTu() * a.getMau();
		this.mau = a.getMau() * b.getMau();
		PS c = new PS(this.tu, this.mau);
		c.getPs();
		System.out.printf("Tong cua 2 so la: %s/%s\n", c.getTu(), c.getMau());
	}
	// tru phan so
	public void minusPs(PS a, PS b) {
		this.tu = a.getTu() * b.getMau() - b.getTu() * a.getMau();
		this.mau = a.getMau() * b.getMau();
		PS c = new PS(this.tu, this.mau);
		c.getPs();
		System.out.printf("Hieu cua 2 so la: %s/%s\n", c.getTu(), c.getMau());
	}
	// nhan phan so
	public void multiPs(PS a, PS b) {
		this.tu = a.getTu() * b.getTu();
		this.mau = a.getMau() * b.getMau();
		PS c = new PS(this.tu, this.mau);
		c.getPs();
		System.out.printf("Tich cua 2 so la: %s/%s\n", c.getTu(), c.getMau());
	}
	// chia phan so
	public void splitPs(PS a, PS b) {
		this.tu = a.getTu() * b.getMau();
		this.mau = a.getMau() * b.getTu();
		PS c = new PS(this.tu, this.mau);
		c.getPs();
		System.out.printf("Thuong cua 2 so la: %s/%s\n", c.getTu(), c.getMau());
	}
	// so sanh phan so
	public boolean equals(Object obj) {
		if (obj instanceof PS) {
			PS a = (PS) obj;
			if (this.tu == a.getTu() & this.mau == a.getMau()) {
				return true;
			}
		}
		return false;
	}
	// phuong thuc main
	public static void main(String[] args) {
		PS ps1 = new PS(-6, 5);
		PS ps2 = new PS(6, -5);
		ps1.getPs();
		ps2.getPs();
		PS c = new PS();
		c.addPs(ps1, ps2);
		c.minusPs(ps1, ps2);
		c.multiPs(ps2, ps2);
		c.splitPs(ps1,  ps2);
		System.out.print(ps1.equals(ps2));
	}
}
