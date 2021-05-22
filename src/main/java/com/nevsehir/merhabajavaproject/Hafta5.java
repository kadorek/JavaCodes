package com.nevsehir.merhabajavaproject;

import java.util.Scanner;

public class Hafta5 {

    public static void main(String[] args) {
        // c# namespace
        //using system.mvc
        //javada paket, c# namespace(isim uzayı)
        //java da bir takım kütüphaneler paketlere ayrılmıştır.
        //bir paketi yazılıma dahil etmek için ilgili paketi import etmeliyiz
        //import java.util.scanner;
        //java da giriş işlemleri Scanner sınıfı kullanılarak yönetilir.
        //import com.nevsehir.merhaba.......;
        //import java.util.*;
        //import java.*;

        //Scanner sınıfı java da girişleri okumak için kullanılır.
        String metin = "";
        Scanner okuyucu = new Scanner(System.in);//okuyucu adındaki scanner türündeki nesne sisteme yapıaln girişleri okuyacak.
//        System.out.println("Lütfen bir giriş yapınız : ");
//        metin = okuyucu.nextLine();
//        System.out.printf("kullanıcının girdiği metin : %s ",metin);
        /*
            next() : Yapılan girişte boşluğa kadar olan kısmı okur.
            nextLine() : Yapılan girişi satır olarak okur.
            nextInt() : Yapılan girişi integer tipine çevirerek okur.
            nextFloat() : Float tipine çevirip okur.
            nextDouble() : Double tipine çevirip okur.
        */
        /*
            Klavyeden ayrı ayrı girilen ad ve soyad bilgisini birlikte ekrana yazdıran program kodlarını java da yazınız.
        */
        /*Çözüm*/
//        String ad="";
//        String soyad="";
//        System.out.println("Lütfen adınızı giriniz : ");
//        //ad=okuyucu.nextLine();
//        System.out.println("Lütfen soyadınızı giriniz : ");
//        //soyad=okuyucu.nextLine();        
//        System.out.printf("Adınızı  : %s %s", ad,soyad);
        /*
            Klavyeden girilen 3 sayının ortalamasını bulan programı java da kodlayınız.
        */
        /*Çözüm*/
//        double s1,s2,s3;
//        double ortalama;
//        System.out.println("    Lütfen ilk sayıyı giriniz: ");
//        s1=okuyucu.nextInt();
//        System.out.println("    Lütfen ikinci sayıyı giriniz: ");
//        s2=okuyucu.nextInt();
//        System.out.println("    Lütfen üçüncü sayıyı giriniz: ");
//        s3=okuyucu.nextInt();
//        
//        ortalama=(s1+s2+s3)/3;
//        System.out.println("Girilen sayıların ortalaması : "+ortalama);
        
        /*
            ÖDEV : 
            1- Ortalamada virgülde hesaplanmalı
            2- Kenarları klavyeden girilen üçgenin çeşidini ekrana yazdıran program
            3- Klavyeden girilen 10 sayısdan küçük sayının faktörüyelini hesaplayan programı yazınız.
        */
        /*
            Anlık soru
            Soru : Klavyeden girilen n adet sayının ortalamasını bulan programı java dilinde yazınız.
        
        */
        /*Çözüm*/
        
        double girilenSayi=0;
        int bitisIsareti=-1;
        double toplam=0;
        int girilenSayiAdedi=0;
        
        do {
            System.out.println("Lütfen bir sayı giriniz(Girişi bitirmek için -1 giriniz):");
            girilenSayi=okuyucu.nextDouble();
            girilenSayiAdedi++;
            toplam+=girilenSayi;
        } while (girilenSayi!=bitisIsareti);
        
        double ortalama=toplam/girilenSayiAdedi;
        //System.out.printf("Girilen %d adet sayının ortalaması : "+ortalama, girilenSayiAdedi);
        System.out.printf("Girilen %d adet sayının ortalaması : %f", girilenSayiAdedi,ortalama);
        
        
        
        
    }

}



