
public class BT {
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static int minArr(int[] arr)
	{
		int min = arr[0];
		for (int i=1; i < arr.length ; i++)
			if (arr[i] < min)
				min = arr[i];
		return min;
	}
	
	public static String BMI(double w, double h)
	{
		double bmi = w / (h * h);
		if (bmi >= 25)
			return "Beo phi";
		else
		if (bmi > 23)
			return "Thua can";
		else
		if (bmi > 18.5)
			return "Binh thuong";
		else
			return "Thieu can";
	}
}
