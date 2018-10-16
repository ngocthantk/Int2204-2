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
public class Planet {
    String name;
    double R, M;
    public void setR(double R)
    {
        this.R = R;
    }
    public void setM(double M)
    {
        this.M = M;
    }
    public double getR()
    {
        return this.R;
    }
    public double getM()
    {
        return this.M;
    }
    // Tính lực hấp dẫn giữa 2 hành tinh
    public double Gravity(Planet p, double r)
    {
        double G=6.67*Math.pow(10, -11);
        double Gra = (G*p.M*this.M)/Math.pow(r, 2);
        return Gra;
    }
            
}
