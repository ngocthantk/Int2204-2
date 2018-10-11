<<<<<<< HEAD
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
public class Circle extends Shape{
    //contructor
    public Circle()
    {
        
    }
    // final ~ const in c++
    final double PI = 3.14;
    private double bankinh = 1.0;
    //khoi tao ham
    public Circle(double bankinh)
    {
        this.bankinh = bankinh;
    }
    public Circle(double bankinh,String mau, boolean filled)
    {
        super(mau,filled); 
        this.bankinh = bankinh;
    }
    //get ban kinh
    public double getBankinh()
    {
        return bankinh;
    }
    //set ban kinh
    public void setBankinh(double bankinh)
    {
        this.bankinh = bankinh;
    }
    //get dien tich
    public double dientich()
    {
        return (PI * this.bankinh * this.bankinh);
    }
    //get chu vi
    public double chuvi()
    {
        return(PI *this.bankinh * 2);
    }
    public String toString(){
        return super.toString()+ " " + this.dientich() + " "+ this.chuvi();
    }
}
=======
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
public class Circle extends Shape{
    //contructor
    public Circle()
    {
        
    }
    // final ~ const in c++
    final double PI = 3.14;
    private double bankinh = 1.0;
    //khoi tao ham
    public Circle(double bankinh)
    {
        this.bankinh = bankinh;
    }
    public Circle(double bankinh,String mau, boolean filled)
    {
        super(mau,filled); 
        this.bankinh = bankinh;
    }
    //get ban kinh
    public double getBankinh()
    {
        return bankinh;
    }
    //set ban kinh
    public void setBankinh(double bankinh)
    {
        this.bankinh = bankinh;
    }
    //get dien tich
    public double dientich()
    {
        return (PI * this.bankinh * this.bankinh);
    }
    //get chu vi
    public double chuvi()
    {
        return(PI *this.bankinh * 2);
    }
    public String toString(){
        return super.toString()+ " " + this.dientich() + " "+ this.chuvi();
    }
}
>>>>>>> 8698251a186993be093e172d03823408519eb608
