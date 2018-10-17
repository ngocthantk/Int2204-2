package lap06;

public class Square extends Rectangle
{
    
    public Square (double side)     
    {

        super(side,side);

    }
    public Square(double side,String color, boolean filled)     
    {
        super(side,side,color,filled);
    }
    public double getSide()   
    {
        return this.getLength();
    }
    @Override
    public void setLength(double side)  
    {
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void setWidth(double side)  
    {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public String toString()     
    {
        return super.toString();    
    }
}