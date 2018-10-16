package com.criss.bai3;

public class LapTrinhVien {
	private String ten, noiCongTac, ngonNguLapTrinh;
	private int tuoi;
	/**
	 * @param ten
	 * @param noiCongTac
	 * @param ngonNguLapTrinh
	 */
	public LapTrinhVien(String ten, String noiCongTac, String ngonNguLapTrinh) {
		super();
		this.ten = ten;
		this.noiCongTac = noiCongTac;
		this.ngonNguLapTrinh = ngonNguLapTrinh;
	}
	/**
	 * 
	 */
	public LapTrinhVien() {
		super();
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getNoiCongTac() {
		return noiCongTac;
	}
	public void setNoiCongTac(String noiCongTac) {
		this.noiCongTac = noiCongTac;
	}
	public String getNgonNguLapTrinh() {
		return ngonNguLapTrinh;
	}
	public void setNgonNguLapTrinh(String ngonNguLapTrinh) {
		this.ngonNguLapTrinh = ngonNguLapTrinh;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	public void lapTrinh() {
		//code
	}
	
}
