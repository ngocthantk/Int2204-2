package Phanso;
import java.util.Scanner;
public class PhansoMain {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		Phanso a = new Phanso();
		Phanso b = new Phanso();
		int n;
		n = sc.nextInt();	a.setTu(n);
		n = sc.nextInt(); 	a.setMau(n);
		n = sc.nextInt();	b.setTu(n);
		n = sc.nextInt();	b.setMau(n);	
		System.out.println(a.equals(b));
		char c;
		c = sc.next().charAt(0);
		a.process(b,c);
		sc.close();
	}

}
