/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucln_and_fibo;
import java.util.*;
 
public class UCLN_and_Fibo {

public int UCLN(int a, int b)
{
    a = Math.abs(a);
    b = Math.abs(b);
    if(a == 0 && b!=0)
        return b;
    else if(a !=0 && b == 0)
        return a;
    else
    {
        while(a!=b)
        {
            if(a>b)a-=b;
            else b-=a;
        }
    }
    return a;
  }
 public int Fibo(int n)
 {
     int []a = new int[n+1];
     a[0] = 0;
     a[1] = 1;
     for(int i=2; i<n+1; i++)
         a[i] = a[i-2]+a[i-1];
     return a[n];
         
 }
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b;
        Scanner s = new Scanner(System.in);
        a= s.nextInt();
        b= s.nextInt();
        UCLN_and_Fibo st = new UCLN_and_Fibo();
        System.out.println(st.UCLN(a, b));
        int n = s.nextInt();
        System.out.println(st.Fibo(n));
        
    }
    
}
