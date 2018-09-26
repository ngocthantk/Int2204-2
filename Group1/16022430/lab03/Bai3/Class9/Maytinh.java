//Khởi tạo class Maytinh
public class Maytinh{
    //Khởi tạo đối tượng time, background
    private String time, background;
    //Hàm bật máy
    public void batmay(){
        System.out.println("Window 10 @@@@@@");
    }
    //Hàm set giá trị cho time
    void setTime(String n)
            {
                this.time = n;
                
            }
     //Hàm set giá trị cho backround
    void setBackground(String n)
            {
                this.background = n;
                
            }
    //Hàm lấy giá trị time
    String getTime()
    {
        return this.time;
    }
    //Hàm lấy background
    String getBackground()
	{
        return this.background;
    }
}