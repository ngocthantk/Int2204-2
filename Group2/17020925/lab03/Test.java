package test;

import java.util.*;

public class Test {

   public int Ucln(int num1 , int num2)  // hàm tìm ước chung lớn nhất của 2 số num1 và num2
	{  
		int u = 1; 
		for(int i = 1;i <= num1;i++) 
		{
			if(num1 % i == 0 && num2 % i == 0) 
			{
				u = i;
			}
		}
		return u;
	}
	public int Fibo(int n) // hàm tính Fibonaxi của số n
	{       
		if (n==0)		
		    return n;
		if(n==1)
		    return n;
                else 
             return Fibo(n-1)+Fibo(n-2);
                     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,n;
        System.out.println("nhap a : ");
        a = sc.nextInt();
        System.out.println("nhap b : ");
        b = sc.nextInt();
        Test Tim = new Test();
        System.out.println("ucln cua a va b la : " + Tim.Ucln(a,b));
        System.out.println("nhap n : ");
        n = sc.nextInt();
        System.out.println("so Fibonaxi cua n la : " + Tim.Fibo(n));  
    }
    
}
