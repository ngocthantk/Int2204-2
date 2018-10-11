/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap51;

public class Cam extends HoaQua {
    public Cam(){}    
    public Cam(double gia, String goc, String nnhap,int sl){
        super(gia,goc,nnhap,sl);
    }    
}
class camSanh extends Cam{
    public camSanh(){}   
    public camSanh(double gia, String goc, String nnhap,int sl){
        super(gia,goc,nnhap,sl);
    }   
}
class camCaoPhong extends Cam{
    public camCaoPhong(){}
    public camCaoPhong(double gia, String goc, String nnhap,int sl){
        super(gia,goc,nnhap,sl);
    }   
}
