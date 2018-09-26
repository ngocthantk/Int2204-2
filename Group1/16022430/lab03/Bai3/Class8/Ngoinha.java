//Khởi tạo class Ngoinha
public class Ngoinha{
    //Khởi tạo đối tượng địa chỉ, diện tích
    private String diachi;
	private int dientich;
    //Hàm mở cửa
    public void mocua(){
        System.out.println("Welcome");
    }
    //Hàm set giá trị cho địa chỉ
    void setDiachi(String n)
            {
                this.diachi = n;
                
            }
     //Hàm set giá trị cho diện tích
    void setDientich(int n)
            {
                this.dientich = n;
                
            }
    //Hàm lấy giá trị địa chỉ
    String getDiachi()
    {
        return this.diachi;
    }
    //Hàm lấy diện tích
    int getDientich()
	{
        return this.dientich;
    }
}