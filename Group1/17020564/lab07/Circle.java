package javaapplication17;
class Circle extends Shape{
    protected String color;
    protected int bankinh;
    
    Circle(){
        
    }
    Circle(int x,int y,int r){
        this.bankinh=r;
        this.x=x;
        this.y=y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBankinh() {
        return bankinh;
    }

    public void setBankinh(int bankinh) {
        this.bankinh = bankinh;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}