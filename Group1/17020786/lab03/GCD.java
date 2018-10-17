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
public class GCD {
    private int gcd;
    GCD(int a,int b){
        int a_ = Math.abs(a);
        int b_ = Math.abs(b);
        if (a_==0 ||b_==0)
            gcd= a+b;
        else{ 
            while (a_!=b_)
            {
                if(a_>b_)
                    a_=a_-b_;
                else
                    b_=b_-a_;
            }
        }
        gcd = a_;
    }
    public int getGcd(int a,int b){
        return this.gcd;
    }
}
