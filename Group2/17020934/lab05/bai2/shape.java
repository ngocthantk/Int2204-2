/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ba2;

/**
 *
 * @author tuann_000
 */
public class shape {
    String color;
    boolean filled;
    public shape(){};
    public String getColor() {
        return "red";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return true;
    }

    public shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString(){
        return this.getColor()+this.isFilled();
    } 

    void getColor(String color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void isFilled(boolean filled) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
