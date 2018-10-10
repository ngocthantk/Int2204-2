/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Ha
 */
public class ShapeMain {
    public static void main(String[] args) {
        //hình tròn
        Circle c = new Circle(1.0, "red", true);
        System.out.println("Bán kính hình tròn: " + c.getRadius());
        System.out.println("Màu: " + c.getColor());
        System.out.println("Diện tích hình tròn: " + c.getArea());
        System.out.println("Chu vi hình tròn: " + c.getPerimeter());
        System.out.println();
        // hình chữ nhật
        Rectangle r = new Rectangle(1.0,1.0,"red", true);
        System.out.println("Chiều rộng: " + r.getWidth());
        System.out.println("Chiều dài: " + r.getLength());
        System.out.println("Màu: " + r.getColor());
        System.out.println("Diện tích hình chữ nhật: " + r.getArea());
        System.out.println("Chu vi hình chữ nhật: " + r.getPerimeter());
        System.out.println();
        //hình vuông
        Square s = new Square(1.0,"red",true);
        System.out.println("Cạnh: " + s.getSide());
        System.out.println("Màu: " + s.getColor());
        System.out.println("Diện tích hình vuông: " + s.getArea());
        System.out.println("Chu vi hình vuông: " + s.getPerimeter());
        System.out.println();
        
    }
}
