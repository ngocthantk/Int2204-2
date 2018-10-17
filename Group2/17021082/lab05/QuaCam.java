package QuaCam;

import hoaqua.HoaQua;

public class QuaCam extends HoaQua {
    public QuaCam(String ten, String nguon, String ngaynhap, Double gia) {
        super(ten, nguon, ngaynhap, gia);
    }
    public static void main(String[] args) {
        HoaQua q = new HoaQua("Cam", "VN", "1-12-1009", 12000.9);
        System.out.println(q.getTen());
        System.out.println(q.getNguon());
        System.out.println(q.getNgaynhap());
        System.out.println(q.getGia());
    }
}