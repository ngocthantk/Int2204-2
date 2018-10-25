package Graphic;

public class Rectangle extends Shape {
    protected int chieudai,chieurong;
    protected String color;
    Rectangle(){}
    Rectangle(int dai,int rong){
        this.chieudai = dai;
        this.chieurong = rong;
    }
    Rectangle(int dai, int rong,String color,int x,int y){
       chieudai = dai;
       chieurong = rong;
       this.color = color;
       this.x = x;
       this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChieudai() {
        return chieudai;
    }


    public int getChieurong() {
        return chieurong;
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
