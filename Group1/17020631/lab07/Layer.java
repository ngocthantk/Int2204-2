package lab06;

import java.util.ArrayList;

import lab05.Shape;

public class Layer{
	protected ArrayList<shape> hinhHoc = new ArrayList<shape>();
	 private boolean visible;
	//mang dong loai bo doi tuong tam giac  
	  public void deleteTriangle(){
	    for (int i = 0; i < hinhHoc.size(); i++){
		  if(hinhHoc.get(i) instanceof  Triangle){
			hinhHoc.remove(i);
			i--;
		  }
		}
	  }
	 // xoa hinh trung nhau
	  public void xoaHinhTrungNhau() {
		  for(int i=0;i<hinhHoc.size();i++) {
				  if(this.hinhHoc.get(i)instanceof Square) {
		    			 Square a = ( Square) this.hinhHoc.get(i);
		    			 for(int j=0;j<this.hinhHoc.size();j++) {
		    				if(this.hinhHoc.get(j)instanceof Square&&j!=i) {
		    					 Square  b =  (Square) this.hinhHoc.get(j);
		    					if(a.canh==b.canh&&b.tam==a.tam) {
		    						this.hinhHoc.remove(j);
		    						j--;
		    					}
		    				}
		    			}
		    		}
				  //
				  if(this.hinhHoc.get(i)instanceof Rectangle) {
		    			 Rectangle a = ( Rectangle) this.hinhHoc.get(i);
		    			 for(int j=0;j<this.hinhHoc.size();j++) {
		    				if(this.hinhHoc.get(j)instanceof Rectangle&&j!=i) {
		    					 Rectangle  b =  (Rectangle) this.hinhHoc.get(j);
		    					if(a.Chieudai==b.Chieudai&&a.tam==b.tam&&a.Chieurong==b.Chieurong) {
		    						this.hinhHoc.remove(j);
		    						j--;
		    					}
		    				}
		    			}
		    		}
				  //
				  if(this.hinhHoc.get(i)instanceof Circle) {
		    			 Circle a = ( Circle) this.hinhHoc.get(i);
		    			 for(int j=0;j<this.hinhHoc.size();j++) {
		    				if(this.hinhHoc.get(j)instanceof Circle&&j!=i) {
		    					 Circle  b =  (Circle) this.hinhHoc.get(j);
		    					if(a.ban_kinh==b.ban_kinh&&b.I==a.I) {
		    						this.hinhHoc.remove(j);
		    						j--;
		    					}
		    				}
		    			}
		    		}
				  //
				  if(this.hinhHoc.get(i)instanceof Triangle) {
		    			 Triangle a = ( Triangle) this.hinhHoc.get(i);
		    			 for(int j=0;j<this.hinhHoc.size();j++) {
		    				if(this.hinhHoc.get(j)instanceof Triangle&&j!=i) {
		    					 Triangle  b =  (Triangle) this.hinhHoc.get(j);
		    					if(a.A==b.A&&b.B==a.B&&b.C==a.C) {
		    						this.hinhHoc.remove(j);
		    						j--;
		    					}
		    				}
		    			}
		    		}
		  }
	  }
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	  
}
