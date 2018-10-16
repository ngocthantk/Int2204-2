/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dat Anh
 */
import java.util.Scanner;
public class FibonaciMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Fibonaci number = new Fibonaci();
        number.setN(n);
        System.out.println(number.serch());
    }
    
}
