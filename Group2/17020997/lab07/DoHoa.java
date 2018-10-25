
package dohoa;

import java.awt.Canvas;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.*;
  
public class DoHoa extends Layer{
    public static Layer layer = new Layer();  
    public static Layer tron = new Layer();
      public static JFrame jframeTron = new JFrame();
     
    /**
     *
     */
   
   

   
    public static void main(String[] args) {
        System.out.println("Nhập số hình: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
         System.out.println("Nhập vào các hình: Circle, Rectangle, Square, Triangle, Hexagon");
        
        while(n!=0){
            Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
     
        if(s.equals("Circle")){
            System.out.println("Mời bạn nhập tọa độ tâm và bán kính: ");
            int x = sc.nextInt(), y = sc.nextInt(), r = sc.nextInt();
            
            Circle c = new Circle(false, x, y, r);
            layer.hinh.add(c);
             System.out.println("Mời nhập hình tiếp theo: ");
        }
        if(s.equals("Rectangle")){
            System.out.println("Mời bạn nhập tọa độ điểm bắt đầu và CD, CR: ");
            int x = sc.nextInt(), y = sc.nextInt(), cd = sc.nextInt(), cr = sc.nextInt();
           if(cd == cr){
               System.out.println("Hình này sẽ trở thành hình vuông");
           }
            Rectangle c = new Rectangle(false, x, y, cd, cr);
            layer.hinh.add(c);
             System.out.println("Mời nhập hình tiếp theo: ");
        }
         if(s.equals("Triangle")){
            System.out.println("Mời bạn nhập tọa độ 3 đỉnh: ");
            int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt(), x3 = sc.nextInt(), y3 = sc.nextInt();
           
            Triangle c = new Triangle(false, x1, y1, x2, y2, x3, y3);
            layer.hinh.add(c);
             System.out.println("Mời nhập hình tiếp theo: ");
        }
         if(s.equals("Square")){
            System.out.println("Mời bạn nhập tọa độ điểm bắt đầu và cạnh: ");
            int x = sc.nextInt(), y = sc.nextInt(), canh = sc.nextInt();
           
            Square c = new Square(false, x, y, canh);
            layer.hinh.add(c);
             System.out.println("Mời nhập hình tiếp theo: ");
        }
           if(s.equals("Hexagon")){
            System.out.println("Mời bạn nhập tọa độ 6 điểm: ");
            int x1 = sc.nextInt(), y1 = sc.nextInt(),x2 = sc.nextInt(), y2 = sc.nextInt(),
                x3 = sc.nextInt(), y3 = sc.nextInt(),x4 = sc.nextInt(), y4 = sc.nextInt(),
                x5 = sc.nextInt(), y5 = sc.nextInt(),x6 = sc.nextInt(), y6 = sc.nextInt();
            
            Hexagon h = new Hexagon(true, x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6);
            if(h.isHexagon())
            layer.hinh.add(h);
            else
                System.out.println("Toa do khong phu hop");
             System.out.println("Mời nhập hình tiếp theo: ");
        }
        
        n--;
        }
       
        Diagram d = new Diagram();
       
       
       
    }
    
}
