/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap51;


public class main{
    public static void main(String[] args){
        Cam c = new Cam(5,"Viet Nam", "3/5", 43);
        camSanh cs = new camSanh(8.5, "Viet Nam", "2/9", 30);
        camCaoPhong cp = new camCaoPhong(7.5,"Thai Lan", "12/9", 45);
        Tao ap = new Tao(15, "My", "5/9", 25);
        System.out.println( "----Thong tin qua cam----\n"+ c.print());
        System.out.println( "----Thong tin qua cam sanh----\n"+ cs.print());
        System.out.println( "----Thong tin qua cam cao phong----\n"+ cp.print());
        System.out.println( "----Thong tin qua tao----\n"+ ap.print());
 
    }
}