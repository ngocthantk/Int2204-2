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
public class dad {
     private String ten ;
	private int tuoi ;
	private String  nghe;
	public dad (String ten, int tuoi , String nghe ){
            
        }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNghe() {
        return nghe;
    }

    public void setNghe(String nghe) {
        this.nghe = nghe;
    }
     public dad () {
		this.ten = "Hoi" ;
		this.tuoi =44;
		this.nghe = "nong dan";
	} 
}
