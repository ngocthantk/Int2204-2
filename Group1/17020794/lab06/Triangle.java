/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhhoc2;

import static java.lang.Math.sqrt;
import static hinhhoc2.Point.lenght;
public class Triangle extends Shape {
    private Point a;
    private Point b;
    private  Point c;
    public Triangle(){
        super();
        this.a.setX(0);
        this.a.setY(0);
        this.b.setX(0.5);
        this.b.setY(1);
        this.c.setX(1);
        this.c.setY(0);
        
    }
   public Triangle(double x1, double y1, double x2, double y2, double x3, double y3, boolean filled, String color){
        super(color, filled);
        this.a.setX(x1);
        this.a.setY(y1);
        this.b.setX(x2);
        this.b.setY(y2);
        this.c.setX(x3);
        this.c.setY(y3);
        
    }
    
   public boolean checkIsATri(){
       boolean check=false;
       double ab=lenght(this.a, this.b);
       double bc=lenght(this.c, this.b);
       double ac=lenght(this.a, this.c);
       if(ab+bc>ac||ab+ac>bc||ac+bc>ab){
           check=true;
       }
       return check;
   }

 
}
