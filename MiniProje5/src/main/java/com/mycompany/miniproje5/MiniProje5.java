/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniproje5;

import java.util.Scanner;

/**
 *
 * @author Nihat
 */
public class MiniProje5 {

    public static void main(String[] args) {
/*
        Atm proqramı yazmaq
                
        */
        int Hesab =1000;
        Scanner scan = new Scanner(System.in);
    System.out.println("*******************************");
        String islemler = "1.islem: Balansi oyrenme\n"
                         +"2.islem: Pul cixarmaq\n"
                         +"3.islem: Pul vurmaq\n"
                         +"Cixis ucun 'q'-a basin\n";
     System.out.print(islemler);
    System.out.println("*******************************");
    
    
    
    while(true){
        //islemleri burdan alalim
        System.out.print("Islemi girniz:");
        String islem = scan.nextLine();
        
        if(islem.equals("q")){    
        System.out.println("Proqramdan cixilir.....");
        break;
        }else if(islem.equals("1")){
            System.out.println("Balansiniz:"+Hesab);
            break;
        }
        else if(islem.equals("2")){
            // Cixaracagimiz pul
            System.out.print("Cixarmaq istediyiniz miqdari secin:");
            int miqdar = scan.nextInt();
            scan.nextLine();
            //Qalan pul
            int cixaris = Hesab - miqdar;
            if(cixaris<0){
                System.out.println("Hesabda hemin mebleg yoxdur...");    
            }
            else{
                System.out.println("Yeni balans:"+cixaris);
            }      
         }else if(islem.equals("3")){
             System.out.print("Artimaq istediyiniz miqdar:");
             int Azn = scan.nextInt();
             scan.nextLine();
             Hesab+=Azn;
             System.out.println("Yeni balans:"+Hesab);
         }else{
             System.out.println("Yanlis islem");
         }
         
            
       }
     }
  }
