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
public class truong {
    private String ten ;
	private String diachi ;
	private String  caphoc;
	public truong (String ten, int diachi , String caphoc ){
            
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

    public String getCaphoc() {
        return caphoc;
    }

    public void setCaphoc(String caphoc) {
        this.caphoc = caphoc;
    }
    public truong () {
		this.ten = "dai hoc quoc gia ha noi" ;
		this.diachi ="144 xuan thuy,cau giay";
		this.caphoc = "dai hoc";
	} 
}
