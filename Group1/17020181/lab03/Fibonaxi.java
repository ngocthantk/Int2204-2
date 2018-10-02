import java.util.Scanner ;

public class Fibonaxi {
    private int a;
    
    public int getA(){
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    
    public void InputFibo() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap n: " );
        int soN = s.nextInt();
        this.setA(soN);
    }
    
    public static int fibo(int n) {
        if(n==1 || n==2) {
            return 1;
        }
        else {
            return (fibo(n-1)+fibo(n-2));
        }
        
    }
    
    public static void main(String[] args) {
        Fibonaxi f = new Fibonaxi();
        f.InputFibo();
        System.out.println("So fibonaxi thu n la: " + Fibonaxi.fibo(f.getA()) );  
    }
}
