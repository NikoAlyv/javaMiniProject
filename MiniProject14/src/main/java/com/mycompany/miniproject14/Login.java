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
public class Login {
    
    public boolean Login(Hesab hesab){
        Scanner scan = new Scanner(System.in);
        
        String istifadeci_adi;
        String parol;
        
        System.out.print("Adnizi daxil edin:");
        istifadeci_adi = scan.nextLine();
        System.out.print("Parolunuzu daxil edin:");
        parol = scan.nextLine();
        
        if(hesab.getIstifadeci_adi().equals(istifadeci_adi )&& hesab.getParol().equals(parol)){
           return true;
        }
        else{
            return false;
        }
        
    }
    
    
}
