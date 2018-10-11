package QuaTao;

import hoaqua.HoaQua;

public class QuaTao extends HoaQua {
    public QuaTao(String ten, String nguon, String ngaynhap, Double gia) {
        super(ten, nguon, ngaynhap, gia);
    }
    public static void main(String[] args) {
        HoaQua q = new HoaQua("Tao", "VN", "2-12-1009", 22000.9);
        System.out.println(q.getTen());
        System.out.println(q.getNguon());
        System.out.println(q.getNgaynhap());
        System.out.println(q.getGia());
    }
}