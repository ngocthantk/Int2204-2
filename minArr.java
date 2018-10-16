package task4;

public class minArr {
//đưa vào một mảng và một số tìm giá trị nhỏ nhất
	static public int find(int[] s,int m)
	{
		int min=1000;
		for(int i =0;i<m;i++)
		{
			if(min>s[i])
			{
				min=s[i];
			}
		}
		
		return min;
	}

}
