/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author Liscli
 */
public class Lab05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //
        Lab05 l5 = new Lab05();
        l5.Question1();
        l5.Question2();
    }
    public void Question1(){
                Fruit f = new Fruit("Test", "test Type", true, "test Taste", 0, "test Orgin", "1/1/2001", 0);
        System.out.println(f.getName());
        System.out.println(f.isSeed());
        f.setName("set name test");
        System.out.println(f.getName());
        //
        Orange o = new Orange(1, "orange orgin", "orange dateOfEntry", 1);
        System.out.println(o.getName());
        System.out.println(o.getOrgin());
        o.setName("cam");
        System.out.println(o.getName());
        //
        Apple a = new Apple(2, "apple orgin", "apple dateOfEntry", 2);
        System.out.println(a.getName());
        System.out.println(a.getPrice());
        a.setName("tao");
        System.out.println(a.getName());
        //
        CamSanh cs = new CamSanh(3, "cs orgin", "cs dateOfEntry", 3);
        System.out.println(cs.getName());
        System.out.println(cs.getOrgin());
        a.setName("cam");
        System.out.println(cs.getName());
        //
        CamCaoPhong ccp = new CamCaoPhong(4, "cs orgin", "cs dateOfEntry", 4);   
        System.out.println(ccp.getName());
        System.out.println(ccp.getDateOfEntry());
        a.setName("cam");
        System.out.println(ccp.getName()); 
    }
    public void Question2(){
        Shape sh = new Shape();
        System.out.println(sh.getColor());
        sh.setColor("pink");
        System.out.println(sh.getColor());
        //
        Circle c = new Circle(1.5);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        //
        Rectangle r = new Rectangle(2,3);
        System.out.println(r.getArea());
        //
        Square s = new Square(5);
        System.out.println(s.getSide());
        System.out.println(s.getPerimeter());
    }
}
