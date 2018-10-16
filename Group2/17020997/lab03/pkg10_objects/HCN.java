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
public class HCN {
    private double CD, CR;
    public void setCD(double x)
    {
        this.CD = x;
    }
    public void setCR(double x)
    {
        this.CR = x;
    }
    public double getS()
    {
        return this.CD * this.CR;
    }
    public double getChuVi()
    {
        return 2*(this.CD + this.CR);
    }
    
}
