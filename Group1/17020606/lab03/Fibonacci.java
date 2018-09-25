import java.util. *;

public class Fibonacci {

    
    public static void main(String[] args) {
        System.out.println("Moi nhap so: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("Gia tri fibonacci la: " + Fibo(i));
    }
    public static int Fibo(int n){
        //su dung de quy de tinh gia tri ham Fibonacci
        switch(n){
            case 0:
                return 0;//tra ve gia tri dau tien
            case 1:
                return 1;//tra ve gia tri thu hai
            default:
                return Fibo(n-1) + Fibo(n-2);//neu khac 2 gia tri nay thi ap dung cong thuc
        }
        
    }
}
