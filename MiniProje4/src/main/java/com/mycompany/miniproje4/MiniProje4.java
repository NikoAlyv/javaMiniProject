/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniproje4;

import java.util.Scanner;

/**
 *
 * @author Nihat
 */
public class MiniProje4 {

    public static void main(String[] args) {
        /*
        Sdf1,sdf2,final imtahanlarının nəticələri ilə semestr sonu ortalamanın 
        hesablanması
        
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Sdf1 imtahanin neticesi:");
       double sdf1 = scan.nextDouble();
        System.out.print("Sdf2 imtahanin neticesi");
       double sdf2 = scan.nextDouble();
        System.out.print("Final imtahanin neticesi");
       double Final = scan.nextDouble();
       
        System.out.print("Orta mekteb ortalamsi:");
        double ortalama = scan.nextDouble();
        
        double IGB = (sdf1*3/10.0)+(sdf2*3/10.0)+(Final*4/10.0);
        if(IGB>=90){
            System.out.println("AA aldiniz...");
        }
        else if(IGB>=85){
            System.out.println("BA aldiniz..");
        }
        else if(IGB>=80){
            System.out.println("BB aldiniz..");
        }
        else if(IGB>=75){
            System.out.println("CB aldiniz..");
        }
        else if(IGB>=70){
            System.out.println("CC aldiniz..");
        }
        else if(IGB>=65){
            System.out.println("DC aldiniz..");
        }
        else if(IGB>=60){
            System.out.println("DD aldiniz..");
            if(ortalama<=3){
                System.out.println("Bu fenden ortalamaniz ve semestr baliniz cox asagidir bu dersi yeniden almaniz tovsiye olunur ");
            }
        }
        else if(IGB>=55){
            System.out.println("FD aldiniz ve kesildiniz..");
        }
        else if(IGB>=50){
            System.out.println("FF aldiniz..");
        }
    }
}
