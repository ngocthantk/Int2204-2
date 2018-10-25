/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import lab06.shape;

/**
 *
 * @author admin
 */
public class circle extends shape {
    private double radius;
    private int x;
    private int y;
    circle(){
        super();
        this.radius= 1.0;
        
    }

    @Override
    public String toString() {
        return "circle{" + "radius=" + radius + ", x=" + x + ", y=" + y + '}';
    }
  
    
    circle(int x,int y,double radius,String color){
         super(x,y,color);
        this.radius= radius;
      
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
 
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return (this.radius*this.radius*3.14);
    }

}
