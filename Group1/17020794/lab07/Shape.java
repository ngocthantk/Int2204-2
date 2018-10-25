/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pygolon;

import java.awt.Graphics;
import static java.lang.Math.sqrt;

public abstract class Shape  {

    protected int[] x;
    protected int[] y;
    protected int n;
    public Shape(int n){
        this.n=n;
        this.x=new int[this.n];
        this.y=new int[this.n];
    }
    public int getXi(int i) {
        return this.x[i];
    }

    public int getYi(int i) {
        return this.y[i];
    }

    public void setXi(int i,int x) {
        this.x[i] = x;
    }

    public void setYi(int i, int y) {
        this.y[i] = y;
    }
    public void drawShape(Graphics g){
        if(this instanceof Triangle){
            g.drawPolygon(this.x, this.y, this.n);
        }
        else if (this instanceof Rectangle){
            Rectangle r=(Rectangle) this;
            if(r.checkRec){
                g.drawPolygon(this.x, this.y, this.n);
            }
        }
        else if(this instanceof Square){
            Square s=(Square) this;
            if(s.checkSquare){
                g.drawPolygon(this.x, this.y, this.n);
        
            }
        }
       
        else if(this instanceof Circle){
            Circle c=(Circle) this;
            c.drawCircle(g);
        }
        else if(this instanceof Hexagon){
            g.drawPolygon(this.x, this.y, this.n);
        }
    }
    public boolean isSame(Shape s2){
        boolean check=true;
        if(this.n==s2.n){
            for(int i=0; i<n; i++){
                if(this.x[i]!=s2.x[i]||this.y[i]!=s2.y[i]){
                    check=false;
                }
            }
        }
        else{
            check=false;
        }
        return check;
    }
    public double lenght(int x1,int y1,int x2,int y2){
        return sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
    
}
