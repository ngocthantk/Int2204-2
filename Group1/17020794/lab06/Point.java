/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhhoc2;

import static java.lang.Math.sqrt;

public class Point {
   private double x;
   private double y;
   public Point(double x, double y){
       this.x=x;
       this.y=y;
   }
   public double getX(){
       return this.x;
   }
   public double getY(){
       return this.y;
   }
   public void setX(double x){
       this.x=x;
   }
   public void setY(double x){
       this.y=x;
   }
   public static double lenght(Point a, Point b){
       return sqrt(a.getX()-b.getX()*a.getX()-b.getX()+a.getY()-b.getY()*a.getY()-b.getY());
   }
   public void move(double x, double y){
       this.x=this.x+x;
       this.y=this.y+y;
   }
}
