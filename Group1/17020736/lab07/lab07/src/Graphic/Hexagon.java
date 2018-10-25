package Graphic;

public class Hexagon extends Shape{
    protected int side;
    protected String color;
    Hexagon(){}
    Hexagon(int side,int x,int y){
        this.side = side;
        this.x = x;
        this.y =y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public void setX(int x) {
        super.setX(x);
    }

    @Override
    public int getY() {
        return super.getY();
    }

    @Override
    public void setY(int y) {
        super.setY(y);
    }
}
