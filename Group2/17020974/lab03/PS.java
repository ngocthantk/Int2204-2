import java.util.Scanner;
public class PS{
	private int tu;
	private int mau;
	//ham so sanh
	public boolean equals(Object obj){
		/*s=toigian(s);
		PS gan=new PS();
		gan.tu=this.tu;
		gan.mau=this.mau;
		//if(((this.tu==s.tu)||(this.tu%s.tu==0))&&((this.mau==s.mau)||(this.mau%s.mau==0)))
			//return true;
		gan=toigian(gan);
		if((s.tu==gan.tu)&&(s.mau==gan.mau))return true;
		else return false;*/
		if(this==obj)
			return true;
		if(obj instanceof PS){
			PS gan=(PS) obj;
			return(this.tu*gan.mau==this.mau*gan.tu);
		}
		return false;
	}
	//khoi tao
	public PS(){}
	public PS(int tu,int mau){
		this.tu=tu;
		this.mau=mau;
	}
	public void setTu(int tu){this.tu=tu;}
	public void setMau(int mau){this.mau=mau;}
	public int getTu(){return tu;}
	public int getMau(){return mau;}
	//cong phan so
	public PS cong(PS s1){
		PS pstong=new PS();
		pstong.tu=s1.tu*this.mau+s1.mau*this.tu;
		pstong.mau=s1.mau*this.mau;
		return pstong;
	}
	//tru phan so
	public PS tru(PS s1){
		PS pstru=new PS();
		pstru.tu=s1.tu*this.mau-this.tu*s1.mau;
		pstru.mau=s1.mau*this.mau;
		return pstru;
	}
	//nhan phan so
	public PS nhan(PS s1){
		PS psnhan=new PS();
		psnhan.tu=s1.tu*this.tu;
		psnhan.mau=s1.mau*this.mau;
		return psnhan;
	}
	//chia phan so
	public PS chia(PS s1){
		PS pschia=new PS();
		pschia.tu=s1.tu*this.mau;
		pschia.mau=s1.mau*this.tu;
		return pschia;	
	}
	//tim ucln cua 2 so
	public int ucln(int x,int y){
		if(x==0)
			return y;
		else if(y==0)
			return x;
		else{
			if(x%y==0)
				return y;
			else return ucln(y,x%y);
		}
	}
	//toi gian phan so s
	public PS toigian(PS s){
		PS pstoigian=new PS();
		int i=ucln(s.tu,s.mau);
		pstoigian.tu=s.tu/i;
		pstoigian.mau=s.mau/i;
		if(pstoigian.mau<0){
			pstoigian.tu*=-1;
			pstoigian.mau*=-1;
		}
		return pstoigian;
	}
	//ham main
	public static void main(String[] args){
		PS s1=new PS();
		PS s2=new PS();
		Scanner nhap=new Scanner(System.in);
		//s1.tu=nhap.nextInt();
		//s1.mau=nhap.nextInt();
		//s2.tu=nhap.nextInt();
		//s2.mau=nhap.nextInt();
		s1.setTu(nhap.nextInt());
		s1.setMau(nhap.nextInt());
		s2.setTu(nhap.nextInt());
		s2.setMau(nhap.nextInt());
		if(s1.equals(s2)){
		System.out.println(s1.equals(s2));
		System.out.println(s2.toigian(s2.cong(s1)).tu+"/"+s2.toigian(s2.cong(s1)).mau);
		System.out.println("0");
		System.out.println(s2.toigian(s2.nhan(s1)).tu+"/"+s2.toigian(s2.nhan(s1)).mau);
		System.out.println("1");
		}
		else{
		System.out.println(s1.equals(s2));
		System.out.println(s2.toigian(s2.cong(s1)).tu+"/"+s2.toigian(s2.cong(s1)).mau);
		System.out.println(s2.toigian(s2.tru(s1)).tu+"/"+s2.toigian(s2.tru(s1)).mau);
		System.out.println(s2.toigian(s2.nhan(s1)).tu+"/"+s2.toigian(s2.nhan(s1)).mau);
		System.out.println(s2.toigian(s2.chia(s1)).tu+"/"+s2.toigian(s2.chia(s1)).mau);
		}
	}
}