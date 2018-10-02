package tuan2;

public class Exercise {
// cau 1a:
	public int GCD(int a, int b) { // tim uoc chung lon nhat
		int x;
		while(b!=0) {
		x=a%b;
		a=b;
		b=x;
		}
		return a;
	}
// cau 1b:
	public String Fibonaxi (int x) { // de quy tim fibonaxi
		if(x==0) { return "0"; }    
		else if(x==1) { return "1"; }
		else { return Fibonaxi(x-1)+Fibonaxi(x-2); }
	}
	public static void main(String[] args) {
		Exercise t = new Exercise(); // obj dung de thuc hien phuong thuc  
		System.out.println(t.GCD(-15, 5));  
		System.out.println(t.Fibonaxi(5));
	}
}
