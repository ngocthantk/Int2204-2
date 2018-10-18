package Shape;

public class Square extends Rectangle{
	
	public Square(){}
	
	public Square(double side){
	super(side,side);
	}

	public Square(double side, String color, boolean filled){
	this.width=side;
	this.length=side;
	this.color=color;
	this.filled=filled;
	}
	
	public double getSide(){
	return this.getWidth();
	}

	public void setSide(double side){
	this.setWidth(side);
	this.setLength(side);
	}
        
        @Override
        public void setWidth(double side){
            setSide(side);
        }
        @Override
        public void setLength(double side){
            setSide(side);
        }
	@Override
	public String toString(){
	return this.getColor()+","+this.getFilled()+","+this.getWidth();}
}