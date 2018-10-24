public class Shape {
     String Colour = "red";
     boolean filled = true;
    public Shape(){
        
    }
    public Shape(String mau, boolean fill){
        this.Colour = mau;
        this.filled = fill;
    }
     public String getColour() {
        return Colour;
    }
     public void setColour(String Colour) {
        this.Colour = Colour;
    }
     public boolean isFilled() {
        return filled;
    }
     public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString()
    {
        return this.toString();
    }
}