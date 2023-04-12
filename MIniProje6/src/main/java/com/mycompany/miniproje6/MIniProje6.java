/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniproje6;

import java.util.Scanner;

/**
 *
 * @author Nihat
 */
public class MIniProje6 {

    public static void main(String[] args) {
        /*
        Armstrong ededinin tapilmasi zamani ededin reqemlerini onun hedleri ile ustlu
        qiymet almalidirve ededin ozune beraber olmalidir
        1234 = 1^4+2^4+3^4+4^4;
        234 = 2^3+3^3+4^3;
        */
        Scanner scan =new Scanner(System.in);
        System.out.print("Ededi daxil edin:");
        int sayi = scan.nextInt();
        System.out.print("Heddi daxil edin:");
        int hed = scan.nextInt();
        
        int toplam=0;
        int num1=sayi;
        do{
            int num2 = num1%10;
            num1/=10;
            toplam+=Math.pow(num2, hed) ;
            
        }while(num1>0);
        if(toplam==sayi){
            System.out.println("Eded armstrong ededidir...");
        }else{
            System.out.println("Eded armstrong ededi edyil...");
        }
    }
    
}
