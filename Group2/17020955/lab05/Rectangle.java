/*ng
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap5_1;

/**
 *
 * @author TranTienPhong
 */
public class Rectangle extends Shape{
    protected double width =1;
    protected double length =1;
    public Rectangle(){}
    public Rectangle (double width, double length,String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length){
        this.width =width;
        this.length = length;
        
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return this.width*this.length;
        
    }
    public double getPerimeter(){
        return 2*this.width+2*this.length;
        
        
    }
    @Override
    public String toString(){
        return this.color+","+this.filled+","+this.width+","+this.length;
    }

    
    
}
