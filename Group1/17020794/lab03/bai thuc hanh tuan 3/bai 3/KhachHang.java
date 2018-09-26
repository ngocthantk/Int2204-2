
public class KhachHang {
private String ten;
private int CMND;
private int soTien;
public void KhachHang(){
    this.ten="HT";
    this.CMND=0;
    this.soTien=0;
}
public String getTen(){
    return this.ten;
}
public int getCMND(){
    return this.CMND;
}
public int getsoTien(){
    return this.soTien;
}
public void setTen(String ten){
    this.ten=ten;
}
public void setCMND(int CMND){
    this.CMND=CMND;
}
public void setsoTien(int soTien){
    this.soTien=soTien;
}
public void rutTien(int tien){
    this.soTien-=tien;
}                                   // rút tiền vào tài khoản
public void napTien(int tien){
    this.soTien+=tien;               // nạp tiền khỏi tài khoản
}
}
