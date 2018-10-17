package lab06;

public class Square extends Rectangle{
    protected double side;
    public Square(){
    }
    public Square(double side){
        super(side, side);
        this.side = side;
    }    

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }
    
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        this.width = side;
        this.length = side;
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
    public void Thongso(){
        System.out.println("Day la hinh vuong: do dai canh " + side);
    }
} 