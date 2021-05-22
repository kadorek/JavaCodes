
package com.nevsehir.merhabajavaproject;


public class TipDonusumu {
    
    public static void main(String[] args) {
        // Tip dönüşmüne CAST işlemi denir.
        int sayi1=0;
        float sayi2=1.23f;
        double sayi3=12.77778899;
        System.out.println("sayi 1 : "+sayi1);
        System.out.println("sayi 2 : "+sayi2);
        System.out.println("sayi 3 : "+sayi3);
        
        sayi1=(int)sayi2;
        
        System.out.println(" yeni sayi 1 : "+sayi1);
        sayi3=sayi1;
        System.out.println("yeni sayi 3 : "+sayi3);
    }
    
}
