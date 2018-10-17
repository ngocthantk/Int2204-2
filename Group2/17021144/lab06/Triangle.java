
package lap6;

/**
 *
 * @author Admin tam giác
 */
public class Triangle extends Shape{
    private double a,b,c;
    public Triangle()
    {
        super();
        this.a=1;
        this.b=1;
        this.c=1;
    }
    public Triangle(double x, double y, String color, double a, double b, double c)
    {
        super(x,y,color);
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public Triangle(double a, double b, double c)
    {
        super();
        this.a=a;
        this.b=b;
        this.c=c;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
   
    @Override
    public String toString(){
          return "Triangle: \n" +  "_x=" + x + ", y=" + y +
                ", color= " + color + ", canh a=" + a + ", canh b=" + b + ", canh c=" + c;
    }
}
