package com.nevsehir.merhabajavaproject;

import java.util.Scanner;

public class Hafta16 {

    public static Scanner okuyucu = new Scanner(System.in);

    public static void main(String[] args) {
        //Soru1Cozum();
        //Ödev 1 : Soru 1 , String değişken içeriği türkçe olarak gözükecek şekilde düzenlenecek.
        Soru2Cozum();
        //Ödev 2 : Soru 2 çözümünde kullanıcı sayısal bir giriş yapmazsa programımız uyarı versin
    }

    /*
        Soru 1 : Metot kullanarak dışarıdan girilen iki metinden uzun olanını ekrana yazdıran programı kodlayınız.    
     */
    public static void Soru1Cozum() {
        System.out.println("Lütfen ilk metni giriniz :");
        String m1 = okuyucu.nextLine();
        System.out.println("Lütfen ikinci metni giriniz :");
        String m2 = okuyucu.nextLine();
        if (m1.length() > m2.length()) {
            System.out.println("Girilen metinlerden aşağıdaki metin en uzunudur. \n " + m1);
        } else {
            System.out.println("Girilen metinlerden aşağıdaki metin en uzunudur. \n " + m2);
        }
    }

    /*
        Soru 2 : Dışarından girilen bir sayıyı basamaklarına ayıran programın kodunu metot kullanarak yazınız.
        Örnek : 452 --> 400+50+2
     */
    public static void Soru2Cozum() {
        boolean sayiMi = false;
        String girilenSayi="";
        do {
            System.out.println("Lütfen bir sayı giriniz : ");
             girilenSayi = okuyucu.nextLine();            
            try {
                int sayi=Integer.parseInt(girilenSayi);
                sayiMi=true;
            } catch (Exception e) {                
                sayiMi=false;                
            }
        } while (!sayiMi);

        //m,e,r,h,a,b,a     ,     4,5,2
        char[] rakamlar = girilenSayi.toCharArray(); //    "452" --> ['4','5','2']
        /*
        Not : '' arasında yer alan ifade karekteri temsil eder, "" arasında yer alan ifade metni(string) tipini ifade eder.
        
         */
        String sonuc = "";

        for (int i = 0; i < rakamlar.length; i++) {  // 0,1,2          
            int siradakiRakam = Character.getNumericValue(rakamlar[i]);
            /*
                i=0 --> rakamlar[i] = '4' --> Character.getNumericValue(rakamlar[i]) = 4 
                siradakiRakam = 4
             */
            int basamakDegeri = (int) (siradakiRakam * Math.pow(10, rakamlar.length - i - 1));
            /*
                4 * 100 = 400
            
                4 dizide  0. eleman
                4 örnekte 2. eleman
                dizi boyu=3 , i=0 , boy-i-1=2 --> 10 üzeri 2 =100 => 4*100 =400
            
                5 dizide  1. eleman
                5 örnekte 1. eleman
                 dizi boyu=3 , i=1 , boy-i-1=1 --> 10 üzeri 1=10 => 5* 10 =50
            
             */
            if (i < rakamlar.length - 1) {
                sonuc += String.valueOf(basamakDegeri) + " + ";
            } else {
                sonuc += String.valueOf(basamakDegeri);
            }
        }
        System.out.println(sonuc);
    }

}
