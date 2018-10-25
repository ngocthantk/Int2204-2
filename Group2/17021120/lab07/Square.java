/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;
 /**
 *
 * @author admin
 */
public class Square extends Rectangle{
    
    public Square(double s, String n, boolean i, double x, double y){
        super(s,s,n,i,x,y);
    }
    public double getSide(){
        return this.getWidth();
    }
    public void setSide(double s){
        super.setWidth(s);
        super.setLength(s);
    }
    public void setWidth(double s){
        this.setSide(s);
    }
    public void setLength(double s){
        this.setSide(s);
    }
    @Override
    public String toString(){
        return this.getColor()+" "+this.isFilled()+" "+this.getArea()+" "+this.getPerimeter();
    }
}