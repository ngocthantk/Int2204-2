
package hinhhoc;
public class Square extends Rectangle
{
    public Square ()
    {
        
    }
    public Square (double side)     //dùng hàm khởi tạo có side, màu filled mặc định của hình chữ nhật
    {

        super(side,side);

    }
    public Square(double side,String color, boolean filled)     // dùng hàm khởi tạo có tham số là side, color, filled của hình chữ nhật
    {
        super(side,side,color,filled);
    }
    public double getSide()   // lấy độ dài
    {
        return this.getLength();
    }
    @Override
    public void setLength(double side)  // cài độ dài 
    {
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void setWidth(double side)  //cài độ rộng
    {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public String toString()     //in ra
    {
        return super.toString();    
    }
}