package CamCaoPhong;

import hoaqua.HoaQua;

public class CamCaoPhong extends HoaQua {
    public CamCaoPhong(String ten, String nguon, String ngaynhap, Double gia) {
        super(ten, nguon, ngaynhap, gia);
    }
    public static void main(String[] args) {
        HoaQua q = new HoaQua("CamCaoPhong", "VN", "3-12-1009", 22000.9);
        System.out.println(q.getTen());
        System.out.println(q.getNguon());
        System.out.println(q.getNgaynhap());
        System.out.println(q.getGia());
    }
}