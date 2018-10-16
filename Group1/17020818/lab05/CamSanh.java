package lab05;

public class CamSanh extends QuaCam{
    protected double giaBan, soLuong;
    public CamSanh(String nguonGoc, String ngayNhap, double giaBan, double soLuong){
        super(nguonGoc, ngayNhap);
        setGiaBan(giaBan);
        setSoLuong(soLuong);
    }
    public double getGiaBan(){
        return giaBan;
    }
    public void setGiaBan(double giaBan){
        this.giaBan = giaBan;
    }
    public double getSoLuong(){
        return soLuong;
    }
    public void setSoLuong(double soLuong){
        this.soLuong = soLuong;
    }
    public double thanhTien() {
	    return giaBan * soLuong;
    }
	public static void main(String[] args) {
	    CamSanh camsanh = new CamSanh("Da Lat", "09/10/2018", 20000, 100);
		System.out.print(camsanh.thanhTien());
	}

}
