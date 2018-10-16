package lap06;

import static java.lang.Math.sqrt;

public class Shape {
    double x;
    double y;
    private String mausac;
    private boolean d;
    public Shape()
    {
       this.mausac="red";
       this.d=true;
    }
    public Shape(String mausac,boolean d)
    {
        this.mausac=mausac;
        this.d=d;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double Move(double x, double y){
        double a=this.x;
        double b=this.y;
        this.setX(x);
        this.setY(y);
        return sqrt((x-a)*(x-a)+(y-b)*(y-b));
    }
    public String getMausac()
    {
        return mausac;
    }
    public void setMausac(String mausac)
    {
        this.mausac = mausac;
    }
    public boolean getD() 
    {
        return d;
    }
    public void setd(boolean d)
    {
        this.d = d;
    }
    @Override
    public String toString() 
    {
        return  this.mausac + " " + this.d;
    }
}