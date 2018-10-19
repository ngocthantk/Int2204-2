package lab06;

public class Lab06 {

    
    public static void main(String[] args) {
        
        Circle c = new Circle(3);
        Triangle t = new Triangle(3,2,6);
        Rectangle r = new Rectangle(3,4);
        Square s = new Square(9);
        Diagram di = new Diagram();
        Layer la = new Layer();
        la.add(c);
        la.add(t);
        la.add(r);
        la.add(s);
        
        System.out.println("\nTruoc khi xoa: \n");
         for(int i = 0;i < la.size();i ++){
              la.elementAt(i).Thongso();}
          la.eraseTriangle();
        System.out.println("\nSau khi xoa hinh tam giac: \n");
        for(int j = 0;j < la.size();j ++)
        {la.elementAt(j).Thongso();}
        
       di.add(la);
        di.eraseCircle();
         System.out.println("\nSau khi xoa hinh tron: \n");
        for(int j = 0;j < di.size();j ++){
            for(int k = 0;k < di.elementAt(j).size();k ++)
                    di.elementAt(j).elementAt(k).Thongso();
                }
        
        }
    }