/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nevsehir.merhabajavaproject;

import java.util.Scanner;

/**
 *
 * @author KadoreK
 */
public class Hafta6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
            ÖDEV
            1-Klavyeden girilen sayıdan küçük en büyük tek doğal sayıyı bulan programı yazınız.
            2-Klavyeden girilen bir sayınını asal olup olmadığını bulan programı yazınız.
            3-
                x>0,y<0 ise f(x,y)=4x+2y+4
                x>0,y=0 ise f(x,y)=2x-y+3
                x<0,y>0 ise f(x,y)=3x+4y+3
        
                olacak şekilde klavyeden girilen x ve y değerlerine bağlı fonksiyon sonucunu bulan programı yazınız.
        
         */
        // <editor-fold defaultstate="collapsed" desc="Soru 1">
//        Scanner okuyucu= new Scanner(System.in);
//        int girilenSayi;
//        int sayac;
//        System.out.println("Lütfen bir sayı giriniz :");
//        girilenSayi=okuyucu.nextInt();
//        sayac=girilenSayi-1;
//        while(sayac%2==0){
//            sayac--;
//        }
//        System.out.println("Girlen sayıdan küçük en büyük tek sayı : "+sayac);
        
        
        
        // </editor-fold>
        // <editor-fold defaultstate="collapsed" desc="Soru 2">
        /*Scanner okuyucu = new Scanner(System.in);
        int girilenSayi;
        boolean asalMi = true;
        do {
            System.out.println("Lütfen 2 den büyük bir sayı griniz:");
            girilenSayi = okuyucu.nextInt();
        } while (girilenSayi < 2);
        
        for (int i = 2; i < girilenSayi; i++) {            
            if (girilenSayi%i==0) {
                asalMi=false;
                break;
            }
        }        
        if (asalMi) {
            System.out.println("Girilen sayı asaldır.");
        }else {
            System.out.println("Girilen sayı asal değildir.");
        }*/

        // </editor-fold>
        // <editor-fold defaultstate="collapsed" desc="Soru 3">
        
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Dersin 2.Bölümü">
        
        /*
            Math sınıfı.
            İki sabit : Math.PI , Math.E
            Sıklıkla kullanılan fonksiyonlar : 
                Ceil(x) : Verilen ondalıklı sayıyı yukarı yuvarlar. Örnk : 2.1 -> 3
                Floor(x): Verilen ondalıklı sayıyı aşağı yuvarlar. Örnk : 2.5 -> 2
                Pow(x,y): x sayısının y ninci kuvvetini alır . Örnek : Math.Pow(2,3)=8
                sqrt(x) : Verilen sayının karekökünü alır. Örnk: Math.sqrt(4)=2
                Min(x,y): Verilen sayılar arasından küçük olanı verir. Örn: Math.Min(5,3)=3
                Max(x,y): Verilen sayılar arasından büyük olanı verir. Örn: Math.Max(5,3)=5
                Random(): 0-1 arasında rastgele sayı üretir. Not 1 olamaz.
        
        */
        
        Scanner okuyucu= new Scanner(System.in);
        System.out.println("Lütfen alt sınırı giriniz : ");
        int s1=okuyucu.nextInt();
        System.out.println("Lütfen üst sınırı giriniz : ");
        int s2=okuyucu.nextInt();
        
        int min=Math.min(s1, s2);
        int max=Math.max(s1, s2);
        
        for (int i = 0; i < 10; i++) {
            
            int sayi=min+(int)(Math.random()*(max-min));   //0.1245485,0.0000555505547            
            System.out.printf("Üretilen %d. sayı : %d \n",i+1,sayi);
        }
        
        
        
        // </editor-fold>
        
        
        
        
        
    }

}
