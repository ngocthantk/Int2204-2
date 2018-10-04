package test;


public class BMI {
	private double Weight;
	private double Height;
	
	public double getWeight() {
		return Weight;
	}
	public void setWeight(double weight) {
		Weight = weight;
	}
	public double getHeight() {
		return Height;
	}
	public void setHeight(double height) {
		Height = height;
	}

	

	
	public static String outPut(double Weight, double Height)
	{
		double bmi;
		bmi=Weight/(Height*Height);
		
		if(bmi<18.5)
		{
			return "Thieu Can";
		}
		else if(bmi>=18.5&&bmi<23)
		{
			return "Binh thuong";
		}
		else if(bmi>=23&&bmi<=24.99)
		{
			return "Thua can";
		}
		else if(bmi>=25)
		{
			return  "Beo phi";
		}
		
		return "Khong hop le";
		
	}
	

}

