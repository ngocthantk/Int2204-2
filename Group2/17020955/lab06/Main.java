/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap6;

/**
 *
 * @author TranTienPhong
 */
public class Main {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Diagram t = new Diagram();
        Layer t1 = new Layer();
        t1.add(new Rectangle(2,3));
        t1.add(new Square(5));
        t1.add(new Triangle(6,8,10));
        t1.add(new Circle(2));
    System.out.println("Truoc: ");
    for(int j = 0; j <t1.size(); j++)
        t1.elementAt(j).info();
    t1.eraseTriangle();
    System.out.println("Sau: ");
    for(int j = 0; j <t1.size(); j++)
    t1.elementAt(j).info();
    t1.eraseTriangle();
    Layer t2 = new Layer();
    t2.add(new Rectangle(3,4));
    t2.add(new Square(6));
    t2.add(new Triangle(3,4,5));
    t2.add(new Circle(8));
    
    System.out.println("Truoc");
    for( int j = 0; j <t.size(); j++)
        for(int k = 0; k < t.elementAt(j).size(); k++)
       t.elementAt(j).elementAt(k).info();
      t.eraseCircle();
      System.out.println("Sau");
      for(int j = 0; j < t.size(); j++)
          for(int k = 0; k < t.elementAt(j).size(); k++)
              t.elementAt(j).elementAt(k).info();
      
      
      
       
       
    
    
    
    
    
}
   
    }

