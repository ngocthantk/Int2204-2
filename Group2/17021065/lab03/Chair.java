package tuan2;

public class Chair {
	private String mat; // vat lieu cau thanh
	private double S; // dien tich mat ghe
	private int foot; // so chan ghe
	private boolean back; // lung ghe
	private boolean arms; // tay vin
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	public double getS() {
		return S;
	}
	public void setS(double s) {
		S = s;
	}
	public int getFoot() {
		return foot;
	}
	public void setFoot(int foot) {
		this.foot = foot;
	}
	public boolean isBack() {
		return back;
	}
	public void setBack(boolean back) {
		this.back = back;
	}
	public boolean isArms() {
		return arms;
	}
	public void setArms(boolean arms) {
		this.arms = arms;
	}
}
