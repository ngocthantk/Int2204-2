/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruit;

/**
 *
 * @author nguyen
 */
public class Fruit {

    
    public static void main(String[] args) {
        Camcaophong ccp = new Camcaophong();
        ccp.gia=("30000vnđ/kg");
        ccp.ngaynhap=("10/10/2017");
        ccp.nguongoc=("cao phong");
        ccp.soluong=("100kg");
        ccp.getinfo();
        Camsanh cs =new Camsanh();
        cs.gia=("25000vnđ/kg");
        cs.ngaynhap=("10/10/2017");
        cs.nguongoc=("ha giang");
        cs.soluong=("100kg");
        cs.getinfo();
        Tao tao = new Tao();
        tao.gia=("200000vnđ/kg");
        tao.ngaynhap=("10/10/2017");
        tao.nguongoc=("American");
        tao.soluong=("100kg");
        tao.loaitao=("tao my");
        tao.getinfo();
    }
    
}
