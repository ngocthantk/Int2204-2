//Khởi tạo class Maybay
public class Maybay{
    //Khởi tạo đối tượng tên máy bay, sô khách
    private String ten;
	private int sokhach;
    //Hàm bay
    public void bay(){
        System.out.println("veo veo veo");
    }
    //Hàm set giá trị cho tên máy bay
    void setTen(String n)
            {
                this.ten = n;
                
            }
     //Hàm set giá trị cho số khách
    void setSokhach(int n)
            {
                this.sokhach = n;
                
            }
    //Hàm lấy giá trị tên máy bay
    String getTen()
    {
        return this.ten;
    }
    //Hàm lấy sô khách
    int getSokhach()
    {
        return this.sokhach;
    }
}