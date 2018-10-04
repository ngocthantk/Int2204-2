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
public class game {
    private String ten ;
	private String theloai ;
	private String  nhaphathanh;
	public game (String ten, String theloai , String nhaphathanh ){
            
}

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getNhaphathanh() {
        return nhaphathanh;
    }

    public void setNhaphathanh(String nhaphathanh) {
        this.nhaphathanh = nhaphathanh;
    }
    public game () {
		this.ten = "lien quan mobile" ;
		this.theloai ="moba";
		this.nhaphathanh = "garena";
	} 
}
