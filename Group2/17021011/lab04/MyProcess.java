package lab04;

public class MyProcess {
	public static int getMaxTwoNumber(int a, int b) {
		return (a>b ? a:b);
	}
	
	public static int getMinOfArray(int[] arr) {
		int res = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < res) res=arr[i];
		}
		return res;
	}
	
	public static void calculateBMI(double weight, double height) {
		double BMI = weight/(height*height);
		if(BMI < 18.5) {
			System.out.print("Underweight");
		}
		else if(BMI >= 18.5 && BMI < 25) {
			System.out.print("Normal");
		}
		else if(BMI >= 25 && BMI < 30) {
			System.out.print("Overweight");
		}
		else {
			System.out.print("Obese");
		}
	}
}
