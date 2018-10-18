package dohoa;


public abstract class Shape {
    boolean filled ; 

    public Shape(boolean fill) {
        this.filled = fill;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    
}