/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author CCNE
 */
public class Fibonaxi{
    private final int f;
    Fibonaxi(int n){
        f = fibonaxi(n);
    }
    private int fibonaxi(int n){
        if(n==1 || n==0) return n;
        else return fibonaxi(n-1) + fibonaxi(n-2);
    }
    public int getFibonaxi(int n){
        return f;
    }
}