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

public class Hafta10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int deger=Topla();
        System.out.println("Değer  : "+deger);
        System.out.println("***********");
        Topla();
        
        System.out.println("***********");
        int buyukSayi=BuyukBul(7,3);
        System.out.println("Buyuk olan sayı : "+buyukSayi);
        System.out.println("****************");
        int buyuk=50;
        System.out.println("Main metotu buyuk değişkeni : "+buyuk);
         */
        DiziCalismalari();

    }

    // <editor-fold defaultstate="collapsed" desc="1. Bölüm">
    //Geri dönüş değeri olan metotlar
//    public static int Topla(){
//       int s1=3;
//       int s2=5;
//       int sonuc=s1+s2;
//       System.out.println("Metot Toplam : "+sonuc);
//       return sonuc;//return ifadesi geri değer döndürmek için kullanılır. geri dönüş değeri olan metotlarda return kullanılmazsa hata verir.
//    }
    /*
    soru : kendisine verilen iki sayıdan büyüğünü döndüren metotu yazınız.
     */
//    public static int BuyukBul(int s1,int s2){
//       /* 
//        Yöntem 1 : */
//        int buyuk=s1>s2?s1:s2;
//        /*if (s1>s2) {
//            buyuk=s1;
//        }else if (s2>s1) {
//            buyuk=s2;
//        }else{
//            buyuk=s1;
//        }  */
//        
//        return buyuk;
//        
//       /*Yöntem 2
//        if (s1>s2) {
//            return s1;
//        }else if(s2>s1){
//            return s2;
//        }else   {
//            return s1;
//        }*/
//       
//    }
//    
    //local (yerel) değişkenler : Metot içerisinde tanımlanan değişkenler yerel değişken olarak ifade edilir. Sadece metot içerisinde kullanılabilirler. Bu değişkenlere metot parametreleri de dahildir.
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="2. Bölüm - Diziler">
    //Dizi : Aynı türdeki bir veya birden çok veriyi tutabilen değişken tipidir. Diziler referans tipli değişkenlerdir.
    public static void DiziCalismalari() {

        int s1 = 5;//değer tipli değişken

        /*
        Dizi Tanımlaması: 
        
            veri_tipi[] dizi_adi=new veri_tipi[boyut]; 1.yol
            veri_tipi[] dizi_adi={değer1,değer2,değer3}; 2.yol
    
            -veri tipi tanımlanırken belirlenmek zorunda
            -diziler sabit uzunlukta olmak zorunda
            -dizilerin yapısı değiştirilemez. Not : İçeriği değişebilir.
            -dizilerde indis numaraları 0 dan başlar.
    
        Dizi içerisinde bir elemana erişmek için elemanın indis numarası kullanılır.
        Örnek : 
                    sayilar[2] ifadesi 2 indis numaralı 3. elemana işaret eder.
    
         */
        int[] sayilar1 = new int[3];//3 elemanlı içerisinde sadece int veri tipinde değer alabilen sayilar1 adında bir dizi tanımladık.Bu dizide şu an tüm değerler 0.
        int[] sayilar2 = {3, 5, 7};//içerisinde 3,5,7 değerleri bulunan 3 elemanlı int veri tipinde değer alan sayilar2 adında bir dizi tanımladık.

        String[] isimler = {"ali", "veli", "ayşe"};//içerisinde string değerler alan, 3 elemanlı ve içerisinde  ...... olan isimler adında bir dizi tanımlandı.

        //dizi boyutu değiştirme
        int[] d = {3, 4, 5};
        for (int i = 0; i < 3; i++) {
            System.out.printf("d dizisinin %d.elemanı : %d \n", i + 1, d[i]);
        }
        System.out.println("************");
        d = new int[5];//dizi boyutu değiştirildi ancak içerisinde var olan eski değerler kayboldu.
        for (int i = 0; i < 5; i++) {
            System.out.printf("d dizisinin %d.elemanı : %d \n", i + 1, d[i]);
        }      
         
        isimler[1]="yaşar";
        Scanner okuyucu= new Scanner(System.in);
        int[] girilenSayilar= new int[5];
        
        System.out.printf("Lütfen %d adet sayı giriniz. Her sayıdan sonra enter tuşuna basınız. \n",girilenSayilar.length);
        
        
        for (int i = 0; i < girilenSayilar.length; i++) {
            girilenSayilar[i]=okuyucu.nextInt();
        }
        //debug : yazılımdan hata ayıklamak.
        
        
        
    }

}

// </editor-fold>

