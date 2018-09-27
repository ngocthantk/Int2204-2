
public class Sach {

    private String tenSach;            // tên sách
    private String theloai;             // loại sách
    private int soNgayMuon;             // số ngày đã mượn sách
    private int giathue;                // giá thuê của sách
    public void setTen(String ten){
        this.tenSach=ten;
    }
    public void setTheLoai(String theloai){
        this.theloai=theloai;
    }
    public void setSoNgayMuon(int soNgayMuon){
        this.soNgayMuon=soNgayMuon;
    }
    public void setGiaThue(int giathue){
        this.giathue=giathue;
    }
    public String getTen(){
        return this.tenSach;
    }
    public String getTheLoai(){
        return this.theloai;
    }
    public int getSoNgayMuon(){
        return this.soNgayMuon;
    }
    public int getGiaThue(){
        return this.giathue;
    }
    public Sach(String ten, String theloai, int ngay, int gia){
        this.tenSach=ten;
        this.giathue=gia;
        this.soNgayMuon=ngay;
        this.theloai=theloai;
    }
    public int giaTien(){
        return this.giathue*this.soNgayMuon;             // giá tiền trả khi thuê sách
    }
    public static void main(String[] args) {
        Sach s=new Sach("Toan", "SGK", 30, 1000);
        System.out.println(s.giaTien());
    }
    
}
