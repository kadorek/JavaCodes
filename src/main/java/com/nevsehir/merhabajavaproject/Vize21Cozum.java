/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nevsehir.merhabajavaproject;

import java.util.Scanner;

public class Vize21Cozum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // <editor-fold defaultstate="collapsed" desc="Vize 2021 Soru 1">
        /*
        Klavyede girilen bir metni yine klavyeden girilen 10 'dan  küçük sayı kadar alt alta yazdıran programı Java programlama dilinde kodlayınız.
Not : Sayının 10 dan büyük olması ve 1 den küçük olması durumunda kullanıcıdan tekrar tekrar sayı girmesi istenmelidir.
        
         */
        /*Scanner okuyucu = new Scanner(System.in);
        System.out.println("Lütfen yazılacak metni giriniz :");
        String metin = okuyucu.nextLine();
        int adet = 0;
        do {
            System.out.println("Lütfen metnin yazım adedini giriniz");
            adet = okuyucu.nextInt();
        } while (adet < 1 || adet > 10);
        for (int i = 0; i < adet; i++) {
            System.out.println(metin);
        }*/
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Vize 2021 Soru 2">
        /*
            Java programlama dilinde programa 10-20 ( iki üç da dahil ) sayıları arasında bir adet tam sayı ürettiriniz. Ardından kullanıcının girdiği sayı ile rastgele üretilen sayıyı karşılaştırarak sonucu ekrana yazdırınız.
         */
        Scanner okuyucu2 = new Scanner(System.in);
        int rasgeleSayi = 10 + (int) (Math.random() * (21 - 10));//Math.random() --> [0,1)
        System.out.println("Lütfen bir sayı giriniz :");
        int girilenSayi = okuyucu2.nextInt();

        if (girilenSayi > rasgeleSayi) {
            System.out.printf("Girilen %d sayısı ,üretilen %d sayısından büyüktür.", girilenSayi, rasgeleSayi);
        } else if (girilenSayi < rasgeleSayi) {
            System.out.printf("Girilen %d sayısı ,üretilen %d sayısından küçüktür.", girilenSayi, rasgeleSayi);
        } else {
            System.out.printf("Girilen %d sayısı ,üretilen %d sayısına eşittir.", girilenSayi, rasgeleSayi);
        }

        // </editor-fold>
    }

}
