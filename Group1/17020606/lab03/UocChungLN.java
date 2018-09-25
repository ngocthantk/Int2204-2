import java.util. *;

public class UocChungLN{

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("UCLN cua 2 so la: " + UCLN(x,y));
    }
    public static int UCLN(int a, int b){
        //ham de quy tim UCLN cua 2 so nguyen
        int temp ,x;
        if (a < b){
            temp = a;a = b;b = temp;
            //khi o trong ham nay thi gia tri a luon >= gia tri b
        }
        x = a - b;//hieu 2 gia tri
        switch (x) {
            case 0:
                return a;//neu hieu 2 gia tri bang nhau mac dinh UCLN chinh la 2 so do
            case 1:
                return 1;//neu hieu 2 gia tri bang 1 thi tra ve gia tri 1
            default:
                return UCLN(b,x);//neu khac 2 truong hop tren thi de quy ham nay
                
        }
        //ham se chay cho den khi nao tra ve gia tri a hoac 1;
        //gia tri a se thay doi sau moi lan de quy
        //luu y : ham se gay ra loi neu 2 tham so ban dau(a,b) co gia tri = 0
    }
}