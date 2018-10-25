package Graphic;

public class Square extends Rectangle {
    protected String color;
    protected int side;
    Square(){}
    Square(int side,int x,int y){
        super(side,side);
        this.side =side;
        this.x = x;
        this.y = y;
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
    public int getY() {
        return super.getY();
    }

    @Override
    public void setY(int y) {
        super.setY(y);
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public void setX(int x) {
        super.setX(x);
    }
}
