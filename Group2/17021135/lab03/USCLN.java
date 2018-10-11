/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uscln;
import java.util.Scanner;

/**
 *
 * @author Le Quang Vu
 */
public class USCLN {
    private Scanner scanner = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        System.out.println("enter your number :");
        int a = scanner.nextInt();
        System.out.println("enter your number :");
        int b = scanner.nextInt();
        System.out.println("UCLN là :"+ USCLN(a,b));
    }
    public int USCLN(int a , int b){
       if(b==0) return a;
       return USCLN(b, a%b);
        
    }
}
