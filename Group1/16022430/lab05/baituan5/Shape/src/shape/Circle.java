/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author nguyen
 */
class Circle extends Shape{
    public double radious =1.0;
    final double PI = 3.14;
	//Ham khoi tao
    public Circle(){}
    public Circle(double radius,String color,boolean filled){
       super(color,filled);
       this.radious =radius;
    }
	//Cac ham Getter, Setter
    public void setRadious(double radious) {
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }
	//Ham tinh dien tich hinh tron
    public double getArea(){
        return radious*radious*PI;
    }
	//Ham tinh chu vi hinh tron
    public double getPerimeter(){
        return 2*radious*PI;
    }

    @Override
    public String toString() {
        return "Circle:" + "radious=" + radious + ", PI=" + PI +",color=" + color + ", filled=" + filled +",Area="+this.getArea()+",perimeter="+this.getPerimeter()+ "";
    }
    
}
