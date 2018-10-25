/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;
import java.awt.Canvas;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.*;
/**
 *
 * @author win
 */
public class DoHoa extends Layer{
     public static Layer layer = new Layer();  
    public static Layer tron = new Layer();
      public static JFrame jframeTron = new JFrame();
     
    /**
     *
     */
   
   

   
    public static void main(String[] args) {
        System.out.println("Nháº­p sá»‘ hÃ¬nh: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
         System.out.println("Nháº­p vÃ o cÃ¡c hÃ¬nh: Circle, Rectangle, Square, Triangle, Hexagon");
        
        while(n!=0){
            Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
     
        if(s.equals("Circle")){
            System.out.println("Má»�i báº¡n nháº­p tá»�a Ä‘á»™ tÃ¢m vÃ  bÃ¡n kÃ­nh: ");
            int x = sc.nextInt(), y = sc.nextInt(), r = sc.nextInt();
            
            Circle c = new Circle(false, x, y, r);
            layer.hinh.add(c);
             System.out.println("Má»�i nháº­p hÃ¬nh tiáº¿p theo: ");
        }
        if(s.equals("Rectangle")){
            System.out.println("Má»�i báº¡n nháº­p tá»�a Ä‘á»™ Ä‘iá»ƒm báº¯t Ä‘áº§u vÃ  CD, CR: ");
            int x = sc.nextInt(), y = sc.nextInt(), cd = sc.nextInt(), cr = sc.nextInt();
           if(cd == cr){
               System.out.println("HÃ¬nh nÃ y sáº½ trá»Ÿ thÃ nh hÃ¬nh vuÃ´ng");
           }
            Rectangle c = new Rectangle(false, x, y, cd, cr);
            layer.hinh.add(c);
             System.out.println("Má»�i nháº­p hÃ¬nh tiáº¿p theo: ");
        }
         if(s.equals("Triangle")){
            System.out.println("Má»�i báº¡n nháº­p tá»�a Ä‘á»™ 3 Ä‘á»‰nh: ");
            int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt(), x3 = sc.nextInt(), y3 = sc.nextInt();
           
            Triangle c = new Triangle(false, x1, y1, x2, y2, x3, y3);
            layer.hinh.add(c);
             System.out.println("Má»�i nháº­p hÃ¬nh tiáº¿p theo: ");
        }
         if(s.equals("Square")){
            System.out.println("Má»�i báº¡n nháº­p tá»�a Ä‘á»™ Ä‘iá»ƒm báº¯t Ä‘áº§u vÃ  cáº¡nh: ");
            int x = sc.nextInt(), y = sc.nextInt(), canh = sc.nextInt();
           
            Square c = new Square(false, x, y, canh);
            layer.hinh.add(c);
             System.out.println("Má»�i nháº­p hÃ¬nh tiáº¿p theo: ");
        }
           if(s.equals("Hexagon")){
            System.out.println("Má»�i báº¡n nháº­p tá»�a Ä‘á»™ 6 Ä‘iá»ƒm: ");
            int x1 = sc.nextInt(), y1 = sc.nextInt(),x2 = sc.nextInt(), y2 = sc.nextInt(),
                x3 = sc.nextInt(), y3 = sc.nextInt(),x4 = sc.nextInt(), y4 = sc.nextInt(),
                x5 = sc.nextInt(), y5 = sc.nextInt(),x6 = sc.nextInt(), y6 = sc.nextInt();
            
            Hexagon h = new Hexagon(true, x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6);
            if(h.isHexagon())
            layer.hinh.add(h);
            else
                System.out.println("Toa do khong phu hop");
             System.out.println("Má»�i nháº­p hÃ¬nh tiáº¿p theo: ");
        }
        
        n--;
        }
       
        Diagram d = new Diagram();
       
       
       
    }
}
