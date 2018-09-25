import java.util.Scanner;
public class Bai1{
	//ham tim ucln
	public int ucln(int x,int y){
		if(x<0)x=-x;
		if(y<0)y=-y;
		if(x==0&&y==0)
			return -1;
		else if(x==0)
			return y;
		else if(y==0)
			return x;
		else{
			if(x%y==0)
				return y;
			else return ucln(y,x%y);
		}
	}
	//ham main
	public static void main(String[] args){
		Bai1 a=new Bai1();
		Scanner nhap=new Scanner(System.in);
		int x,y;
		x=nhap.nextInt();
		y=nhap.nextInt();
		System.out.print(a.ucln(x,y));
	}

}