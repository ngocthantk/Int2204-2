/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findmax;


 
 public class Maxum {
	private int a;
	private int b;
	public Maxum(int a, int b){
		this.a=a;
		this.b=b;
	}
        public int getA(){
            return this.a;
        }
        public int getB(){
            return this.b;
        }
	public static int Max(Maxum m) {
		if(m.getA()<=m.getB()) {
			return m.getB();
		}
		else {
			return m.getA();
		}
	}
}
