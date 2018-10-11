/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap5_1;

/**
 *
 * @author TranTienPhong
 */
public class TestShape {
    public static void main(String[] args){
        Circle c = new Circle();
        System.out.println( c.toString());
        Rectangle rec = new Rectangle(2,3);
        System.out.println( rec.toString());
        System.out.println(rec.getArea());
        System.out.println(rec.getPerimeter());
        
        
        
    }
    
}
