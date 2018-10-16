//Khởi tạo class ConMeo
public class Conmeo{
    //Khởi tạo đối tượng cân nặng
    private int cannang;
    //Khởi tạo đối tượng tên
    private String ten;
    //Hàm kêu
    public void keu(){
        System.out.println("Meo meo");
    }
    //Hàm set giá trị cho Cân nặng
     void setCannang(int n)
            {
                this.cannang = n;
                
            }
     //Hàm set giá trị cho Tên
    void setTen(String n)
            {
                this.ten = n;
                
            }
    //Hàm lấy giá trị cân nặng
    int getCannang()
    {
        return this.cannang;
    }
    //Hàm lấy tên
    String getTen()
    {
        return this.ten;
    }
}