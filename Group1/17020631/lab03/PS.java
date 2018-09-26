package lab03;

public class PS {
	private float tu,mau;
	// ham constructor
	
	public PS() {
		// constructor mac dinh
	}
	public PS(float tu, float mau) {
		this.tu=tu;
		this.mau=mau;
	}
	
	// ham set get
	public float getTu() {
		return tu;
	}

	public void setTu(float tu) {
		this.tu = tu;
	}

	public float getMau() {
		return mau;
	}

	public void setMau(float mau) {
		this.mau = mau;
	}
	//
	
	public PS cong(PS ps) {
		PS tong=new PS(); // (a/b+c/d)= (a*d+b*c)/(b*d)
		tong.tu= (this.tu*ps.mau)+(this.mau*ps.tu);
		tong.mau=this.mau*ps.mau;
		return tong;
	}
	public PS tru(PS ps) {
		PS tru=new PS();// (a/b+c/d)= (a*d-b*c)/(b*d)
		tru.tu=(this.tu*ps.mau)-(this.mau*ps.tu);
		tru.mau=this.mau*ps.mau;
		return tru;
	}
	public PS nhan(PS ps) {// (a/b* c/d)=(a*c)/(b*d)
		PS nhan=new PS();
		nhan.tu=this.tu*ps.tu;
		nhan.mau=this.mau*ps.mau;
		return nhan;
	}
	public PS chia(PS ps) {// (a/b* c/d)=(a*d)/(b*c)
		PS chia=new PS();
		chia.tu=this.tu*ps.tu;
		chia.mau=this.mau*ps.mau;
		return chia;
	}
	// phuong thuc so sanh 2 phan so 
	public boolean equals(PS b) {
		PS k=new PS();
		k=this.tru(b);
		if((k.tu>0&&k.mau<0)||(k.tu<0&&k.mau>0)) return true;
		return false ;
	}
}
