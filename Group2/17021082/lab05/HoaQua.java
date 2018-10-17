package hoaqua;
public class HoaQua {
    String ten;
    String nguon;
    String ngaynhap;
    Double gia;
    public String getNguon() {
        return nguon;
    }
    public String getTen() {
        return ten;
    }
    public HoaQua(String ten, String nguon, String ngaynhap, Double gia) {
        this.ten = ten;
        this.nguon = nguon;
        this.gia = gia;
        this.ngaynhap = ngaynhap;
    }
    public String getNgaynhap() {
        return ngaynhap;
    }
    public Double getGia() {
        return gia;
    }
}
