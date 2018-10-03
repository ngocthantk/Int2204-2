package maxnum;

public class Maxnum {
	public static int Findmax(int x, int y) {
                if(x >= y) return x;
		else return y;
	}
        public static int findmin(int[] a)  
        {
            int min = a[0];
            for(int i=0; i<a.length; i++)
            {
                if ( min > a[i]) 
                    min = a[i];
            }
            return min;
        }
        public static String findBMI(double height, double weight) {
		double BMI = weight/ (height* height);
		String s = "";
		if(BMI < 18.5)
                    {
			s = "Thieu can";
                    }
		if(BMI >= 18.5 || BMI <= 23) 
                    {
                    s = "Binh thuong";
                    }
		if(BMI >= 23 && BMI < 25) 
                    {
			s = "Thua can";
                    }
		if(BMI >= 25)
                    {
			s = "Beo phi";
                    }
		return s;
	}
}
