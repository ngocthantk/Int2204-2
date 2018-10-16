/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

/**
 *
 * @author CCNE
 */
public class MIN {
    public static int min(int a[], int n) {
        int min = a[0];
        for(int i=0; i<n ;i++) {
            if(a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}
