
package com.nevsehir.merhabajavaproject;

import java.util.Scanner;
public class Hafta9 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        MerhabaYaz();
        MerhabaYaz();
        MerhabaYaz();
        
        MerhabaYaz("Ali");
        MerhabaYaz("Ayşe");
        
        String yeniIsim="Mehmet";
        MerhabaYaz(yeniIsim);
        System.out.println(yeniIsim);
        System.out.println("\n ************** \n");
        MerhabaYaz("Fatma", 3);
        
        System.out.println("\n ************** \n");
        
        SayiIsteTopla();
        
        System.out.println("\n ************** \n");
        
        BuyukOlaniBul(5, 3);
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="1. Bölüm">
    //Geri dönüş değeri olmayan ve parametre almayan metotlar
    /*
        [erişim belirleyici] [geri dönüş tipi] [metot adı]([Metot Parametreleri - Şart değildir])
        {
            [Metot Gövdesi]
            ......
            ......
            ......
        }
    */
    
    public static void MerhabaYaz()
    {
        //Kod yazarken belirli bir isimlendirme standardı edinmekte fayda vadır.
        //Metot isimleri de bu standarda uygun yazılmalıdır.
        //Metot ismi yapacağı iş ile ilgili ipucu verirse sağlıklı.
        System.out.println("Merhaba Millet !!!");    
    }
    
    // </editor-fold>
        
    // <editor-fold defaultstate="collapsed" desc="2. Bölüm">
    //Geri dönüş değeri olmayan ve parametre alan metotlar
    /*
        parametre : programın çalışma esnasında metota gönderdiği bir takım değerlerdir. gönderilen değerlerin metot tanımındaki tipler ile uyuşması ve sıralasımasının doğru olması gereklidir.
    */
    
    public static void MerhabaYaz(String _isim){
        _isim=_isim+"-cik";
        System.out.printf(" Merhaba %s \n",_isim);
    }
    
    
    /*
    Metot imzası(Signature): Metodun ismi ve parametre listesi metot imzasını oluşturur. Geri dönüş tipi metot imzasında etkili değildir. Bir sınıfta bir imzaya sahip sadece bir metot olabilir.
    */
    
    public static void MerhabaYaz(String _ad,int adet){
        for (int i = 0; i < adet; i++) {
            System.out.println("Merhaba "+_ad);
        }
    }
    
    /*
    Nesnelerin davranışlarını , işlevlerini metotlar sayesinde gerçekleştiririz.
    */
    /*
    soru : parametre almayan ve kullanıcının girdiği iki sayının toplamını ekrana yazan metotu yazınız.
    */
    
    
    public static void SayiIsteTopla(){
        Scanner okuyucu= new Scanner(System.in);
        System.out.println("Lütfen toplancak ilk sayıyı giriniz : ");
        int s1= okuyucu.nextInt();
        System.out.println("Lütfen toplancak ikinci sayıyı giriniz : ");
        int s2= okuyucu.nextInt();        
        System.out.printf("%d sayısı ile %d sayısının toplamı %d sayısına eşittir. \n",s1,s2,s1+s2);    
    }
    
    /*
    soru : Kendisine parametre olarak verilen iki sayıdan büyük olanı ekrana yazdıran metotu yazınız.
    */
    
    public static void BuyukOlaniBul(int s1,int s2){
    
        if (s1>s2) {
            System.out.printf("%d sayısı %d sayısından büyüktür. \n",s1,s2);
        }else if (s2>s1) {            
            System.out.printf("%d sayısı %d sayısından büyüktür. \n",s2,s1);
        }else{
        System.out.printf("%d sayısı %d sayısına eşittir. \n",s2,s1);
        }
        
        
    }
    
    // </editor-fold>
}
