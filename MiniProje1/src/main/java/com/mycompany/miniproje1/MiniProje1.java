/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniproje1;

import java.util.Scanner;

/**
 *
 * @author Nihat
 */
public class MiniProje1 {

    public static void main(String[] args) {
        // Girilen 3 sayidan maksimumunu tapmaq
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Birinci qiymət:");
        int a = scan.nextInt();
        System.out.print("Ikinci qiymət:");
        int b = scan.nextInt();
        System.out.print("üçüncü qiymət:");
        int c = scan.nextInt();
        
        int max=-1;
        int min=-1;
        //  a üçün max ,c üçün min 
        if((a>=b && a>=c)&&(b>=c)){
            max = a;
            min = c;
            System.out.println("Max: "+max+" Min: "+min);
        }
        // a üçün max,b üçün min
        else if((a>=b && a>=c)&&(b<=c)){
            max = a;
            min = b;
            System.out.println("Max: "+max+" Min: "+min);
        } 
        else if((b>=a && b>=c)&&(a>=c)){
            max = b;
            min = c;
            System.out.println("Max: "+max+" Min: "+min);
        }else if((c>=a && c>=b)&&(a>=b)){
            max = c;
            min = b;
            System.out.println("Max: "+max+" Min: "+min);
        }else {
            System.out.println("Max: "+c+" Min: "+a);
        }
    }
}
