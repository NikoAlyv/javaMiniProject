/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniproject11;


/**
 *
 * @author Nihat
 */

public class MiniProject11 {
  public static boolean SadeEded(int num){
      for(int i=2;i<num;i++){
          if(num%i==0){
              // doru olduqda sade eded deyil
              return false;
          }
          //dogru olduqda sade ededir
      }return true;
  }
    public static void main(String[] args) {
      /*
        Sadə ədəd - 1-ə və özünə bölünən ədəd sadə ədəddir 
        */
      for(int i=0;i<1000;i++){
          if(SadeEded(i))
        System.out.println("1-1000 rasindaki sade eded:"+i);
      }
    }
}
