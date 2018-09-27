package com.criss.bai2;

import java.util.Scanner;

public class PhanSo {
	private int tuSo;
	private int mauSo;

	public PhanSo(int tuSo, int mauSo) {
		super();
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}

	public PhanSo() {
		super();
	}

	public int getTuSo() {
		return tuSo;
	}

	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}

	public int getMauSo() {
		return mauSo;
	}

	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}

	public void Cong(PhanSo ps) {
		int ts = this.getTuSo() * ps.getMauSo() + ps.getTuSo() * this.getMauSo();
		int ms = this.getMauSo() * ps.getMauSo();
		PhanSo phansocong = new PhanSo(ts, ms);
		System.out.println("Tổng hai phân số = " + phansocong.tuSo + "/" + phansocong.mauSo);
	}

	public void Tru(PhanSo ps) {
		int ts = this.getTuSo() * ps.getMauSo() - ps.getTuSo() * this.getMauSo();
		int ms = this.getMauSo() * ps.getMauSo();
		PhanSo phansotru = new PhanSo(ts, ms);
		System.out.println("Hiệu hai phân số = " + phansotru.tuSo + "/" + phansotru.mauSo);
	}

	public void Nhan(PhanSo ps) {
		int ts = this.getTuSo() * ps.getTuSo();
		int ms = this.getMauSo() * ps.getMauSo();
		PhanSo phansonhan = new PhanSo(ts, ms);
		System.out.println("Tích hai phân số = " + phansonhan.tuSo + "/" + phansonhan.mauSo);
	}

	public void Chia(PhanSo ps) {
		int ts = this.getTuSo() * ps.getMauSo();
		int ms = this.getMauSo() * ps.getTuSo();
		PhanSo phansochia = new PhanSo(ts, ms);
		System.out.println("Thương hai phân số = " + phansochia.tuSo + "/" + phansochia.mauSo);
	}

	public boolean equals(Object obj) {
		boolean isEqual = false;
		if (obj instanceof PhanSo) {
			PhanSo ps = (PhanSo) obj;
			if (Math.abs((((double) this.tuSo) / this.mauSo) - ((double) ps.tuSo) / ps.mauSo) < 0.00000001) {
				isEqual = true;
			} else {
				return false;
			}
		}
		return isEqual;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào tử số ps1 ");
		int ts1 = scanner.nextInt();
		System.out.print("Nhập vào mẫu số ps1 ");
		int ms1 = scanner.nextInt();
		System.out.print("Nhập vào tử số ps2 ");
		int ts2 = scanner.nextInt();
		System.out.print("Nhập vào mẫu số ps2 ");
		int ms2 = scanner.nextInt();
		System.out.println("-------------------------");
		PhanSo ps = new PhanSo(ts1, ms1);
		PhanSo ps2 = new PhanSo(ts2, ms2);
		if (ms1 == 0 || ms2 == 0) {
			System.out.print("Bạn đã nhập phân số không hợp lệ");
		} else {
			System.out.println("Phân số nhập vào là " + ps.getTuSo() + "/" + ps.getMauSo() + " và " + ps2.getTuSo()
					+ "/" + ps2.getMauSo());
			ps.Cong(ps2);
			ps.Tru(ps2);
			ps.Nhan(ps2);
			ps.Chia(ps2);
			ps.equals(ps2);
			System.out.println("So sánh 2 phân số: ");
			if (ps.equals(ps2) == true) {
				System.out.print("bằng nhau");
			} else {
				System.out.print("không bằng");
			}
		}
	}
}
