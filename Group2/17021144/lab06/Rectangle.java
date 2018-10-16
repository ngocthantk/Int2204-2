
package lap6;

/**
 *
 * @author Admin chữ nhật
 */
public class Rectangle extends Shape {
     protected double width ;
     protected double length ;
    
    public Rectangle()
    {
        super();
        this.length = 1.0;
        this.width = 1.0;
    }
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double x, double y, String color, double width, double length)
    {
        super(x, y, color);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
  
    @Override
    public String toString() {
        return "Retangle:\n" + "_width=" + width +", length=" + length +
                ", x=" + x +", y=" + y +", color = " + color ;
    }  
}
