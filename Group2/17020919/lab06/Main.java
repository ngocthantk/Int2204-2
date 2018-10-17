package bai2;

import java.util.ArrayList;

public class Main {
	public static void PrintDiagram(ArrayList<Layer>dia)
	{
		Diagram d=new Diagram();	
		for(int i=0;i<dia.size();i++)
	  	  {
	  		 for(int j=0;j<dia.get(i).layer.size();j++)
	  		 {
	  			 System.out.println(dia.get(i).layer.get(j).toString());
	  		 }
	  	  }
			d.delete1(dia);
			System.out.println("Sau khia xoa");
			for(int i=0;i<dia.size();i++)
		  	  {
		  		 for(int j=0;j<dia.get(i).layer.size();j++)
		  		 {
		  			 System.out.println(dia.get(i).layer.get(j).toString());
		  		 }
		  	  }
	}
	public static void PrintLayer(ArrayList<Shape>lay)
	{
		Layer la1=new Layer();
		for(int i=0;i<lay.size();i++)
			{
				System.out.println(lay.get(i).toString());
			}
			la1.delete(lay);
			System.out.println("Sau khi xoa");
			for(int i=0;i<lay.size();i++)
			{
				System.out.println(lay.get(i).toString());
			}
	}
	public static void main(String[] args) {
		
		Layer la1=new Layer();
		Square s1=new Square(3);
		la1.layer.add(s1);		
		Circle c1=new Circle(2);
		la1.layer.add(c1);
		Triangle t1=new Triangle(1,2,3);
		la1.layer.add(t1);
		Circle c11=new Circle(3);
		la1.layer.add(c11);
		Rectangle r1=new Rectangle(2,3);
		la1.layer.add(r1);
		Circle c12=new Circle(4);
		la1.layer.add(c12);		
		Diagram d=new Diagram();	
		d.dia.add(la1);
        Layer la2=new Layer();
        
        
		Main.PrintDiagram(d.dia);
	
	}

}
