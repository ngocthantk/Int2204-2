<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
class Circle extends Shape{
    protected double radious =1.0;
    final double PI = 3.14;
    //Ham khoi tao
    public Circle(){
    
    }
    public Circle(double radius){
        this.radious = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radious = radius;
        this.color = color;
        this.filled = filled;
    }
    //Cac ham setter, getter
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
        return "Circle{" + "radious = " + radious + ", PI=" + PI + '}';
    }
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
class Circle extends Shape{
    protected double radious =1.0;
    final double PI = 3.14;
    //Ham khoi tao
    public Circle(){
    
    }
    public Circle(double radius){
        this.radious = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radious = radius;
        this.color = color;
        this.filled = filled;
    }
    //Cac ham setter, getter
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
        return "Circle{" + "radious = " + radious + ", PI=" + PI + '}';
    }
>>>>>>> 8698251a186993be093e172d03823408519eb608
}