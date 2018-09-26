/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps;

/**
 *
 * @author Le Quang Vu
 */
public class PS {
    private int tu, mau;
    public PS(int tu, int mau){
        this.tu = tu;
        this.mau = mau;
    }
    public int getTu(){
        return tu;
    }
    public int getMau(){
        return mau;
    }
    public void setTu(int tu){
        this.tu = tu;
    }
    public void setMau(int mau){
        this.mau = mau;
    }
    public int USCLN(int a, int b){
        if(b==0) return a;
       return USCLN(b, a%b);
    }
    public void toiGianPhanSo() {
        int i = USCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }
     
    public PS congPS(PS ps) {
        int tu = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int mau = this.getMau() * ps.getMau();
        PS PSTong = new PS(tu, mau);
        PSTong.toiGianPhanSo();
        return PSTong;
    }
      
    public PS truPS(PS ps) {
        int tu = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int mau = this.getMau() * ps.getMau();
        PS PSHieu = new PS(tu, mau);
        PSHieu.toiGianPhanSo();
        return PSHieu;
    }
     
    public PS nhanPS(PS ps) {
        int tu = this.getTu() * ps.getTu();
        int mau = this.getMau() * ps.getMau();
        PS PSTich = new PS(tu, mau);
        PSTich.toiGianPhanSo();
        return PSTich;
    }
     
    public PS chiaPS(PS ps) {
        int tu = this.getTu() * ps.getMau();
        int mau = this.getMau() * ps.getTu();
        PS PSThuong = new PS(tu, mau);
        PSThuong.toiGianPhanSo();
        return PSThuong;
    }
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj instanceof PS){
            PS ps1=(PS) obj;
            return(this.tu*ps1.mau == this.mau*ps1.tu);
        }
        else return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PS ps1=new PS(5,-3);
        PS ps2=new PS(-5,3);
        PS ps = ps1.congPS(ps2);
        System.out.println(ps1.equals(ps2));
        System.out.println(ps.getTu()+"/"+ps.getMau());
    }
    
}
