/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tuann_000
 */
public class khoiTao {
    public static void main(String[] args){
        hoaQua h1 = new hoaQua() {

            @Override
            public String getTenHoaQua() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        } ;
     quaCam qc = new quaCam("cam sanh", "chua");
     quaTao qt = new quaTao("tao dam","thoi");
     camCaoPhong ccp = new camCaoPhong("cam cao phong", "chua");
     camSanh cs = new camSanh("cam sanh", "chua");
    }
}
