/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniproject14;

import java.util.Scanner;

/**
 *
 * @author Nihat
 */
public class MiniProject14 {

    public static void main(String[] args) {
        //Object Oriented (Obyekt yonumlu) Terminal proqrammi
        
        //Login classi istifadeci girisini idare edecek
        
        //Hesap classi hesablamalari icra edecek
        
        //ATM classi ise atm -ni ise salicaq
        Terminal terminal = new Terminal();
        Hesab hesab = new Hesab("Nihad Aliyev","23456",998);
        
        terminal.calis(hesab);
        System.out.println("Proqramdan cixilir.....");
        
        System.out.println("****************************************");
        String emeller = "1.Balansiniza baxin\n"
                        +"2.Hesabartirma\n"
                        +"3.Pul cekme\n"
                        +"'q' ile proqrami sonlandirmaq";
         System.out.println(emeller);
         System.out.println("****************************************");
         while(true){
             System.out.print("Emelleri daxil edin:");
             Scanner scan = new Scanner(System.in);
             String emel = scan.nextLine();
             if(emel.equals("q")){
                 break;
                 
             }
             else if(emel.equals("1")){
                 System.out.println("Balansiniz:"+hesab.getBalans());
             }
             else if(emel.equals("2")){
                 System.out.print("Artirmaq istediyiniz mebleg:");
                 int miqdar = scan.nextInt();
                 scan.nextLine();
               hesab.balansartirma(miqdar);
               
             }
             else if(emel.equals("3")){
                 System.out.print("Cekmek istediyiniz mebleg:");
                  
                 int mebleg =scan.nextInt();
                 scan.nextLine();
                 hesab.pulcekme(mebleg);
             }
             else{
                 System.out.println("Uygunsuz emel......");
             }
         }
    }
}
