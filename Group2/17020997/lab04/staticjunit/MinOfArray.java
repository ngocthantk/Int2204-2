/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticjunit;

/**
 *
 * @author MyPC
 */
public class MinOfArray {
    static public int gtnn(int a[], int n){
        int min = a[0];
        for(int i=0; i<n; i++)
            if(min > a[i])min = a[i];
        return min;
    }
}
