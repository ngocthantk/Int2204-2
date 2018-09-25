package lab03.java;

public class Bai01 {
	
	
public int Fibonaci(int x)
{
	if(x==1||x==0) {return 1;}
	return Fibonaci(x-1)+Fibonaci(x-2);
}
public  int UCLN_(int a, int b) {
	if(a<0) {a=-a;}
	if(b<0) {b=-b;}
        while (a != b) {
               if (a > b)
                     a = a - b;
               else
                     b = b - a;
        }
        return (a);
	
 }
	public static void main(String[] args) {
		Bai01 test=new Bai01();
		int k= test.UCLN_(-20,4);
		//System.out.println(test.Fibonaci(5));
		System.out.println(k);
		PhanSo a=new PhanSo(-3,5);
		PhanSo b=new PhanSo(3,-5);
		System.out.println(a.equals(b)	);
		//
	}

}
