package diagram;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Ba Duc
 */
public class Hexagon extends Shape{
    private int x1,x2,x3,x4,x5,x6,y1,y2,y3,y4,y5,y6;
    public Hexagon(int x,int y){
        super(x, y);
    }
    public Hexagon(int x,int y,int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,int x5,int y5,int x6,int y6){
        super(x, y);
        this.x1 = x1;this.y1 = y1;
        this.x2 = x2;this.y2 = y2;
        this.x3 = x3;this.y3 = y3;
        this.x4 = x4;this.y4 = y4;
        this.x5 = x5;this.y5 = y5;
        this.x6 = x6;this.y6 = y6;
        
    }
}
