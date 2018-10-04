import java.util.Scanner;

public class PhanSo {
    private int tu;
    private int mau;
    
    public int getTu() {
        return tu;
    }
    public void setTu(int tu) {
        this.tu = tu;
    }
    
    public int getMau() {
        return mau;
    }
    public void setMau(int mau) {
        this.mau = mau;
    }
    
    
    public void InputPS() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan so: ");
        int tus = sc.nextInt();
        System.out.print("/");
        int maus = sc.nextInt();
        this.setTu(tus);
        this.setMau(maus);
    }
    
    public int TimUCLN(int a, int b) {
        if(b == 0) {
            return a;
        }
        return TimUCLN(b, a % b);
   
    }
    
    public void ToiGianPS(PhanSo ps) {
        int temp = TimUCLN(ps.tu, ps.mau);
        ps.tu = (ps.tu/temp);
        ps.mau = (ps.mau/temp);
        if(ps.mau < 0) {
            ps.tu = -ps.tu;
            ps.mau = -ps.mau;
            
        }
    }
    
    public void Cong(PhanSo ps) {
        PhanSo tong = new PhanSo();
        tong.tu = this.getTu()*ps.getMau() + ps.getTu()*this.getMau();
        tong.mau = this.getMau()*ps.getMau();
        ToiGianPS(tong);
        if((tong.tu==1 && tong.mau==1)|| (tong.mau==1) ) {
            System.out.print("Tong: (" + this.getTu() + "/" + this.getMau() + ") + (");
            System.out.println(ps.getTu() + "/" + ps.getMau() + ") = " + tong.tu );
        }
        else if(tong.mau == 0 || tong.tu==0) {
            System.out.print("Tong: (" + this.getTu() + "/" + this.getMau() + ") + (");
            System.out.println(ps.getTu() + "/" + ps.getMau() + ") = " + tong.tu ); 
        }
        else {
            System.out.print("Tong: (" + this.getTu() + "/" + this.getMau() + ") + (");
            System.out.println(ps.getTu() + "/" + ps.getMau() + ") = " + tong.tu + "/" + tong.mau);
        }
    }
    
    public void Tru(PhanSo ps) {
        PhanSo hieu = new PhanSo();
        hieu.tu= this.getTu()*ps.getMau() - ps.getTu()*this.getMau();
        hieu.mau = this.getMau()*ps.getMau();
        
        ToiGianPS(hieu);
        if((hieu.tu==1 && hieu.mau==1)|| (hieu.mau==1) ) {
            System.out.print("Hieu: (" + this.getTu() + "/" + this.getMau() + ") - (");
            System.out.println(ps.getTu() + "/" + ps.getMau() + ") = " + hieu.tu );
        }
        else if(hieu.mau == 0 || hieu.tu==0) {
            System.out.print("Hieu: (" + this.getTu() + "/" + this.getMau() + ") - (");
            System.out.println(ps.getTu() + "/" + ps.getMau() + ") = " + hieu.tu ); 
        }
        else {
            System.out.print("Hieu: (" + this.getTu() + "/" + this.getMau() + ") - (");
            System.out.println(ps.getTu() + "/" + ps.getMau() + ") = " + hieu.tu + "/" + hieu.mau);
        }
    }
    
    public void Nhan(PhanSo ps) {
        PhanSo tich = new PhanSo();
        tich.tu = this.getTu() * ps.getTu();
        tich.mau = this.getMau()* ps.getMau();
        ToiGianPS(tich);
        if((tich.tu==1 && tich.mau==1)|| (tich.mau==1) ) {
            System.out.print("Tich: (" + this.getTu() + "/" + this.getMau() + ") * (");
            System.out.println(ps.getTu() + "/" + ps.getMau() + ") = " + tich.tu );
        }
        else if(tich.mau == 0 || tich.tu==0) {
            System.out.print("Tich: (" + this.getTu() + "/" + this.getMau() + ") * (");
            System.out.println(ps.getTu() + "/" + ps.getMau() + ") = " + tich.tu ); 
        }
        else {
            System.out.print("Tich: (" + this.getTu() + "/" + this.getMau() + ") * (");
            System.out.println(ps.getTu() + "/" + ps.getMau() + ") = " + tich.tu + "/" + tich.mau);
        }
    }
    
    public void Chia(PhanSo ps) {
        PhanSo thuong = new PhanSo();
        thuong.tu = this.getTu() * ps.getMau();
        thuong.mau = this.getMau() * ps.getTu();
        ToiGianPS(thuong);
        if((thuong.tu==1 && thuong.mau==1)|| (thuong.mau==1) ) {
            System.out.print("Thuong: (" + this.getTu() + "/" + this.getMau() + ") / (");
            System.out.println(ps.getTu() + "/" + ps.getMau() + " = " + thuong.tu );
        }
        else if(thuong.mau == 0 || thuong.tu==0) {
            System.out.print("Thuong: (" + this.getTu() + "/" + this.getMau() + ") / (");
            System.out.println(ps.getTu() + "/" + ps.getMau() + " = " + thuong.tu ); 
        }
        else {
            System.out.print("Thuong: (" + this.getTu() + "/" + this.getMau() + ") / (");
            System.out.println(ps.getTu() + "/" + ps.getMau() + ") = " + thuong.tu + "/" + thuong.mau);
        }
    }
    
/*    public boolean equals(Object obj){
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        PhanSo other = (PhanSo) obj;
        
    } */  
    
    public static void main(String[] args) {
        PhanSo a= new PhanSo();
        PhanSo b = new PhanSo();
        a.InputPS();
        b.InputPS();
        
        a.Cong(b);
        a.Tru(b);
        a.Nhan(b);
        a.Chia(b);
        
        
    }
    
}
