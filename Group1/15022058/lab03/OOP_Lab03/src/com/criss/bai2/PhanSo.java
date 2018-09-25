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

	// tìm ước chung lớn nhất nếu có để rút gọn phân số
	public int UCLN(int a, int b) {
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}

	// rút gọn phân số, thuận tiện cho tính toán
	public void rutGonPS() {
		int i = UCLN(this.getTuSo(), this.getMauSo());
		this.setTuSo(this.getTuSo() / i);
		this.setMauSo(this.getMauSo() / i);
	}

	public void Cong(PhanSo ps) {
		int ts = this.getTuSo() * ps.getMauSo() + ps.getTuSo() * this.getMauSo();
		int ms = this.getMauSo() * ps.getMauSo();
		PhanSo phansocong = new PhanSo(ts, ms);
		phansocong.rutGonPS();
		System.out.println("Tổng hai phân số = " + phansocong.tuSo + "/" + phansocong.mauSo);
	}

	public void Tru(PhanSo ps) {
		int ts = this.getTuSo() * ps.getMauSo() - ps.getTuSo() * this.getMauSo();
		int ms = this.getMauSo() * ps.getMauSo();
		PhanSo phansotru = new PhanSo(ts, ms);
		phansotru.rutGonPS();
		System.out.println("Hiệu hai phân số = " + phansotru.tuSo + "/" + phansotru.mauSo);
	}

	public void Nhan(PhanSo ps) {
		int ts = this.getTuSo() * ps.getTuSo();
		int ms = this.getMauSo() * ps.getMauSo();
		PhanSo phansonhan = new PhanSo(ts, ms);
		phansonhan.rutGonPS();
		System.out.println("Tích hai phân số = " + phansonhan.tuSo + "/" + phansonhan.mauSo);
	}

	public void Chia(PhanSo ps) {
		int ts = this.getTuSo() * ps.getMauSo();
		int ms = this.getMauSo() * ps.getTuSo();
		PhanSo phansochia = new PhanSo(ts, ms);
		phansochia.rutGonPS();
		System.out.println("Thương hai phân số = " + phansochia.tuSo + "/" + phansochia.mauSo);
	}

	// so sánh 2 phân số
	// tạo lớp phân số mới rồi tham chiếu tới các thuộc tính của phân số
	public boolean equals(PhanSo ps) {
		if (this.getTuSo() == ps.getTuSo() && this.getMauSo() == ps.getMauSo()) {
			System.out.println("It's true");
			return true;
		} else {
			System.out.println("It's false");
			return false;
		}
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

		// xác thực mẫu số của phân số hợp lệ
		if (ms1 == 0 && ms2 == 0) {
			System.out.print("Bạn đã nhập phân số không hợp lệ");
		} else {
			System.out.println("Phân số nhập vào là " + ps.getTuSo() + "/" + ps.getMauSo() + " và " + ps2.getTuSo()
					+ "/" + ps2.getMauSo());
			ps.rutGonPS();
			ps2.rutGonPS();
			System.out.println("Phân số rút gọn là " + ps.getTuSo() + "/" + ps.getMauSo() + " và " + ps2.getTuSo() + "/"
					+ ps2.getMauSo());
			ps.Cong(ps2);
			ps.Tru(ps2);
			ps.Nhan(ps2);
			ps.Chia(ps2);
			ps.equals(ps2);
		}

	}
}
