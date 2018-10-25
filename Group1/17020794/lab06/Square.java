/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhhoc2;

import static hinhhoc2.Point.lenght;

public class Square extends Rectangle
{
    public Square ()
    {
        this.a.setX(0);
        this.a.setY(0);
        this.b.setX(1);
        this.b.setY(0);
        this.c.setX(0);
        this.c.setY(1);
        this.d.setX(1);
        this.d.setY(1);
    }
     public  Square (double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, String color, boolean filled)    //tham số chiều dài rộng, màu filled mặc định
    {
        super(x1, y1, x2, y2, x3, y3, x4, y4, color, filled);
        
    }
    public boolean isCheckSquare(){
        boolean check=false;
        double bc=lenght(this.a, this.b);
        double ac=lenght(this.b, this.c);
        if(bc==ac&&super.checkIsRec()){            
        }
        return check;
    }
    
}