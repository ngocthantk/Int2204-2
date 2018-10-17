package lap06;

import static java.lang.Math.sqrt;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    public Triangle(){
        super();
        this.a=1;
        this.b=1;
        this.c=1;
    }
    public Triangle(double a, double b, double c, String mausac, boolean d){
        super( mausac, d );
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public void setA(int a){
        this.a=a;
    }
    public void setB(int b){
        this.b=b;
    }
    public void setC(int c){
        this.c=c;
    }
    public double getArea(){
        double a=this.a;
        double b=this.b;
        double c=this.c;
        double p=(a+b+c)/2;
        return sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public double getPerimeter() {
        return a+b+c;
    }
    @Override
    public String toString(){
        return super.toString()+" "+this.getArea()+" "+this.getPerimeter();
        
    }
}