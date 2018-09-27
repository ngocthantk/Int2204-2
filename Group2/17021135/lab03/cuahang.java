/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectively;

/**
 *
 * @author Le Quang Vu
 */
public class cuahang {
    private String ten ;
	private String diachi ;
	private String  mathang;
	public cuahang (String ten, int diachi , String mathang ){
            
}

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getMathang() {
        return mathang;
    }

    public void setMathang(String mathang) {
        this.mathang = mathang;
    }
     public cuahang () {
		this.ten = "tgdd" ;
		this.diachi ="156 xuan thuy,cau giay";
		this.mathang = "dien thoai";
	} 
}