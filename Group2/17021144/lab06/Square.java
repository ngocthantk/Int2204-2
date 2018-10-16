package lap6;
/*
 *
 * @author Admin vuông
 */

public class Square extends Rectangle {
    public Square(){        
    }
    public Square(double side){
        super(side, side);
    }   
    public Square( double x, double y, String color, double side){
        super(x, y, color, side, side);
    }
      
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
   
    public double getSide() {       
        return this.width;
    }
    
     @Override
    public void setWidth(double side) {
      this.setSide(side);      
    }
    @Override
    public void setLength(double side) {
      this.setSide(side);   
    }
    @Override
    public String toString(){ 
            return "Square: \n" + "_Side =" + width + ", x=" + x + ", y=" +
                    y + ", color= " + color ;
        }     
}
