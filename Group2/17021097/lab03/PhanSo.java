package lab03.tu;


	public class PhanSo 
	{
		private int TuSo;
		private int MauSo;
		 public PhanSo(int TuSo, int MauSo)
		 {
		  this.TuSo=TuSo;
		  this.MauSo=MauSo;
		 }
	
		public void setTuSo(int TuSo)
		 {
			 this.TuSo = TuSo;
		 }
		 public void setMauSo(int MauSo)
		 {
			 this.MauSo = MauSo;
		 }
		 public int getTuSo()
		 {
			 return this.TuSo;
		 }
		 public int getMauSo()
		 {
			 return this.MauSo;
		 }
		
		 public int USCLN(int a, int b)
		 {
			 a = Math.abs(a);
			 b = Math.abs(b);
			 while(a!=b)
			 {
				 if(a>b) a=a-b;
				 else b=b-a;
			 }
			 return a;
		 }
		 public void rutGon()
		 {
		  int  k = USCLN(this.getTuSo(),this.getMauSo());
		  this.setTuSo(this.getTuSo()/k);
		  this.setMauSo(this.getMauSo()/k);
		 }
		 public void congPS(PhanSo l)
		 {
		  int a=(this.getTuSo() * l.getMauSo()) + (l.getTuSo() * this.getMauSo());
		  int b=l.getMauSo()* this.getMauSo();
		  if(a==0) {
			  System.out.println("0");
		  }else {
		  PhanSo m =new PhanSo(a,b);
		  m.rutGon();
		  System.out.println("Ket qua cong phan so : " + m.TuSo + "/" + m.MauSo );
		 }}
		 public void truPS(PhanSo l)
		 {
		  int a=(this.getTuSo()*l.getMauSo()) - (l.getTuSo()*this.getMauSo());
		  int b=l.getMauSo()*this.getMauSo();
		  if(a==0) {
			  System.out.println("0");
		  }else {
			  PhanSo m =new PhanSo(a,b);
		  
		m.rutGon();
		  System.out.println("Ket qua Tru: " + m.TuSo + "/" + m.MauSo);
		  
		 }}
		 public void nhanPS(PhanSo l)
		 {
		  int a=l.TuSo*this.TuSo;
		  int b=l.MauSo*this.MauSo;
		  PhanSo m=new PhanSo(a,b);
		  m.rutGon();
		  System.out.println("Ket qua Nhan: " + m.TuSo + "/" + m.MauSo);
		 }
		 public void chiaPS(PhanSo l)
		 {
		  int a=this.TuSo* l.MauSo;
		  int b=this.MauSo* l.TuSo;
		  PhanSo m =new PhanSo(a,b);
		  m.rutGon();
		  System.out.println("Ket qua Cong: " + m.TuSo + "/" + m.MauSo);
		 }
		public boolean equals(Object obj)
		{
			if(this == obj)return true;
			if(obj instanceof PhanSo) {
				PhanSo l =(PhanSo) obj;
				return (this.TuSo*l.MauSo == this.MauSo*l.TuSo);
			}else return false;
		}
		
		 public static void main(String[] args)
		 {
		  PhanSo l = new PhanSo(-1,5);
		  PhanSo p = new PhanSo(1,-5);
		  l.congPS(p);
		  l.truPS(p);
		  l.nhanPS(p);
		  l.chiaPS(p);
		  System.out.println(l.equals(p));
		 }

	}
