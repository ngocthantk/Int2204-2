package pkTC;

import java.util.Arrays;

public class testcase {
	public static int solonhon (int a, int b)
	{
		int max = a;
		if(a<b) {
			max = b;
		}
		return max;
	}
	public int sonhonhat(int a[]) {
		Arrays.sort(a);
		return a[0];
		
	}
	
	public static String BMI(double CanNang, double ChieuCao)
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

