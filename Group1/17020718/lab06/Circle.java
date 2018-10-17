package lap06;

public class Circle extends Shape{
    final double PI= 3.14;  
    private double bankinh; 
    public Circle()       
    {
        super();
        this.bankinh=1.00;
    };
    
    public Circle(double bankinh ,String mausac, boolean filled) 
    {   
        super(mausac, filled);
    	this.bankinh=bankinh;
        
    }
    public double getBankinh()      
    {
        return bankinh;
    }
    public void setBankinh(double bankinh)  
    {
        this.bankinh = bankinh;
    }
    public double getArea()  
    {
        return(PI*this.bankinh*this.bankinh);
    }
    public double getPerimeter()   
    {
        return (2*PI*this.bankinh);
    }
    @Override
    public String toString() {
    	return super.toString()+" "+this.getArea()+" "+this.getPerimeter();  
    }
}