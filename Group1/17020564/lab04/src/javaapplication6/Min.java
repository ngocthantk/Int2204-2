/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

public class Min {//Bài tập tìm giá trị bé nhất trong 1 mảng

	static public int min(int[] s)
	{
		int min=s[0];
		for(int i =0;i<s.length;i++)
		{
			if(min>s[i])
			{
				min=s[i];
			}
		}
		
		return min;
	}

}
