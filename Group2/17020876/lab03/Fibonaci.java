import java.util.Scanner;
public class Fibonaci {
    private int n;
    private int getN() {
        return n;
    }
    public void setNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so tu nhien n = ");
        int x = input.nextInt();
        this.n = x;
    }
    public int Fibonaci_n(int n) {
        if(n == 0) 
            return 0;
        if(n == 1)
            return 1 ;
        else return Fibonaci_n(n-1) + Fibonaci_n(n-2);
    }
    
    public static void main(String[] args) {
        Fibonaci Fibo = new Fibonaci();
        Fibo.setNumber();
        System.out.println(" So Fibonaci thu " + Fibo.getN() + " la: " + Fibo.Fibonaci_n(Fibo.getN()));
    }
}
