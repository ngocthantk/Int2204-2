/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dohoa;

import javax.swing.JPanel;

/**
 *
 * @author MyPC
 */
public abstract class Shape {
    boolean filled ; 

    public Shape(boolean fill) {
        this.filled = fill;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    
}
