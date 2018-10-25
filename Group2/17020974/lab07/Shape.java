/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import javax.swing.JPanel;

/**
 *
 * @author admincxq
 */
public abstract class Shape extends JPanel{
    protected String color;
    protected boolean ismove;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIsmove() {
        return ismove;
    }

    public void setIsmove(boolean ismove) {
        this.ismove = ismove;
    }
  
    public abstract boolean check();
    public abstract void move(double a,double b);   
}
