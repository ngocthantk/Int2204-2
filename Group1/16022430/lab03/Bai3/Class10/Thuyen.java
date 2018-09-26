//Khởi tạo class Thuyen
public class Thuyen{
    //Khởi tạo đối tượng kích thước, cân nặng
    private String kichthuoc;
	private int cannang;
    //Hàm bật bơi
    public void boi(){
        System.out.println("Luot tren mat nuoc");
    }
    //Hàm set giá trị cho kích thước
    void setKichthuoc(String n)
            {
                this.kichthuoc = n;
                
            }
     //Hàm set giá trị cho cân nặng
    void setCannang(int n)
            {
                this.cannang = n;
                
            }
    //Hàm lấy giá trị kích thước
    String getKichthuoc()
    {
        return this.kichthuoc;
    }
    //Hàm lấy cân nặng
    int getCannang()
	{
        return this.cannang;
    }
}