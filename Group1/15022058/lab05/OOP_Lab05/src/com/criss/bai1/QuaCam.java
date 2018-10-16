package com.criss.bai1;

public class QuaCam extends HoaQua {
	protected String mauSac;

	public QuaCam(String ten, int giaTien, String nguonGoc, String ngayNhapHang, int soLuong, String mauSac) {
		super(ten, giaTien, nguonGoc, ngayNhapHang, soLuong);
		this.mauSac = mauSac;
	}

	public QuaCam() {
		super();
	}

	public String getMauSac() {
		return mauSac;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}

	@Override
	public String toString() {
		return "QuaCam [mauSac=" + mauSac + ", ten=" + ten + ", giaTien=" + giaTien + ", nguonGoc=" + nguonGoc
				+ ", ngayNhapHang=" + ngayNhapHang + ", soLuong=" + soLuong + "]";
	}
}
