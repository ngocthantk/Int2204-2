/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pygolon;

public class Triangle extends Shape {
    
    public Triangle(int x1,int x2,int x3, int y1, int y2, int y3){
       super(3);
       this.x[0]=x1;
       this.x[1]=x2;
       this.x[2]=x3;
       this.y[0]=y1;
       this.y[1]=y2;
       this.y[2]=y3;
        
    }
    
}
