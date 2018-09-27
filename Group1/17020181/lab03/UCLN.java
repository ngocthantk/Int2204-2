import java.util.Scanner;

public class UCLN {
    private int a;
    private int b;
    
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    
    public void InputUCLN(){
        System.out.println("Nhap vao 2 so a va b ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        int soA = sc.nextInt();
        System.out.print("Nhap so b: ");
        int soB = sc.nextInt();
        this.setA(soA);
        this.setB(soB);
    }
	
    public int TimUCLN(int a, int b){
            if(b == 0) {
                return a;
            }
            return TimUCLN(b,a % b);
    } 
	
    public static void main(String[] agrs) {
        UCLN u = new UCLN();
        u.InputUCLN();
        System.out.print("Uoc chung lon nhat la: ");
        System.out.println (u.TimUCLN(u.getA(), u.getB()));
    }
    
}
