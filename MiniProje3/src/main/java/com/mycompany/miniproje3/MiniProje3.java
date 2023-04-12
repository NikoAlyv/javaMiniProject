/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniproje3;

import java.util.Scanner;

/**
 *
 * @author Nihat
 */
public class MiniProje3 {

    public static void main(String[] args) {
        /*
       4 əməliyyat icra edən bir kalkulyatur
           1.toplama
            2.cixma
             3.vurma
              4.bolme
        */
        Scanner scan = new Scanner(System.in);
        
  System.out.println("*********************************");
        String islemler ="1.Toplama\n"
                     +"2.Cixma\n"
                     +"3.Vurma\n"
                     +"4.Bolme\n";
        System.out.println(islemler);
  System.out.println("*********************************");
        System.out.print("Bir islem secin:");
  int islem = scan.nextInt();
        System.out.print("Birinci eded: ");
        int a = scan.nextInt();
        System.out.print("Ikinci eded: ");
        int b = scan.nextInt();
        switch (islem) {
            case 1:
                System.out.println("Toplama:"+(a+b));                 
                break;
            case 2:
                System.out.println("Cixma:"+(a-b));
                break;
            case 3:
                System.out.println("Vurma:"+a*b);
                break;
            case 4:
                System.out.println("Bolme:"+((double)a/b));
                break;
            default:
                System.out.println("Bele bir islem yoxdur");;
        }
        
  
    }
}
