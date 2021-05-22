/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nevsehir.merhabajavaproject;

/**
 *
 * @author KadoreK
 */

import java.util.Scanner;
public class Hafta13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Soru 1: Kullanıcıdan 5 adet sayı alınacak ve bu sayılar dizide tutulacak. Ardından giriş sırasının tersine olacak şekilde yazdırılacak.
        */
        
        //Soru1(7);
        /*
        Soru 2: Elemanları belirli olan 20 elemanlı bir dizide girilen sayıdan küçük olan sayıların adedini bulan program
        */
        Soru2();
    }
    
    
    
    public static void Soru1(int sayiAdedi){
        Scanner okuyucu = new Scanner(System.in);
        int[] sayilar= new int[sayiAdedi];
        for (int i = 0; i < sayilar.length; i++) {
            System.out.printf(" %d. sayıyı giriniz :  \n",i+1);
            sayilar[i]=okuyucu.nextInt();
        }
        for (int i = sayilar.length-1; i >= 0; i--) {
            System.out.printf(" %d. sayıyı giriniz : %d \n",i+1,sayilar[i]);
        }    
    }
    
    public static void Soru2(){
        Scanner okuyucu= new Scanner(System.in);
        int[] sayilar={24,58,12,45,78,22,11,5,68,23,42,89};
        System.out.println("Lütfen kontrol sayısını giriniz:");
        int kontrolSayisi=okuyucu.nextInt();
        int uygunSayiAdedi=0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]<kontrolSayisi) {
                uygunSayiAdedi++;
            }
        }
        
        System.out.printf(" Mevcut dizide girilen %d kontrol sayısından küçük %d adet sayı mevcuttur \n",kontrolSayisi,uygunSayiAdedi);
        
    
    }
    
    
    
    
}
