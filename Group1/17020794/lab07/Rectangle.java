/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pygolon;
public class Rectangle extends Shape{
     boolean checkRec;
    public Rectangle(int x1,int x2,int x3,int x4,int y1,int y2, int y3, int y4){
        super(4);
        this.x[0]=x1;
        this.x[1]=x2;
        this.x[2]=x3;
        this.x[3]=x4;
        this.y[0]=y1;
        this.y[1]=y2;
        this.y[2]=y3;
        this.y[3]=y4;
        checkRec=this.checkRec();
    }
    boolean checkRec(){
        boolean check=false;
        double ab=this.lenght(this.x[0], this.y[0], this.x[1], this.y[1]);
        double bc=this.lenght(this.x[1], this.y[1], this.x[2], this.y[2]);
        double cd=this.lenght(this.x[2], this.y[2], this.x[3], this.y[3]);
        double da=this.lenght(this.x[3], this.y[3], this.x[0], this.y[0]);
        if(ab==cd&&bc==da){
            check=true;
        }
        return check;
        
    }
}
