<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap52;

public class Square extends Rectangle{

    protected double side;
  
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide() {       
        return side;
    }
    
    public void setSide(double side) {
        width = side;
        length = side;
    }

     @Override
    public void setWidth(double side) {
      super.setWidth(side);      
     // super.setLength(side);

   }
    @Override
    public void setLength(double side) {
        super.setLength(side);
     // super.setWidth(side);
    }
    @Override
    public String toString(){ 
           return super.toString();
        }     
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap52;

public class Square extends Rectangle{

    protected double side;
  
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide() {       
        return side;
    }
    
    public void setSide(double side) {
        width = side;
        length = side;
    }

     @Override
    public void setWidth(double side) {
      super.setWidth(side);      
     // super.setLength(side);

   }
    @Override
    public void setLength(double side) {
        super.setLength(side);
     // super.setWidth(side);
    }
    @Override
    public String toString(){ 
           return super.toString();
        }     
}
>>>>>>> 8698251a186993be093e172d03823408519eb608
