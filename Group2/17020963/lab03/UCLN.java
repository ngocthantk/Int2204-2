import java.util.Scanner;

public class UCLN {
	private int a;
	private int b;
//khoi tao a,b
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
//ham nhap a, b	
	public void setNumber() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so nguyen duong a = ");
        int x = input.nextInt();
        System.out.print("Nhap so nguyen duong b = ");
        int y = input.nextInt();
		this.a = x;
		this.b = y;
	}
//ham tim uoc chung lon nhat
	public int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
//ham main
	public static void main(String[] args) {
		UCLN gcd = new UCLN();
		gcd.setNumber();
		System.out.println("USCLN cua " + gcd.getA() + " va " + gcd.getB() + " la: " + gcd.USCLN(gcd.getA(), gcd.getB()));
	}
}