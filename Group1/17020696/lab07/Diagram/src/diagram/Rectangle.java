/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;


/**
 *
 * @author Nguyen Ba Duc
 */
public class Rectangle extends Shape{
    public int width = 500;
    public int length = 500;
    
    public Rectangle(int x, int y, String color ,int width,int length) {
        super(x, y, color);
        this.width = width;
        this.length = length;
    }
    
    
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    
    public double getArea(){
        double a;
        a = width * length;
        return a;
    }
    
    public double getPerimeter(){
        double p;
        p = (width + length) * 2;
        return p;
    }
    
}
