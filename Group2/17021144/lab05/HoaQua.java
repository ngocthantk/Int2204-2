<<<<<<< HEAD

package lap51;

public class HoaQua{    // khai báo các thuộc tính
    protected double gia;
    protected String goc;
    protected String nnhap;
    protected int sl;
    
    public HoaQua(){}  // khởi tạo ko có tham số
    public HoaQua(double gia, String goc, String nnhap, int sl){  // khởi tạo có tham số
        this.gia = gia;
        this.goc = goc;
        this.nnhap = nnhap;
        this.sl=sl;
    }   
    
    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getGoc() {
        return goc;
    }

    public void setGoc(String goc) {
        this.goc = goc;
    }

    public String getNnhap() {
        return nnhap;
    }

    public void setNnhap(String nnhap) {
        this.nnhap = nnhap;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
    public String print(){
        return "Gia ca: "+getGia()+" nghin/qua"+"\nNguon goc: "+getGoc()+"\nNgay nhap: "
                         +getNnhap()+"\nSo luong: "+getSl()+" qua\n";
    }
}
=======

package lap51;

public class HoaQua{    // khai báo các thuộc tính
    protected double gia;
    protected String goc;
    protected String nnhap;
    protected int sl;
    
    public HoaQua(){}  // khởi tạo ko có tham số
    public HoaQua(double gia, String goc, String nnhap, int sl){  // khởi tạo có tham số
        this.gia = gia;
        this.goc = goc;
        this.nnhap = nnhap;
        this.sl=sl;
    }   
    
    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getGoc() {
        return goc;
    }

    public void setGoc(String goc) {
        this.goc = goc;
    }

    public String getNnhap() {
        return nnhap;
    }

    public void setNnhap(String nnhap) {
        this.nnhap = nnhap;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
    public String print(){
        return "Gia ca: "+getGia()+" nghin/qua"+"\nNguon goc: "+getGoc()+"\nNgay nhap: "
                         +getNnhap()+"\nSo luong: "+getSl()+" qua\n";
    }
}
>>>>>>> 8698251a186993be093e172d03823408519eb608
