/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhhoc;

public class HinhHoc {

    public static void main(String[] args) {
        Circle C=new Circle(5, "red", true);
        Square S=new Square(5,"red",true);
        Rectangle R=new Rectangle(5,6,"red",true);
        System.out.println(C.toString());
        System.out.println(S.toString());
        System.out.println(R.toString());
        
    }
    
}
