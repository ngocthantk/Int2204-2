/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainucln;
import java.util.Scanner;
/**
 *
 * @author Hieu M Nguyen
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
		Scanner sc = new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		sc.close();
		this.setA(number1);
		this.setB(number2);
	}
	public int findUCLN()
	{
		int min = Math.min(this.getA(), this.getB());
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
