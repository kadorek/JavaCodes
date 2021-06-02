package com.nevsehir.merhabajavaproject;

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
        
        
    }

}
