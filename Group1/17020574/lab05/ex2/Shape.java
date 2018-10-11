/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author Dat Anh
 */
public class Shape {
    public Shape(){
        
    }
    protected String mau="red";
    protected boolean filled = true;
    public Shape(String mau, boolean filled)
    {
        this.mau = mau;
        this.filled = filled;
    }
    //get mau
    public String getMau()
    {
        return mau;
    }
    //set mau
    public void setMau(String mau)
    {
        this.mau = mau;
    }
    public boolean isFilled()
    {
        return filled;
    }
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }
    public String toString()
    {
        return this.mau + " " + this.filled;
    }
}
