
package main;
import java.util.Scanner;
public class Main {
        public int UCLN(int a,int b){
            if(a < 0) a = -a;
            if(b < 0) b = -b; 
        while(a != b){
            if(a < b) {
                b = b - a;
            }
            else {
                a = a - b;
            }
        }
        return a;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Main m = new Main();
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(m.UCLN(a,b));
    }
    
}
