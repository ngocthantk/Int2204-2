/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author admin
 */
public class rectangle extends shape {
    public double width;
    public double length;
    rectangle(){
        this.width=1.0;
        this.length=1.0;
        
        
    }
    rectangle(int x,int y,double width, double length,String color){
        super(x,y,color);
        this.width=width;
        this.length=length;
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
    double getArea() {
            return 2*(this.width+this.length);
    }
    
    
}
