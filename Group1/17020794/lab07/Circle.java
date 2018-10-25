/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pygolon;

import java.awt.Graphics;

public class Circle extends Shape {

    private int radius;

    public Circle(int r, int x, int y) {
        super(1);
        this.x[0] = x;
        this.y[0] = y;
        this.radius=r;
    }

    public int getRadius() {
        return this.radius;
    }

    public void drawCircle(Graphics g) {
        g.drawOval(this.x[0], this.y[0], this.radius*2, this.radius*2);
    }
    public boolean isSameCircle(Circle c2){
        return super.isSame(c2)&&this.radius==c2.getRadius();
    }
}
