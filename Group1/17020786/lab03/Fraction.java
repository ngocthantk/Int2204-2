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
public class Fraction{
    private int a;
    private int b;
    Fraction(){}
    Fraction(int a, int b){
        this.a = a;
        this.b = b;
    }
    Fraction(Fraction f){
        this.a = f.a;
        this.b = f.b;
    }
    //getter,setter
    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }
    public void setA(int a){
       this.a = a;
    }
    public void setB(int b){
       this.b = b;
    }
    //
    public Fraction Add(Fraction f){
        int a1 = this.a * f.b;
        int a2 = f.a * this.b;
        return Simplify(new Fraction((a1+a2) , (f.b*this.b)));
    }

    public Fraction Multi(Fraction f){
        return Simplify(new Fraction(this.a*f.a,this.b*f.b));
    }    
    public Fraction Divide(Fraction f){
        Fraction f_ = new Fraction(this.a*f.b,this.b*f.a);
        if(f_.b < 0) {
            f_.b = -f_.b;
            f_.a = -f_.a;
        }
        return Simplify(f_);
    }
    private Fraction Simplify(Fraction f){
        int a_ = Math.abs(f.a);
        int b_ = Math.abs(f.b);
        if (a_==0 ||b_==0)
            return f;
        else{ 
            while (a_!=b_)
            {
                if(a_>b_)
                    a_=a_-b_;
                else
                    b_=b_-a_;
            }
            return new Fraction(f.a/a_,f.b/b_); 
        }
    }
    public boolean equals(Object obj){
        if(obj instanceof Fraction){
            Fraction f_ = (Fraction) obj;
            Fraction f = new Fraction(-f_.a,f_.b);
            Fraction f1 = Simplify(this);
            Fraction f2 = Simplify(f);
            Fraction add = f1.Add(f2);
            return (add.a==0);
        }else return false;
    }
    //
    public void println(){
        System.out.print(this.a);
        System.out.print("/");
        System.out.println(this.b);
    }
}