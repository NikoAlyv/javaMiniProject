/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniproject10;

import java.util.Scanner;

/**
 *
 * @author Nihat
 */
public class MiniProject10 {

    public static void main(String[] args) {
      /*
        Faiz proqrami
        */
        Scanner scan =new Scanner(System.in);
      
        System.out.println("************************************************************");
        System.out.println("Bankimiza xos geldiniz.Ilde %6 faizden baslayan gelir...");
        System.out.println("************************************************************");
        // mebleg
        System.out.print("Artirmaq istediyiniz mebleg:");
        int mainmoney = scan.nextInt();
        // il
        System.out.print("Nece illik:");
        int year = scan.nextInt();
        
        double toplampul = mainmoney;
        double faiz = 0.06;
        
        for(int i=1;i<=year;i++){
            toplampul = (toplampul*faiz)+toplampul;
            System.out.println(i+".ildeki balans:"+(int)toplampul);
        }
        
    }
}
