//Khởi tạo class Oto
public class Oto{
    //Khởi tạo đối tượng hãng xe, màu
    private String hangxe, mau;
    //Hàm đi
    public void di(){
        System.out.println("Xe dang chay voi toc do 50km/h");
    }
    //Hàm set giá trị cho hãng xe
    void setHangxe(String n)
            {
                this.hangxe = n;
                
            }
     //Hàm set giá trị cho màu
    void setMau(String n)
            {
                this.mau = n;
                
            }
    //Hàm lấy giá trị hãng xe
    String getHangxe()
    {
        return this.hangxe;
    }
    //Hàm lấy màu
    String getMau()
    {
        return this.mau;
    }
}