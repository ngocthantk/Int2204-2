//Khởi tạo class Sinhvien
public class Sinhvien{
    //Khởi tạo đối tượng tên, mã sinh viên
    private String ten, msv;
    //Hàm làm bài
    public void lambai(){
        System.out.println("1 + 1 = 2");
    }
    //Hàm set giá trị cho tên sinh viên
    void setTen(String n)
            {
                this.ten = n;
                
            }
     //Hàm set giá trị cho mã sinh viên
    void setMsv(String n)
            {
                this.msv = n;
                
            }
    //Hàm lấy giá trị tên
    String getTen()
    {
        return this.ten;
    }
    //Hàm lấy mã sinh viên
    String getMsv()
    {
        return this.msv;
    }
}