/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucln;

/**
 *
 * @author Dat Anh
 */
import java.util.Scanner;
public class UCLN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        uclnclass number1 = new uclnclass();
        number1.setNum();
        System.out.println(number1.findUlcn());
        
    }
    
}
