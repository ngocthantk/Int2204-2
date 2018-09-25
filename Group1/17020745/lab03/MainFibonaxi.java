/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainfibonaxi;
import java.util.Scanner;
/**
 *
 * @author Hieu M Nguyen
 */
public class MainFibonaxi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n = input.nextInt();
		Fibonaxi number =new Fibonaxi();
		number.setN(n);
		System.out.println(number.find());
		
	}
    }
