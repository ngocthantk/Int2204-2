
package fibonaxi;
import java.util.Scanner;
public class Fibonaxi {
    public int fibonaxi(int n){
        if(n == 0 || n == 1){
            return n;
        }
        else {
            return fibonaxi(n-1) + fibonaxi(n-2);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Fibonaxi f = new Fibonaxi();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(f.fibonaxi(n));
    }
    
}
