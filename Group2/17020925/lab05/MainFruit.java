package Fruit;

public class MainFruit{
        public static void main( String[] args ){
           Fruit fr = new Fruit();
           fr.setSoluong(3);
           System.out.println(fr.getSoluong());
           
           QuaTao qt = new QuaTao();
           qt.setSoluong(5);
           qt.setGia(3000);
           System.out.println(qt.getSoluong()+","+qt.getGia());
	   
           QuaCam qc = new QuaCam();
           qc.setSoluong(6);
           qc.setNguongoc("Ha noi");
           System.out.println(qc.getSoluong()+","+qc.getNguongoc());
           
	   CamCaoPhong ccp = new CamCaoPhong();
           ccp.setSoluong(2);
          ccp.setNguongoc("HCM");
          ccp.setGia(5000);
          System.out.println(ccp.getSoluong()+","+ccp.getNguongoc()+","+ccp.getgia());
          
 	   CamSanh cs = new CamSanh();
          cs.setSoluong(1);
          cs.setCan(10);
          System.out.println(cs.getSoluong()+","+cs.getCan());
}
}