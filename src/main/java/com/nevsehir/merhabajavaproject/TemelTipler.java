package com.nevsehir.merhabajavaproject;

public class TemelTipler {

    public static void main(String[] args) {
        
        byte byteDegisken = (byte) 95; // cast işlemi.
        short shortDegisken = (short) 7; //cast işlemi ile int değer short tipine döüştürüldü
        int intDegisken=12345;
        long longDegisken=123456789;
        
        float floatDegisken; //şuan değişkende 0 değeri
        floatDegisken=1.34567f;
        
        double doubleDegisken; // şuan değişkende 0 değeri
        doubleDegisken=1.23344;
        
        boolean booleanDegisken; // false deger var 
        booleanDegisken=true;
        
        String stringDegisken; //şuan değişkende null  değeri var
        stringDegisken="Ali";
        
        System.out.println("Merhaba yaşım "+byteDegisken);
        System.out.println("Merhaba yaşım"+" "+byteDegisken);
                
        
    }
}
/*
    Tam sayı alanlar

        byte
        short
        int
        long
        
            Tam sayı alan veri tipleri için varsayılan değer 0.

    Ondalıklı sayılar

        Float -> 1.(7 hane),32 bit, örnek : 1.1234567f
        Double ->1.(17 hane) ,64 bit,
        
            varsayılan değer 0.

    Karakter alanlar

        Char -> tek karakter, örnek : char a='x';
            varsayılan değer 0
        char değişkenler  hafızada sayısal olarak tutulur. ilgili karakterin unicode karşılığı tutulur.

        String -> istenilen karakter uzunluğu örnek : string ad ="Ahmet";
        string değişkenler karakter dizileri gibi düşünülebilir.
            varsayılan değer "null"
    Mantıksal değer alanlar
        boolean -> Mantıksal olarak 0 veya 1 alır, yani false veya true
            varsayılan değer "false"
*/
