/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author tuann_000
 */
public class toaDo {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double khoangCach(toaDo m){
        return Math.sqrt(Math.pow((m.getX()-this.getX()),2)+Math.pow((m.getY()-this.getY()),2));
    }
}
