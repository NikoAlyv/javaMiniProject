/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniproject9;

import java.util.Scanner;

/**
 *
 * @author Nihat
 */
public class MiniProject9 {

    public static void main(String[] args) {
      /*
        istifadeci girisi proqrami
        */
        Scanner scan = new Scanner(System.in);
        
      
        System.out.println("********************************************");
        System.out.println("Istifadeci girisinize xos geldiniz.....");
         System.out.println("********************************************");
         
         //istifadeci adi
        String username = "Nihad Aliyev";
         //parol
        String password = "12345";
         int giris=3;
         
       while(true){ 
         System.out.print("Istifadeci adinizi daxil edin:");
         String ad = scan.nextLine();
         System.out.print("Peolunuzu daxil edin:");
         String parol = scan.nextLine();
         
         if(username.equals(ad) && password.equals(parol)){
             System.out.println("Xos geldiniz "+ad);
             break;
         }
         else if(username.equals(ad) && !password.equals(parol)){
             System.out.println("Parolunuz dogru deyil....");
             giris--;
             System.out.println("Giris sayi:"+giris);
         }
           else if(!username.equals(ad) && password.equals(parol)){
             System.out.println("Istifadeci adiniz dogru deyil....");
             giris--;
             System.out.println("Giris sayi:"+giris);
         }
           else{
             System.out.println("Istifadeci adiniz ve Parolunuz dogru deyil....");
             giris--;
             System.out.println("Giris sayi:"+giris);
         }
         if(giris==0){
             System.out.println("Giris haqqiniz sonlandi.Tekrar sinayin...");
             break;
         }
         
       }         
                 
         
         
    }
}
