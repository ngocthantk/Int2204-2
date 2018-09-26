import java.util.Scanner;
public class Fibonacci
{
    private int x;
    public int getFibonacci(int x)
    {
        if(x==0)
        {
            x=0;
            return x;
        }
        if(x==1)
        {
            x=1;
            return x;
        }
        if(x>1)
        {
            return getFibonacci(x-1)+getFibonacci(x-2);
        }
        return 0;
    }
    public static void main(String args[])
    {
        int n;
        Scanner S=new Scanner(System.in);
        n=S.nextInt();
        Fibonacci F=new Fibonacci();
        int x=F.getFibonacci(n);
        System.out.println(x);
    }
}
