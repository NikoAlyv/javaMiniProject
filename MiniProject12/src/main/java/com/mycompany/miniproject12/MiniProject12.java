/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniproject12;

import java.util.Scanner;

/**
 *
 * @author Nihat
 */
public class MiniProject12 {
       public static int Ebob(int num1,int num2){
           int Ebob=1;
           for(int i=2;i<num1 && i<num2;i++){
               if((num1%i==0) && (num2%i==0)){
                   Ebob=i;
               }
           }
           return Ebob;
       }
    
    public static void main(String[] args) {
    /*
        Istifadəçidən alınan iki ədədin əbobunu tapmaq
        
        */Scanner scan =new Scanner(System.in);
        
        System.out.print("BIrinci ededi daxil edin:");
        int Birinci_eded = scan.nextInt();
        
        System.out.print("Ikinci ededi daxil edin:");
        int Ikinci_eded =scan.nextInt();
        
        System.out.println(Birinci_eded+" ve "+Ikinci_eded+" ebobu:"+Ebob(Birinci_eded, Ikinci_eded));
       
        
    }
}
