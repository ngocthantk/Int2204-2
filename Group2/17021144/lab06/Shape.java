
package lap6;

/**
 *
 * @author Admin hình dạng
 */
public abstract class Shape {
   
    protected double x;
    protected double y;
    protected String color;
    // hàm không có tham số
    public Shape()
    {
       
        this.x = 1.0;
        this.y = 1.0;
        color = "red";
    }
    // hàm có tham số
    public Shape(double x, double y, String color)
    {
       
        this.x = x;
        this.y = y;
        this.color = color;
    }
     
   // getter && setter
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
     @Override
    public String toString() {
        return "Shape: \n" + "x=" + x +", y=" + y +
                ", color=" + color ;
    } 
}
