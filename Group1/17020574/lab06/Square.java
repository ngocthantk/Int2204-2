/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1lab05;

/**
 *
 * @author Dat Anh
 */
public class Square extends Rectangle{
    private double side;

    public Square() {
    }

    public Square(double side, int x, int y, boolean filled, boolean visible, String color) {
        super(side, side, x, y, filled, visible, color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + ", x=" + x + ", y=" + y + ", filled=" + filled + ", visible=" + visible + ", color=" + color + '}';
    }
    
}
