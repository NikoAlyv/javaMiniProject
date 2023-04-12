/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniproject13;

import java.util.Scanner;

/**
 *
 * @author Nihat
 */
public class MiniProject13 {
    // toplama
    public static int toplama(int a,int b){
        return a+b;
    }
    //cixma
    public static int cixma(int a,int b){
        return a-b;
    }
    // method overloading
    public static int cixma(int a,int b,int c){
        return (a-b-c);
    } 
    //vurma
    public static  int vurma(int a,int b){
        return a*b;
    }
    //bolme
    public static double bolme(int a,int b){
        return (double)a/b;
    }
    //method overloading 
    public static double bolme(int a,int b,int c){
        return (double)a/b/c;
    }
    

    public static void main(String[] args) {
       /*
        Inkisaf etmis kalkulator
        */
        Scanner scan =new Scanner(System.in);
       String islemler = "1.islem:toplama\n"
               + "2.islem:cixma\n"
               + "3.islem:vurma\n"
               + "4.islem:bolme\n"
               + "Proqramdan cixma ucun 'q' basin.";
       
        System.out.println("**************************************");
        System.out.println(islemler);
        System.out.println("**************************************");
        
        while(true){
            System.out.print("Islemi girin:");
            String islem = scan.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Proqram sonlandi...");   
                break;
            }
            else if(islem.equals("1")){
                System.out.print("a:");
                int a =scan.nextInt();
                System.out.print("b:");
                int b = scan.nextInt();
                scan.nextLine();
                System.out.println("a ve b ededinin toplami:"+toplama(a, b));
            }
            else if(islem.equals("2")){
               
                System.out.print("Eded sayisi nece olacaq ?(2 ve 3):");
                int sayi = scan.nextInt();
               if(sayi==2){
                System.out.print("a:");
                int a =scan.nextInt();
                System.out.print("b:");
                int b = scan.nextInt();
                scan.nextLine();
                System.out.println("a ve b ededinin ciximi:"+cixma(a,b));
               }
               else if(sayi==3){
                    System.out.print("a:");
                int a =scan.nextInt();
                System.out.print("b:");
                int b = scan.nextInt();
                System.out.print("c:");
                int c = scan.nextInt();
                scan.nextLine();
                System.out.println("a,b ve c ededinin ciximi:"+cixma(a,b,c));
               }
               else{
                   System.out.println("Bele bir metho movcud deyil...");
               }
            }
            else if(islem.equals("3")){
                 System.out.print("a:");
                int a =scan.nextInt();
                System.out.print("b:");
                int b = scan.nextInt();
                scan.nextLine();
                System.out.println("a ve b ededinin vurumu:"+vurma(a, b));
            }
            else if(islem.equals("4")){
                System.out.print("Eded sayisi nece olacaq ?(2 ve 3):");
                int sayi = scan.nextInt();
               if(sayi==2){
                System.out.print("a:");
                int a =scan.nextInt();
                System.out.print("b:");
                int b = scan.nextInt();
                scan.nextLine();
                System.out.println("a ve b ededinin bolumu:"+bolme(a,b));
               }
               else if(sayi==3){
                    System.out.print("a:");
                int a =scan.nextInt();
                System.out.print("b:");
                int b = scan.nextInt();
                System.out.print("c:");
                int c = scan.nextInt();
                scan.nextLine();
                System.out.println("a,b ve c ededinin bolumu:"+bolme(a,b,c));
               }
               else{
                   System.out.println("Bele bir metho movcud deyil...");
               }
            }
            else{
                System.out.println("Bele bir islem yoxdur....");
            }
        }
        
    }
}
