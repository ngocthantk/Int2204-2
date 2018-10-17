/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoaqua;


public class HoaQua {
    private String root;          // nguon goc
    public HoaQua(){
        this.root="Viet Nam";
    }
    public void setRoot(String root){           //cài nguồn gốc
        this.root=root;
    } 
    public String getRoot(){          //lấy nguồn gốc
        return this.root;
    }
    public static void main(String args[]){
        HoaQua H=new HoaQua();
        QuaCam Q=new QuaCam();
        QuaTao T=new QuaTao();
        CamSanh C1=new CamSanh();
        C1.setRoot("Trung Quoc");
        CamCaoPhong C2=new CamCaoPhong();
        C2.setGiaBan(1000);
         System.out.println(H.getRoot());
        System.out.println(Q.getSoLuong());
        System.out.println(T.getSoLuong());
        System.out.println(C1.getGiaBan());
        System.out.println(C1.getRoot());
        System.out.println(C2.getGiaBan());
    }
}
