
public class BMI {
	public static String BMI1(double can,double cao){
		double bmi=can/(cao*cao);
		if(bmi<18.5)
			return "thieu can";
		else if(bmi<23)
			return "binh thuong";
		else if(bmi<=25)
			return "thua can";
		else 
			return "beo phi";
	}
}
