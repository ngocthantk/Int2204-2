/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan2;

public class PS {
	private int ts,ms;
	public PS() {
		this.ts = 1;
		this.ms = 1;
	}
	public PS(int ts,int ms) {
		this.ts = ts;
		this.ms = ms;
	}
	
	public void setT(int ts) {
		this.ts = ts;
	}
	public void setM(int ms) {
		this.ms = ms;
	}
	public int getT() {return this.ts;}
	public int getM() {return this.ms;}
	
	public int ucln(int a,int b) {
		if(b == 0) return a;
		else return ucln(b , a%b);
	}
	
	public void rutGon() {
		int n = ucln(this.ts, this.ms);
                int a = this.ts/n , b = this.ms/n;
                if(b < 0){
                    a = -a;
                    b = -b;
                }
		this.setT(a);
		this.setM(b);
	}
	
	public PS cong (PS b) {
		int tss = this.ts*b.ms + b.ts*this.ms;
		int mss = this.ms * b.ms;
		PS c = new PS(tss,mss);
		c.rutGon();
		return c;
	}
	
	public PS tru (PS b) {
		int tss = this.ts*b.ms - b.ts*this.ms;
		int mss = this.ms * b.ms;
		PS c = new PS(tss,mss);
		c.rutGon();
		return c;
	}
	
	public PS nhan (PS b) {
		int tss = this.ts*b.ts;
		int mss = this.ms * b.ms;
		PS c = new PS(tss,mss);
		c.rutGon();
		return c;
	}
	
	public PS chia (PS b) {
		int tss = this.ts*b.ms;
		int mss = this.ms * b.ts;
		PS c = new PS(tss,mss);
		c.rutGon();
		return c;
	}
	
	public boolean equals(Object obj) {
               if(this == obj) return true;
               if(obj instanceof PS){
                   PS ps1 = (PS) obj;
                   if(this.ts * ps1.ms == this.ms * ps1.ts) 
                       return true;
               }
               return false;
	}
}

