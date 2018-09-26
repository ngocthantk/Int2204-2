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
public class mainFibonaxi {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
		int n = input.nextInt();
		Fibonaxi number =new Fibonaxi();
		number.setN(n);
		System.out.println(number.find());
    }
}
