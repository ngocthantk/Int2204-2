package task4;
//bài toán cân nặng chiều cao
public class BMI {
//hàm tìm thể trạng đưa vaò cân nạng và chiều cao
	static public String find(float n, float m)
	{
		float i = n/(m*m);
		String a=null;
		if(i<18.5)
		{
			a= "Thieu can";
		}
		if(i>=18.5&&i<22.99)
		{
			a= "Binh thuong";		
		}
		if(i>=23&&i<24.99)
		{
			a= "Thua can";
		}
		if(i>=25)
		{
			a= "Beo phi";
		}
		return a;
		
		
	}


}
