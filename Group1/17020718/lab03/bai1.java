package oop.java;

public class bai1 {

	// ham tinh uoc chung lon nhat
    public int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
	// ham tinh so fibonacci
	public int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
 
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
	
	//ham main dung de kiem tra
	public static void main(String arg[]) {
		bai1 m = new bai1();
		int a = -15, b =5;
		int c = m.USCLN (a,b);
		int d = m.fibonacci(5);
		System.out.println(c);
		System.out.println(d);
		
	
	}


}
