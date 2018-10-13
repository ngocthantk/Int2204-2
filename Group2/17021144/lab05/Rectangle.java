<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap52;

import static java.lang.Math.PI;


public class Rectangle extends Shape{
    protected double width = 1.0;
    protected double length = 1.0;
    Rectangle(){}
    Rectangle(double width, double length){
    this.width = width;
    this.length = length;
    }
    
    Rectangle(double width, double length, String color, boolean filled){
         super(color, filled);
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
    
    public double getArea(){
        
            double area = (width+length)*2;
            return area;
    }
    public double getPerimeter(){
            double perimeter = width*length;
            return perimeter;
    }
    
    @Override
    public String toString(){ 
            return super.toString()+ "\n -Width: "+ getWidth() 
                    +"\n -Length: "+getLength() +"\n -Area: " +getArea()+"\n -Perimeter: "+ getPerimeter();
    }      
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap52;

import static java.lang.Math.PI;


public class Rectangle extends Shape{
    protected double width = 1.0;
    protected double length = 1.0;
    Rectangle(){}
    Rectangle(double width, double length){
    this.width = width;
    this.length = length;
    }
    
    Rectangle(double width, double length, String color, boolean filled){
         super(color, filled);
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
    
    public double getArea(){
        
            double area = (width+length)*2;
            return area;
    }
    public double getPerimeter(){
            double perimeter = width*length;
            return perimeter;
    }
    
    @Override
    public String toString(){ 
            return super.toString()+ "\n -Width: "+ getWidth() 
                    +"\n -Length: "+getLength() +"\n -Area: " +getArea()+"\n -Perimeter: "+ getPerimeter();
    }      
}
>>>>>>> 8698251a186993be093e172d03823408519eb608
