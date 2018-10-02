/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phanso;

/**
 *
 * @author Dat Anh
 * 
 */
public class PS {
    private int tu, mau;

    public void setTu(int tu) {
        this.tu = tu;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }
    public PS(int tu, int mau){
        this.tu = tu;
        this.mau = mau;
    }
    public PS cong(PS n){
        return new PS(tu * n.mau + n.tu * mau, mau * n.mau);
    }
    public PS tru(PS n){
        return new PS(tu * n.mau - n.tu * mau, mau * n.mau);
    }
    public PS nhan(PS n){
        return new PS(tu * n.tu, mau * n.mau);
    }
    public PS chia(PS n){
        return new PS(tu * n.mau, mau * n.tu);
    }
    public void InPS(){
        int a = Math.abs(tu);
        int b = Math.abs(mau);
        while(a != b){
            if (a > b) a -= b;
            else b -= a;
        }
        System.out.print(tu/a + "/" + mau/a);
    }
    public boolean equals(Object obj){
        if(obj instanceof PS)
        {
            PS m = (PS)obj;
            double x = (double) this.tu / (double) this.mau;
            double y = (double) m.tu / (double) m.mau;
            return (x == y);
        }
        else return false;
    }
    public float getValue(){
        return (float)tu/(float)mau;
    }
}
