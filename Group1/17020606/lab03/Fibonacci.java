import java.util. *;
public class fibonacci {

    
    public static void main(String[] args) {
        System.out.println("Moi nhap so: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        fibonacci fb = new fibonacci();
        System.out.println("Gia tri fibonacci la: " + fb.Fibo(i));
    }
    public int Fibo(int n){
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
