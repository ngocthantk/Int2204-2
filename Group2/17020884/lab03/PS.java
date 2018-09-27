public class PS {
	private int tu, mau; // PS = tu/mau
	
	public PS () {
		tu=0;
		mau=1;
	}
	
	public PS (int tu, int mau) {
		this.tu=tu;
		if (mau==0) {
			mau=1;
			System.out.println("Invalid setting."); //can't divide by zero, auto set mau=1
		}
		this.mau=mau;
	}
	
	public void setPS(int tu, int mau) { // setter
		this.tu = tu;
		if (mau==0) {
			mau=1;
			System.out.println("Invalid setting."); //can't divide by zero, auto set mau=1
		}
		this.mau = mau;
	}
	
	public void setPS(PS newPS) { //setter using another PS
		this.tu = newPS.getTuPS();
		this.mau = newPS.getMauPS();
	}
	
	public int getTuPS() { //getter for tu
		return tu;
	}
	
	public int getMauPS() { //getter for mau
		return mau;
	}
	
	private void simplifide() { // simplifide PS
		Cal cal = new Cal();
		int temp = cal.gcd(tu, mau);
		tu /=temp;
		mau /=temp;
	}
	
	public void plus(PS a) { // +
		int mauso = a.getMauPS()*mau;
		int tuso = a.getTuPS()*mau + tu*a.getMauPS();
		tu=tuso;
		mau=mauso;
		simplifide();
	}
	public void minus(PS a) { //-
		int mauso = a.getMauPS()*mau;
		int tuso = - a.getTuPS()*mau + tu*a.getMauPS();
		tu=tuso;
		mau=mauso;
		simplifide();
	}
	public void multiply(PS a) { //*
		int mauso = a.getMauPS()*this.getMauPS();
		int tuso = a.getTuPS()*this.getTuPS();
		tu=tuso;
		mau=mauso;
		simplifide();
	}
	
	public void divide(PS a) { // :
		a.setPS(new PS(a.getMauPS(),a.getTuPS()));
		int mauso = a.getMauPS()*this.getMauPS();
		int tuso = a.getTuPS()*this.getTuPS();
		tu=tuso;
		mau=mauso;
		simplifide();
	}
	
	@Override
	public boolean equals (Object ps) { // 
		
		if (this == ps) return true;
		
		if (ps instanceof PS) {
			if (tu*((PS) ps).getMauPS()==((PS) ps).getTuPS()*mau)
			return true;
		}
		
		return false;
	}
	
}
