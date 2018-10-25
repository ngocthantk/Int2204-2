/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pygolon;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Hexagon extends Shape{
    int side;
    int xp;
    int yp;
    public Hexagon(int x1, int y1, int side){
        super(6);
        this.xp=x1;
        this.yp=y1; 
        this.side=side;
        for(int i=0; i<6; i++){
            this.x[i]=(int) (cos(i * 2 * 3.14 / 6) * this.side+x1);
            this.y[i]=(int) (sin(i*2*3.14/6)*this.side+y1);
        }
    }
}
