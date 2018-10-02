package lab04;

public class A {
	public static  int Max(int x,int y)
	{
		return Math.max(x, y);
	}
	public static int arr(int arr[])
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i]) {min=arr[i];}
		}
		return min;
	}
	public static String BMI(double hight,double weight)
	{
		double bmi=weight/(hight*hight);
		if(bmi<18.5) {return "thieu can";}
		if(bmi>=18.5 && bmi<22.99) {return "binh thuong";}
		if(bmi>=22.99&&bmi<=24.99) {return "thua can";}
		return"beo phi";
		
	}

}
