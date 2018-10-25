package lap07;
import java.awt.Color;

public class Square extends Rectangle {
    
    public Square(){        
    }
    public Square(double side){
        super(side, side);
    }   
    public Square(double side, int x, int y, boolean filled, Color color) {
        super(side, side, x, y, filled, color);
    }
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public double getSide() {       
        return this.width;
    }
     public void setWidth(double side) {
        setSide(side);
    }
     public void setLength(double side) {
        setSide(side);
    }
     @Override
    public String toString() {
        return  "width= " + width + ", length= " + length + ", x= " + x + ", y= " + y
                + ", filled= " + filled + ", color= " + color + ", Chu vi= " + getPrimeter() + ", Dien tich= "
                + getArea();
        
    }
 }