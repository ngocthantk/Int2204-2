/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnhTam
 */
public class Shape {
    protected int x, y;
    protected boolean filled, visible;
    protected String color;
    public Shape(){
        
    }
    public Shape(int x, int y, boolean filled, boolean visible, String color) {
        this.x = x;
        this.y = y;
        this.filled = filled;
        this.visible = visible;
        this.color = color;
    }
    public boolean isVisible() {
        return visible;
    }
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" + "x=" + x + ", y=" + y + ", filled=" + filled + ", visible=" + visible + ", color=" + color + '}';
    }
    
}
