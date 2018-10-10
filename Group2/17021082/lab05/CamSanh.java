package CamSanh;

import hoaqua.HoaQua;

public class CamSanh extends HoaQua {
    public CamSanh(String ten, String nguon, String ngaynhap, Double gia) {
        super(ten, nguon, ngaynhap, gia);
    }
    public static void main(String[] args) {
        HoaQua q = new HoaQua("CamSanh", "VN", "4-12-1009", 32000.9);
        System.out.println(q.getTen());
        System.out.println(q.getNguon());
        System.out.println(q.getNgaynhap());
        System.out.println(q.getGia());
    }
}