package com.nevsehir.merhabajavaproject;

import java.util.Locale;

public class Hafta15 {

    public static void main(String[] args) {

        /*
            Hafta 15 1.bölüm
         */
        String metin1 = "Ali";
        String metin2 = new String("Veli");//new ifadesi bir class kullanılığını gösterir dolayısıyla referans tiplidir.

        /*
            String sınıfına ait önemli metotlar;
        
            Not : . operatörünün kullanımı ve detayları nesne 2 dersinde verilecek.
        
         */
        String s = "Merhaba millet";
        String boslukluS= "      Merhaba millet       ";
 /*            
            length() : String değişkenimizin kaç karakterden oluştuğunu , diğer deyişle uzunluğunu verir. Bu karakter uzunluğuna boşluk, özel karakterler vb. karakterler de dahildir. Geri dönüş tipi int .
         */
        int uzunluk = s.length(); //14
        
        /*
            charAt(indis:int):  Sting değişkendeki indis ile belirtilen konumdaki karakteri döndürür. Geri dönüş tipi char. String ifadelede indis 0 'dan başlar. Verilen indis değişkenin uzunluğunu aşarsa hata verir.
         */
        char karakter=s.charAt(0); //  M   ASCII, Unicode 'm'!='M'
        
        /*
            substring(başlagıçIndisi:int, bitişIndisi:int) : String değişkende verilen iki indis arasındaki parça string ifadeyi döndürür. Geri dönüş tipi String . Eğer bitiş indisi verilmemişse o zaman başlangıç indisinden değişkenin değerinin sonuna kadar alır. Verilen bitiş indisi parçaya dahil değildir.
        
        */
        
        String parca1=s.substring(8); // "millet"
        String parca2=s.substring(4,7); // "aba"  not : bitiş indisi parçaya dahil değildir.
        
        
        /*
            indexOf(aranandeger:String) : String değişken içerisinde parametre olarak verilen aranan değeri bulmaya çalışır. İlk bulunduğu konumun başlangıç indisini verir. Bulmazsa -1 değerin, döndürür. GEri dönüş tipi int.
        
        */
        
        int bulunamadi=s.indexOf("kar"); // -1
        int bulundu=s.indexOf(parca2); // 4
        int e_nin_ilk_yeri=s.indexOf("e"); // 1
        
        /*
            lastindexOf(aranandeger:String) : String değişken içerisinden aranan string değerin bulunduğu son konumun başlangıç indisini verir. Bulamazsa -1 verir. Geri dönüş tipi int.
        */
        
        int e_nin_son_yeri=s.lastIndexOf("e") ; // 12
        
        /* Haftanın 2.Bölümü  */
        
        /*
            replace(eskideger,yenideger) : String değişken içerisinde eskideger ile yenideger değeri değiştirir. Geri dönüş tipi String. Regular Expression (düzenli ifadeler) ile birlikte kullanılabilir.Düzenli ifade örneği : "[0-9]*" --> ilk karekteri rakam olan ve gerisinin ne olduğunun önemi olmayan metinsel değerleri ifade eder.
        */
        
        String yeniMetin=s.replace("m","y"); //"Merhaba yillet"
        
        
        /*
            toUpperCase() : Birlikte kullanılan string tipindeki değişkenin içeriğinde yer alan tüm karakterleri büyük harf şekline dönüştürür. Geri dönüş tipi string. İstenirse belirli bir lisana göre çevrim de yapılabilr.
        
        */
        String buyukHarfliMetin=s.toUpperCase(); // "MERHABA MİLLET";
        
        /*
            toLowerCase() : Birlikte kullanılan string tipindeki değişkenin içeriğinde yer alan tüm karakterleri küçük harf şekline dönüştürür. Geri dönüş tipi string. İstenirse belirli bir lisana göre çevrim de yapılabilr.
        
        */
        
        String kucukHarfMetin=s.toLowerCase(); // "merhaba millet"

        /*
            Lokalizasyon neden önemli ; Tükçe de "ğ" 
            Örnek : "gök kuşağı"  --> toUpperCase() --> "G?K KU?A?I"
            doğru şekli : "gök kuşağı"  --> toUpperCase("tr-TR") --> "GÖK KUŞAĞI"
        */
        
        String trMetin="gök kuşağı";
        Locale tr=new Locale("tr","TR");
        String buyukTrMetin=trMetin.toUpperCase(tr);
        
        
        /*
            trim() : Birlikte kullanılan string değişkenin içeriğindeki başta ve sonda yer alan boşluk ifadelerini atar. Geri dönüş tipi string. 
        
        */
        
        String yeniS=boslukluS.trim(); // "Merhaba millet"
        
        /*
            toCharArray() :  Birlikte kullanıldığı string değişkeni karakter dizisine ( char[] ) çevirir. Geri dönüş tipi char[].
        
        Not : char != char[]        
        
        */
        
        char[] karakterler=s.toCharArray(); // ['M' , 'e','r','h','a','b','a',' ','',.....]
        
        
        /*
            .split(...); Birlike kullanılan string tipindeki değişkeni verilen parametrelere göre parçalar. Geri dönüş tipi String[]. Düzenli ifadeler ile kullanılabilirler.
        
        */
        
        String[] parcaliS=s.split(" "); // ["Merhaba","millet"];
        String yeniMetin2= s+" . Bugün nasılsınız ?"; // "Merhaba millet . Bugün nasılsınız ?"
        String[] parcaliYeniMetin2=yeniMetin2.split(" ");//["Merhaba","millet",".","Bugün","nasılsınız","?"]
        
        String[] parcali2YeniMetin2=yeniMetin2.split(" ",3);//["Merhaba","millet",". Bugün nasılsınız ?"]
        
    }

}
