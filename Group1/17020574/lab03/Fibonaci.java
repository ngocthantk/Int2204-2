/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dat Anh
 */
public class Fibonaci {
    private int n;
    public int getN()
    {
        return n;
    }
    public void setN(int n)
    {
        this.n = n;
    }
    int [] a = new int[100];
    // Tim fibonaci
    public int serch()
    {
        int s = 0;
        a[0] = 0;
        a[1] = 1;
        for(int i = 2; i <= this.getN(); i++)
        {
            a[i] = a[i-1] + a[i-2];
        }
        s = a[this.getN()];
        return s;
    }
}
