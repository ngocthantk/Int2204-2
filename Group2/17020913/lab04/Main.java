package JUnit;

public class Main {
	
	public static int Solon(int a, int b)
	{
		
		return Math.max(a, b);
	}
	
	
	public static int SlMang(int arr[], int n )
	{
		int min=arr[0];
		for(int i=0; i<n;i++)
		if(arr[i]<min) min= arr[i];	
			return min;
	}
	
	public static String BMI(double cn, double cc) {
        double bmi = cn / (cc * cc);
        String s = "";
        if (bmi < 18.5) {
            s = "Thiếu cân";
        }
        else if (bmi < 23) {
            s = "Bình thường";
        }
        else if (bmi < 25) {
            s = "Thừa cân";
        }
        else if (bmi > 25) {
            s = "Béo phì";
        }
        return s;
    }
}
