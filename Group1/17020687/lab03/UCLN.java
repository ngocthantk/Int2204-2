package baitap;


public class UCLN {
    private int a,b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public static void main(String[] args)
	{
		UCLN so = new UCLN();
		so.setA(-15);
		so.setB(5);
                int u=so.UCLN(so.getA(), so.getB());
                System.out.println(u);

	}
        
        public int UCLN(int a, int b)
        {
            a=Math.abs(a);
            b=Math.abs(b);
            while(a!=b)
            {
                if(a<b)
                {
                    b=b-a;
                }
                else
                {
                    a=a-b;
                }
            }
            return a;
        }
}

