
public class Cam extends HoaQua{
     String Loai;
     public Cam(String ten, String nguongoc, String loai) {
        super(ten, nguongoc);
        this.Loai = loai;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getTen() {
        return this.ten;
    }
    
     public void setNguonGoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }
     public String getNguonGpc() {
        return this.nguongoc;
    }
     
     public void setLoai(String Loai) {
        this.Loai = Loai;
    }
     public String getLoai() {
        return Loai;
    }
}