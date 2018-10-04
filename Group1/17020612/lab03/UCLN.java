/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UCLN;

import java.util.Scanner;
/**
 *
 * @author CCNE
 */
public class UCLN {
    private int a;
    private int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void setNumber()
	{
		Scanner dt = new Scanner(System.in);
		int x=dt.nextInt();
		int y=dt.nextInt();
		dt.close();
		this.setA(x);
		this.setB(y);
	}
	public int findUCLN()
	{
		int min = Math.min(Math.abs(this.getA()),Math.abs(this.getB()));
		int Ucln=1;
		for(int i = min;i>=1;i--)
		{
			if(this.getA()%i==0&&this.getB()%i==0)
			{
				Ucln=i;
				break;
			}
		}
		return Ucln;
	}
}
