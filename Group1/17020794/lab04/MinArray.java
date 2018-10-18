/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minarray;

public class MinArray {


  public static int Min(int a[]){
      int x=1000;
      for(int i=0; i<5; i++){
          if(a[i]<x){
              x=a[i];
          }
      }
      return x;
  }  
}
