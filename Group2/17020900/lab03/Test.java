package minh.dim;

import java.util.Scanner;

public class Test {
	public int kiemtra(int x , int y) {  // hàm tìm ước chung lớn nhất của 2 số x và y
		int n = 1;
		x = Math.abs(x);
		y = Math.abs(y);
		for(int i = 1;i <= x;i++) {
			if(x % i == 0 && y % i == 0) {
				n = i;
			}
		}
		return n;
	}
	public int Fibonaxi(int z) {       // hàm tính Fibonaxi của số z
		int a = 0;
		int b = 1;
		for(int i = 2;i <= z;i++) {
			int c = b;
			b += a;
			a = c;
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b; 				// khai báo biến a,b
		System.out.print("nhập a : ");
		a = sc.nextInt(); 		// nhập giá trị cho biến a
		System.out.print("nhập b : ");
		b = sc.nextInt(); 		// nhập giá trị cho biến b
		Test logo = new Test(); // khai báo đối tượng logo
		System.out.println("ước chung lớn nhất của a và b là :" + logo.kiemtra(a,b));
		System.out.print("nhập n : ");
		int n = sc.nextInt();
		System.out.println("số Fibonaxi của n là : " + logo.Fibonaxi(n));
		
	}

}
