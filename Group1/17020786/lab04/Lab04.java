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
public class Lab04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = findLager(1,2);
        System.out.println(i);
    }
    public static int findLager(int a,int b){
        if(a>b) return a;
        else return b;
    }
    public static int findMin(int[] a,int n){
        int min = a[0];
        for(int i=1;i<n;i++){
            if(min > a[i]) min = a[i];
        }
        return min;
    }
    
}
