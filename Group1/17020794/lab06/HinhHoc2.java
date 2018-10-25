/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhhoc2;

/**
 *
 * @author Asus
 */
public class HinhHoc2 { 
    
public static void main(String[] args) {
        Circle h1 = new Circle();
        Triangle h2 = new Triangle();
        Triangle h3 = new Triangle();
        Triangle h4 = new Triangle();
        Rectangle h5 = new Rectangle();
        Circle h6 = new Circle();
        Triangle h7 = new Triangle();
        Triangle h8 = new Triangle();
        Triangle h9 = new Triangle();
        Rectangle h10 = new Rectangle();
        Circle h11 = new Circle();
        Triangle h12 = new Triangle();
        Triangle h13 = new Triangle();
        Triangle h14 = new Triangle();
        Rectangle h15 = new Rectangle();
        Circle h16 = new Circle();
        Triangle h17 = new Triangle();
        Triangle h18 = new Triangle();
        Triangle h19 = new Triangle();
        Rectangle h20 = new Rectangle();
        Circle h21 =new Circle();
        Circle h22=new Circle();
        Rectangle h23=new Rectangle();
        Layer l1 =new Layer();
        Layer l2 =new Layer();
        Layer l3 =new Layer();
        Layer l4=new Layer();
        Layer l5=new Layer();
        Diagram d = new Diagram();
        l1.lop.add(h1);
        l1.lop.add(h2);
        l1.lop.add(h3);
        l1.lop.add(h4); 
        l1.lop.add(h5);
        l2.lop.add(h6);
        l2.lop.add(h7);
        l2.lop.add(h8);
        l2.lop.add(h9);
        l2.lop.add(h10);
        l3.lop.add(h11);
        l3.lop.add(h12);
        l3.lop.add(h13);
        l3.lop.add(h14); 
        l3.lop.add(h15);
        l4.lop.add(h16);
        l4.lop.add(h17);
        l4.lop.add(h18);
        l4.lop.add(h19);
        l4.lop.add(h20);
        l5.lop.add(h21);
        l5.lop.add(h22);
        l5.lop.add(h23);
        d.sodo.add(l1);
        d.sodo.add(l2);
        d.sodo.add(l3);
        d.sodo.add(l4);
        d.sodo.add(l5);
        d.deleteCircleOfDiagram();
        System.out.println(d.sodo.size());
    }
}   
    

