package com.criss.bai1;

public class QuaTao extends HoaQua {
	protected String mauSac;

	public QuaTao() {
		super();
	}

	public QuaTao(String ten, int giaTien, String nguonGoc, String ngayNhapHang, int soLuong, String mauSac) {
		super(ten, giaTien, nguonGoc, ngayNhapHang, soLuong);
		this.mauSac = mauSac;
	}

	public String getMauSac() {
		return mauSac;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}

	@Override
	public String toString() {
		return "QuaTao [mauSac=" + mauSac + ", ten=" + ten + ", giaTien=" + giaTien + ", nguonGoc=" + nguonGoc
				+ ", ngayNhapHang=" + ngayNhapHang + ", soLuong=" + soLuong + "]";
	}
}
