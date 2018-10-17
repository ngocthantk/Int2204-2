package lap06;

public class Rectangle extends Shape
{
    private double width;   
    private double  length ;   
    public Rectangle()      
    {
        super();
        this.length=1.0;
        this.width=1.0;
    }
    public  Rectangle (double width, double length)   
    {
        super();
        this.length =length;
        this.width = width;
    }
    public  Rectangle (double width,double length,String color,boolean filled) 
    {
        super(color, filled);
        this.length = length;
        this.width = width;
       
    }  
    public double getWidth()   
    {
        return width;
    }
    public void setWidth(double width) 
    {
        this.width = width;
    }
    public double getLength()   
    {
        return length;
    }
    public void setLength(double length) 
    {
        this.length = length;
    } 
    public double getArea()   
    {
        return(this.getLength()*this.getWidth());
    }
    public double getPerimeter()   
    {
        return (2*(this.getWidth()+this.getLength()));
    }
    @Override
    public String toString()  
    {
        return " "+this.getArea()+" "+this.getPerimeter();
    }
}
