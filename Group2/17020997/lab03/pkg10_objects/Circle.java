/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_objects;

import java.util.*;

/**
 *
 * @author MyPC
 */
public class Circle {

    private double R;

    public void setR(double r) {
        this.R = r;
    }

    public double getR() {
        return this.R;
    }
    public double S()
    {
        return Math.PI * this.R * this.R;
    }
    public double CV()
    {
        return 2*Math.PI*this.R;
    }
}
