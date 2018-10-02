/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PS;

import java.util.Scanner;

/**
 *
 * @author CCNE
 */
public class mainPS {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
		int ts1 = input.nextInt();
		int ms1 = input.nextInt();
		input.nextLine();
		String operator = input.nextLine();
		int ts2 = input.nextInt();
		int ms2 = input.nextInt();
		input.close();
		PS numberOne = new PS(ts1,ms1);
		PS numberTwo = new PS(ts2,ms2);
		PS numberThree = new PS(numberOne,numberTwo,operator);
                System.out.println(numberOne.equals(numberTwo));
    }
}
