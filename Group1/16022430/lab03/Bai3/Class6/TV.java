//Khởi tạo class TV
public class TV{
    //Khởi tạo đối tượng hãng tv, kích thước
    private String hangtv, kichthuoc;
    //Hàm chiếu 
    public void chieu(){
        System.out.println("Bay gio la 19h");
    }
    //Hàm set giá trị cho hãng tv
    void setHangtv(String n)
            {
                this.hangtv = n;
                
            }
     //Hàm set giá trị cho kích thước
    void setKichthuoc(String n)
            {
                this.kichthuoc = n;
                
            }
    //Hàm lấy giá trị hãng xe
    String getHangtv()
    {
        return this.hangtv;
    }
    //Hàm lấy kích thước
    String getKichthuoc()
    {
        return this.kichthuoc;
    }
}