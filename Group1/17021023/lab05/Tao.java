
 public class Tao extends HoaQua{
     String Loai;
     public Tao(String ten, String nguongoc, String loai) {
        super(ten, nguongoc);
        this.Loai = loai;
    }
     
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getTen() {
        return ten;
    }
    
    public void setNguonGoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }
    public String getNguonGoc() {
        return nguongoc;
    }
    
    public void setLoai(String Loai) {
        this.Loai = Loai;
    }
    public String getLoai() {
        return Loai;
    } 
}
