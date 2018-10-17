package lab04;

import java.util.Arrays; 

public class lab04 {
	//Cau a;
	public static int Max(int a, int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	//Cau b;
	public static int MinArr(int arr[])
	{
		Arrays.sort(arr);
		return arr[0];
	}
	//Cau d;
	public static String Print(double CanNang, double ChieuCao)
	{
		double i=CanNang/(ChieuCao*ChieuCao);
		if(i<18.5)
		{
			return "Thieu Can";
		}else
		{
			if(i<22.99)
			{
				return "Binh Thuong";
			}else
			{
				if(i<24.99)
				{
					return "Thua Can";
				}else
				{
					return "Beo Phi";
				}
			}
		}
	}
}
