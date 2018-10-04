/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TenClass;

/**
 *
 * @author tuann_000
 */
public class Crush {
  private  int CanNang, ChieuCao;
  private String MauToc;
  private Boolean IsLoveMe;
  // Hàm setter
  public void setCanNang(int CanNang){
      this.CanNang= CanNang;
  }
  public void setChieuCao(int ChieuCao){
      this.ChieuCao= ChieuCao;
  }
  public void setMauToc(String MauToc){
      this.MauToc=MauToc;
  }
  public void setIsLoveMe(Boolean CoYeuKhong){
      this.IsLoveMe=CoYeuKhong;
  }
  // Hàm getter
  public int getCanNang(){
      return this.CanNang;
  }
  public int getChieuCao(){
      return this.ChieuCao;
  }
  public String getMauToc(){
      return this.MauToc;
  }
  public Boolean getIsLoveMe(){
      return this.IsLoveMe;
  }
}
