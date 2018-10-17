/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap6;

/**
 *
 * @author Admin tròn
 */
public class Circle extends Shape{
        private double radius = 1.0; 
        public final float PI = (float) 3.14;
        Circle(){} 
        Circle(double radius){
            this.radius = radius;
        }
        Circle(double radius, double x, double y,String color){
            super(x,y,color); 
            this.radius = radius ;
        }
        public double getRadius(){
            return radius;
        }
        public void setRadius(double radius){
            this.radius = radius;
        }
        
        @Override
        public String toString(){ 
            
            return "Circle: \n"+"_Radius: "+ getRadius() + ", x=" + x + 
                    ", y=" + y + ", color= " + color ;
        }      
        
}
