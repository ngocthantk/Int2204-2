/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author Nhozx
 */
public class PS { //phan so co hai thuoc tinh la tu so va mau so
    private int tu;
    private int mau;
    //ham khoi tao co tham so truyen vao la tu va mau
    public PS(int tu, int mau){
        this.tu = tu;
        this.mau = mau;
    }

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
    //ham cong phan so truyen vao 2 phan so va tra ve 1 phan so la ket qua
    public PS Addition(PS ps1){
        PS result = new PS(ps1.mau * this.tu + ps1.tu * this.mau, ps1.mau*this.mau);
        return result;
    }
    //ham tru phan so
    public PS Subtraction(PS ps1){
        PS result = new PS(ps1.tu * this.mau - ps1.mau * this.tu, ps1.mau*this.mau);
        return result;
    }
    //ham nhan phan so
    public PS Multiplication(PS ps1){
        PS result = new PS(ps1.tu*this.tu, ps1.mau*this.mau);
        return result;
    }
    //ham chia phan so
    public PS Division (PS ps1){
        PS result = new PS(ps1.tu * this.mau, this.mau * this.tu);
        return result;
    }
    //ham so sanh 2 phan so neu sau khi quy dong 2 tu so bang nhau thi bang nhau
    @Override
    public boolean equals(Object obj){
        if(obj instanceof PS) {
//           PS other = (PS) obj;
            return ((PS) obj).getTu() * this.mau == ((PS) obj).getMau() * this.tu;
        }
        else return false;
    }
    //ham rut gon phan so tim ra UCLN roi rut gon
    public void rugon(){
        int a = Math.abs(tu);
        int b = Math.abs(mau);
        if(a == 0 ) tu = 0;
        while(a % b != 0 && b % a != 0){
            if(a > b) {
                a = a % b;
            }
            else{
                b = b % a;
            }
        }
        if(a > b) {
            tu = tu / b;
            mau = mau / b;
        }
        else {
            tu = tu /a;
            mau = mau / a;
        }
    }
    //in ra phan so

    @Override
    public String toString(){
        rugon();
        return this.tu+"/"+this.mau;
    }
}
