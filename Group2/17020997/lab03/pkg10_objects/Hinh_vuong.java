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
public class Hinh_vuong {
    private double canh;
    public void set(double x)
    {
        this.canh = x;
    }
    public double get()
    {
        return this.canh;
    }
    //tính S hinh vuong
    public double area()
    {
        return Math.pow(this.canh, 2);
    }
    //tính chu vi hinh vuong
    public double ChuVi()
    {
        return 4*this.canh;
        
    }
}
