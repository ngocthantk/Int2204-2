
import java.util.Scanner;

public class UCLN {
    private int num1;
    private int num2;
   
    public int getNum1(){
        return num1;}
    public int getNum2(){
        return num2;}
    public void setNum1(int Num1){
        this.num1=Num1;
    }
     public void setNum2(int Num1){
        this.num2=Num1;   
    }
    public void nhap(){
        System.out.println("nhap 2 so :");
    this.num1=new Scanner(System.in).nextInt();
    this.num2=new Scanner(System.in).nextInt();
    }
    public int UC(int num1, int num2){
       while (num2!=0){
           int tg = num1 % num2;
           num1=num2;
           num2=tg;
       }
       return num1;
}

    public static void main ( String[] args){
        UCLN gcd=new UCLN();
        gcd.nhap();
        System.out.println(gcd.UC(num1, num2));
    }
}
