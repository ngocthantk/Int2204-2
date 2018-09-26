import java.util.Scanner;
        
public class HocSinh {
     private String name;
    private String MSV;
    private String Lop;
    
    public void setName( String name) {
            this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setMSV( String msv) {
            this.MSV = msv;
    }
    public String getMSV(){
        return MSV;
    }
    
    public void setLop( String lop) {
            this.Lop = lop;
    }
    public String getLop(){
        return Lop;
    }
    
    public static void getInforHS(){
        HocSinh A = new HocSinh();
        A.setName("Luc Thi Thao");
        A.setMSV("17021023");
        A.setLop("QH2017 C");
        
        System.out.println("Ho va ten: " + A.getName());
        System.out.println("Ma so SV: " + A.getMSV());
        System.out.println("Lop khoa hoc: " + A.getLop());
        
    }
}

    
}
