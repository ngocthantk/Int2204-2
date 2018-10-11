
    public class CamSanh extends Cam{
    String nguongoc;
    String giaban;
     public CamSanh(String ten, String nguongoc, String loai) {
        super(ten, nguongoc, loai);
        
    }
     
    public void setNguonGoc(String NguonGoc) {
        this.nguongoc = NguonGoc;
    }
    public String getNguonGoc() {
        return nguongoc;
    }
    
    public void setGiaBan(String GiaBan) {
        this.giaban = giaban;
    }
    public String getGiaBan() {
        return giaban;
    }
 }
