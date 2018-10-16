package com.criss.bai1;

public class HoaQua {
	protected String ten;
	protected int giaTien;
	protected String nguonGoc;
	protected String ngayNhapHang;
	protected int soLuong;

	public HoaQua() {
		super();
	}

	public HoaQua(String ten, int giaTien, String nguonGoc, String ngayNhapHang, int soLuong) {
		super();
		this.ten = ten;
		this.giaTien = giaTien;
		this.nguonGoc = nguonGoc;
		this.ngayNhapHang = ngayNhapHang;
		this.soLuong = soLuong;
	}
	
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(int giaTien) {
		this.giaTien = giaTien;
	}

	public String getNguonGoc() {
		return nguonGoc;
	}

	public void setNguonGoc(String nguonGoc) {
		this.nguonGoc = nguonGoc;
	}

	public String getNgayNhapHang() {
		return ngayNhapHang;
	}

	public void setNgayNhapHang(String ngayNhapHang) {
		this.ngayNhapHang = ngayNhapHang;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	public String toString() {
		return "HoaQua [ten=" + ten + ", giaTien=" + giaTien + ", nguonGoc=" + nguonGoc + ", ngayNhapHang="
				+ ngayNhapHang + ", soLuong=" + soLuong + "]";
	}

	
}
