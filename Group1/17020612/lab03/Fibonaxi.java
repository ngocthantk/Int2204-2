/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonaxi;

import java.util.Scanner;
/**
 *
 * @author CCNE
 */
public class Fibonaxi {
    private int n;
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	int [] s = new int[100];
	//phương thức tìm số fibonaxi
	public int find()
	{
		int a=0;
		s[0]=0;
		s[1]=1;
		for(int i=2;i<=this.getN();i++)
	    {
	       s[i]=s[i-1]+s[i-2];
	    }
		a=s[this.getN()];
		return a;
	}
}
