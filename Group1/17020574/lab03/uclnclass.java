/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucln;

/**
 *
 * @author Dat Anh
 */
import java.util.Scanner;
//Xay dung class tim ucln
public class uclnclass {
    private int a;
    private int b;
    public int getA(){
        return a;
    }
    public void setA(int a){
        this.a = a;
    }
    public int getB(){
        return b;
    }
    public void setB(int b){
        this.b = b;
    }
    //truyen 2 gia tri tu ban phim
    public void setNum()
    {
        Scanner cs = new Scanner(System.in);
        int num1 = cs.nextInt();
        int num2 = cs.nextInt();
        cs.close();
        this.setA(num1);
        this.setB(num2);
    }
    
    //tim UCLN
    public int findUlcn()
    {
        int min = Math.min(Math.abs(this.getA()), Math.abs(this.getB()));
        int k=1;
        for(int i = min; i >= 1; i--)
        {
            if(this.getA() % i == 0 && this.getB() % i == 0)
            {
                k = i;
                break;
            }
        }
        return k;
    }   
}
