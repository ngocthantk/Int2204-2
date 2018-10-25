/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author CCNE
 */
public class Triangle extends Shape{
    private int[] a;
    private int[] b;
    private int[] c;

    public Triangle(){
        a = new int[2];
        b = new int[2];
        c = new int[2];
    }
    public void setA(int x,int y){
        this.a[0] = x;
        this.a[1] = y;
    }
    public void setB(int x,int y){
        this.b[0] = x;
        this.b[1] = y;
    }
    public void setC(int x,int y){
        this.c[0] = x;
        this.c[1] = y;
    }


    public int[] getA() {
        return a;
    }

    public int[] getB() {
        return b;
    }

    public int[] getC() {
        return c;
    }
    
    @Override
    public String getColor(){
        return this.color;
    }
    //cài màu của hình
    @Override
    public void setColor(String color){
        this.color = color;
    }
    //trả về có đầy hay không 
    @Override
    public boolean isFilled(){
        return this.filled;
    }
    //cài trạng thái đày hay không đầy
    @Override
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    private String color;
    private boolean filled;
}
