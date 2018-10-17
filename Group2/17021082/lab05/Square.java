public class Square extends Rectangle {
    private Double side;
    private Double witch;
    public Square() {}
    public Square(Double side) {
        this.side = side;
    }
    public Square (Double side, String color, Boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    Square(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Double getSide() {
        return side;
    }
    
    public void setSide(Double side) {
        this.side = side;
    }
    
    public void setWitch(Double side) {
        this.length = side;
        this.witch = side;
        
    }
    public void setLength(Double side) {
        this.length = side;
        this.witch = side;
        
    }
    
    @Override
    public String toString(){
	return this.getColor()+","+this.getFilled()+","+this.getSide();
    }
}
