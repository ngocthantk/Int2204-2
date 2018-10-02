/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaci;
import java.util.Scanner;

/**
 *
 * @author Le Quang Vu
 */
public class Fibonaci {
    private Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        System.out.println("your number :" );
        int n = scanner.nextInt();
        System.out.println("fibonaci array :");
        for(int i=0;i<n;i++){
            System.out.print(fibonaci(i)+ " ");
        }
    }
public int fibonaci(int n){
    if(n<0){
        return -1;
    }else if(n == 0 || n == 1){
        return n;
    }else{
        return fibonaci(n-1)+fibonaci(n-2);
    }
}    
}
