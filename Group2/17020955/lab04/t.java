package javaapplication1;


public class t {
public static int GTNN(int a[])
	{
		int k = a.length;
		if(k == 0)
			{return 0;}
		else{
		int min = a[0];
		for (int i = 0; i < a.length; i++)
		{
			if (min >= a[i])
			{
				min = a[i];
			}
		}
		
		return min;
		}}
    
}
