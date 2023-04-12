/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniproject14;

import java.util.Scanner;

/**
 *
 * @author Nihat
 */
public class Terminal {
    public void calis(Hesab hesab){
 
        Login login = new Login();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bankamiza xos geldiniz....");
        System.out.println("********************************");
        
          System.out.println("Kullanici girisi");
        System.out.println("*******************************");
        
        int giris_haqqi = 3;
        
        while(true){
            if(login.Login(hesab)){
                System.out.println("Giris basarili...");
                break;
            }
            else{
                System.out.println("Giris basarisiz...");
                giris_haqqi--;
                
            }
            if(giris_haqqi==0){
                System.out.println("Giris haqqiniz bitti...");
                return;
            }
        }
    }
    
}
