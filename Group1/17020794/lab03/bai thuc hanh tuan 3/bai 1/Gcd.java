import java.util.Scanner;
public class Gcd
{
    private int a;
    private int b;
    public Gcd(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    public int getA()
    {
        return this.a;
    }
    public int getB()
    {
        return this.b;
    }
    public int getGCD()
    {
        int x;
        int a=this.a, b=this.b;
        if(this.a<=0){
            a=-this.a;
        }
        if(this.b<=0){
            b=-this.b;
        }
        if(a==0&&b!=0)
        {
            x=b;
        }
        else if(b==0&&a!=0)
        {
            x=a;
        }
        else
        {
            while(a!=b)
            {
                if(a>b)
                {
                    a=a-b;
                }
                if(a<b)
                {
                    b=b-a;
                }
            }
            x=a;
        }
        
        return x;
     }
    public static void main(String args[])
    {
        int a, b;
        Scanner S=new Scanner(System.in);
        a=S.nextInt();
        b=S.nextInt();
        Gcd G=new Gcd(a, b);
        System.out.println(G.getGCD());
    }
}

