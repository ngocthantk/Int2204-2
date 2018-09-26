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
public class MainUCLN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UCLN numberOne = new UCLN();
		numberOne.setNumber();
		//System.out.println(numberOne.getA() + "    " + numberOne.getB());
		System.out.println(numberOne.findUCLN());
		}
    }
