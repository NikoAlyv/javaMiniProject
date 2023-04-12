/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniproject14;

/**
 *
 * @author Nihat
 */
public class Hesab {
    
    private String istifadeci_adi;
    private String parol;
    private double balans;

    
    
    
    //constructor
    public Hesab(String istifadeci_adi,String parol,double balans){
        
       this.istifadeci_adi = istifadeci_adi;
       this.parol =parol;
       this.balans = balans;
        
    }
    //metodlar
    public void balansartirma(int miqdar){

          balans += miqdar;
        System.out.println("Yeni balans:"+balans);
        
    }
    public void pulcekme(int miqdar){
        balans-=miqdar;
        if(balans-miqdar<0){
            System.out.println("Kifayet qeder balansiniz yoxdur....");
        }
        else{
            System.out.println("Yeni balans:"+balans);
        }
    }
    
    
    /**
     * @return the Istifadeci_adi
     */
    public String getIstifadeci_adi() {
        return istifadeci_adi;
    }

    /**
     * @param Istifadeci_adi the Istifadeci_adi to set
     */
    public void setIstifadeci_adi(String Istifadeci_adi) {
        this.istifadeci_adi = Istifadeci_adi;
    }

    /**
     * @return the parol
     */
    public String getParol() {
        return parol;
    }

    /**
     * @param parol the parol to set
     */
    public void setParol(String parol) {
        this.parol = parol;
    }

    /**
     * @return the balans
     */
    public double getBalans() {
        return balans;
    }

    /**
     * @param balans the balans to set
     */
    public void setBalans(double balans) {
        this.balans = balans;
    }
    
    
    
}
