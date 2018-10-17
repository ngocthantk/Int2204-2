<<<<<<< HEAD
package cau2;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        this.setWidth(side);
        this.setLength(side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side , color , filled);     
    }

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }
    
   
    @Override
    public void setWidth(double size){
       super.setWidth(size);
       super.setLength(size);
    }
    
    
    @Override
    public void setLength(double size){
        super.setLength(size);
        super.setWidth(size);
    }
    @Override
    public String toString() {
        return this.getColor() + "," + this.getFilled() + "," + this.getWidth();
    }
}
=======
package cau2;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        this.setWidth(side);
        this.setLength(side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side , color , filled);     
    }

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }
    
   
    @Override
    public void setWidth(double size){
       super.setWidth(size);
       super.setLength(size);
    }
    
    
    @Override
    public void setLength(double size){
        super.setLength(size);
        super.setWidth(size);
    }
    @Override
    public String toString() {
        return this.getColor() + "," + this.getFilled() + "," + this.getWidth();
    }
}
>>>>>>> 8698251a186993be093e172d03823408519eb608
