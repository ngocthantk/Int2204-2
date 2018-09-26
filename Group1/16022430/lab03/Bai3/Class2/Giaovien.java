//Khởi tạo class Giaovien
public class Giaovien{
    //Khởi tạo đối tượng tên và môn
    private String ten, monhoc;
    //hàm giảng bài
    void giangbai()
    {
        System.out.println("Mot Hai Ba");
    }
    //Hàm set giá trị cho tên
    void setTen(String n)
    {
        this.ten = n;
    }
    //Hàm set giá trị cho môn 
    void setMonhoc(String n)
    {
        this.monhoc = n;
    }
    //Hàm lấy giá trị của tên
    String getTen()
    {
        return this.ten;
    }
	//Hàm lấy giá trị cho môn
    String getMonhoc()
    {
        return this.monhoc;
    }
}