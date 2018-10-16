package lab03_Cau2;

public class Cau2 {
	public static void main(String[] args)
	{
		PS PhanSo1=new PS(-3,5);
		PS PhanSo2=new PS(3,-5);
		Cau2 Check=new Cau2();
		Check.InPhanSo(PhanSo1.Cong(PhanSo2));
		Check.InPhanSo(PhanSo1.Tru(PhanSo2));
		Check.InPhanSo(PhanSo1.Nhan(PhanSo2));
		Check.InPhanSo(PhanSo1.Chia(PhanSo2));
		if(PhanSo1.equals(PhanSo2))
		{
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
	}
	public void InPhanSo(PS a)
	{
		if(a.getT()==0)
			System.out.println("0");
		else
			if(a.getT()==a.getM())
				System.out.println("1");
			else
		System.out.println(a.getT()+"/"+a.getM());
	}
}