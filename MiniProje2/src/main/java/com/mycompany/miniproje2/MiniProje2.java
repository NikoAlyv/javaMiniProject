/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniproje2;

import java.util.Scanner;

/**
 *
 * @author Nihat
 */
public class MiniProje2 {

    public static void main(String[] args) {
       /*
        Bədən kütle indeksini tapmaq üçün proqram
        
              bki = kütlə/boy*boy
        
        */
       
       Scanner scan = new Scanner(System.in);
       // Kültə daxil edilir
        System.out.print("Kutle:");
        int kutle = scan.nextInt();
       // Boy daxil edilir
        System.out.print("Boy ( Numune:1,78 ):");
        Double boy = scan.nextDouble();
       // Hesablama yerinə yetirilir
       Double bki = kutle/(boy*boy);
       
       if(bki<18.5){
           System.out.println("Zayif");
       }
       else if(bki>=18.5 && bki<25){
           System.out.println("Normal");
        
    }
       else if(bki>=25 && bki<30){
           System.out.println("Kilolu");
        
    }
       else{
           System.out.println("Obez");
       }
}
}