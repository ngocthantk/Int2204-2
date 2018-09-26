package baitap;

public class PhanSo {
    private int t,m;
	

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}
        
        public PhanSo rutGon(PhanSo x)
        {
            UCLN u= new UCLN();
            int h=u.UCLN(x.t,x.m);
            x.t=x.t/h;
            x.m=x.m/h;
            
            return x;
        }
	
	public PhanSo cong(PhanSo k)
	{
		PhanSo x= new PhanSo();
		if(this.m==k.m) {
			x.t=this.t+k.t;
			x.m=this.m;
                }
        else
        {
            x.t=this.t*k.m+this.m*k.t;
            x.m=this.m*k.m;
        }
            PhanSo p =new PhanSo();
            p.rutGon(x);
            
         return x;
	}
	
	public PhanSo tru(PhanSo k)
	{
		PhanSo x= new PhanSo();
		if(this.m==k.m) {
			x.t=this.t-k.t;
			x.m=this.m;
                }
        else
                {
                    x.t=this.t*k.m-this.m*k.t;
                    x.m=this.m*k.m;
                }
                PhanSo p =new PhanSo();
                p.rutGon(x);
                
                return x;
	}
	
	public PhanSo nhan(PhanSo k)
	{
		PhanSo x=new PhanSo();
		x.t=this.t*k.t;
		x.m=this.m*k.m;
                PhanSo p =new PhanSo();
                p.rutGon(x);
                return x;
                
	}
        
        public PhanSo chia(PhanSo k)
	{
		PhanSo x=new PhanSo();
		x.t=this.t*k.m;
		x.m=this.m*k.t;
                PhanSo p =new PhanSo();
                p.rutGon(x);
                return x;
                
	}
	
        public boolean equals(Object object)
        {
            int a=0;
            if(object instanceof PhanSo)
            {
                PhanSo p =(PhanSo)object;
                double x=this.t/this.m;
                double y=((PhanSo) object).t/((PhanSo) object).m;
                return(Math.abs(y)==Math.abs(x));
            }
            else
                return false;
                
        }
	
	
	
	
	public static void main(String[] args)
	{
		PhanSo a = new PhanSo();
		a.setT(-6);
		a.setM(5);
		PhanSo b =new PhanSo();
		b.setT(6);
		b.setM(-5);
		
        System.out.println(a.t+"/"+a.m+" + "+b.t+"/"+b.m+" = "+a.cong(b).t+"/"+a.cong(b).m);
        
		System.out.print(a.getT()+"/"+a.getM()+" = "+b.getT()+"/"+b.getM()+"?");
		System.out.println(" "+a.equals(b));
	}
	
}
