//Khởi tạo class Dongho
public class Dongho{
    //Khởi tạo đối tượng hình dáng
    private String hinhdang;
    //Hàm báo thức
    public void baothuc(){
        System.out.println("Reng reng reng");
    }
    //Hàm set giá trị cho hãng xe
    void setHinhdang(String n)
            {
                this.hinhdang = n;
                
            }
    //Hàm lấy giá trị hình dạng
    String getHinhdang()
    {
        return this.hinhdang;
    }
}