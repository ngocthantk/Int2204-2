/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan3;

/**
 *
 * @author FEELSBADMAN
 */
public class PhanSo {//  **câu 2**

    private int tuso;
    private int mauso;

    public PhanSo() {
        this.tuso = 2;
        this.mauso = 4;
    }

    public PhanSo(int a, int b) {
        if (b < 0) {
            b = -b;
            a = -a;
        }
        this.tuso = a;
        this.mauso = b;
        if (this.tuso != 0) {
            this.Rutgon();
        }

    }

    public void Rutgon() {// mục đính chính là để rút gọn sau khi thực hiện các phép toán
        tuan3 x;
        x = new tuan3();
        int temp = x.ucln(this.tuso, this.mauso);
        this.tuso = this.tuso / temp;
        this.mauso = this.mauso / temp;

    }

    public void print() {
        if (this.mauso == 1 || this.mauso == -1 || this.tuso == 0) {//trường hợp mẫu số bằng 0 thì chỉ in tử số
            System.out.println(this.tuso);
        } else if (this.mauso == 0) {
            System.out.println("Phan so ko hop le");
        } else {
            System.out.println(this.tuso + "/" + this.mauso);
        }
    }

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {//luôn đặt dấu âm ở tử số (nếu phân số mang giá trị âm)
        this.mauso = mauso;
        if (this.mauso < 0) {
            this.mauso = -this.mauso;
            this.tuso = -this.tuso;
        }
    }

    public void cong(PhanSo a) {//gán giá trị vào 1 phân số khác, tương tự các hàm dưới       
        this.setTuso(a.tuso * this.mauso + this.tuso * a.mauso);
        this.setMauso(a.mauso * this.mauso);
        if (this.tuso != 0) {
            this.Rutgon();
        }
    }

    public void tru(PhanSo a) {
        this.setTuso(-a.tuso * this.mauso + this.tuso * a.mauso);
        this.setMauso(a.mauso * this.mauso);
        if (this.tuso != 0) {
            this.Rutgon();
        }
    }

    public void nhan(PhanSo a) {
        this.setTuso(a.tuso * this.tuso);
        this.setMauso(a.mauso * this.mauso);
        if (this.tuso != 0) {
            this.Rutgon();
        }
    }

    public void chia(PhanSo a) {
        this.setTuso(a.tuso * this.mauso);
        this.setMauso(a.mauso * this.tuso);
        if (this.tuso != 0) {
            this.Rutgon();
        }
    }



    public boolean equals(Object obj) {
        if (obj instanceof PhanSo) {
            PhanSo a= (PhanSo) obj;
            double x = (double) this.tuso / (double) this.mauso;
            double y = (double) a.tuso / (double) a.mauso;
            return (x == y);
        }
        else return false;

    }

}
