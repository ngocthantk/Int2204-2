package lab04;
public class Main {
	public static int findMax(int a, int b) {
		if(a >= b) return a;
		return b;
	}
	public static int findMin(int[] a) {
		int min = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i] < min)
				min = a[i];
		}
		return min;
	}
	public static String BMI(double weigth, double heigth) {
		double bmi = weigth/(heigth*heigth);
		String x ="";
		if(bmi < 18.5) x = "Thieu can";
		else if(bmi >= 18.5 && bmi < 23.00) x = "Binh thuong";
		else if(bmi >= 23 && bmi < 25) x = "Thua can";
		else if(bmi >= 25) x = "Beo phi";
		return x;
	}
}
