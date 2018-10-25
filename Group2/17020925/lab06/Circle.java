package lab06;


public class Circle extends Shape{
    protected double radius;
    final double pi = 3.14;
    private Toado tam;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled, Toado tam) {
        super(color, filled);
        this.radius = radius;
        this.tam = tam;
    }
    

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return radius*radius*pi;
    }
    public double getPerimeter(){
        return 2*radius*pi;
    }
    @Override
    public void Thongso(){
        System.out.println("Day la hinh tron: ban kinh " + radius);
    }
}