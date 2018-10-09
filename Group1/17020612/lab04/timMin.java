/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author Admin
 */
public class timMin {
    static int find(int a[])
    {
        int min=a[0];
        for (int i = 0; i < a.length; i++) {
            min=Math.min(a[i],min);
        }
        return min;
    }
}
