/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_objects;

/**
 *
 * @author MyPC
 */
public class conlacdon {
    private double l, m;
    public void setL(double l)
    {
        this.l = l;
       
    }
     public void setM(double m)
    {
        this.m = m;
       
    }
      public double getL()
    {
        return this.l;
       
    }
       public double getM()
    {
        return this.m;
       
    }
       public double ChuKy()
       {
           return Math.sqrt(2*Math.PI/this.l);
       }
}
