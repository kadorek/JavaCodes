/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nevsehir.merhabajavaproject;

public class Hafta4 {

    public static void main(String[] args) {
        // TODO code application logic here

        int s1 = 5;
        int s2 = 7;
        if (s1 > s2) {
            System.out.println("s1 buyuk");
        } else if (s2 > s1) {
            System.out.println("s2 buyuk");
        } else {
            // eşit olduğu durum
            System.out.println("ikisi eşit");
        }

        int sonuc = s1 > s2 ? s1 : s2; //satır içi IF kullanımı. sadece 2 durum kapsanır. genelde kontrole bağla değer atamalarında kullanılır.
        
        /*
            Yukarıda yer alan satır içi if yapısının uzun hali.
            if (s1>s2) {
                sonuc=s1;
            }else{
                sonuc=s2;
            }
        */
        
        s1=5;
        s2=7;
        if (s1>s2) {            
            System.out.println("s1 buyuk");
        }
        if (s2>s1) {            
            System.out.println("s2 buyuk");
        }
        if (s2==s1) {            
            System.out.println("ikisi eşit");
        }else  {
            System.out.println("Yanlışlık var arkadaş....");
        }
        
      //switch-case  
        byte gunNumarasi =3;
        switch(gunNumarasi){
            case 1:
                    System.out.println("Pzt");
                break;
            case 2:
                    System.out.println("Salı");
                break;
            case 3:
                    System.out.println("Çrş");
                break;
            case 4:
                    System.out.println("Prş");
                break;
            case 5:
                    System.out.println("Cuma");
                break;
            case 6:
                    System.out.println("Cmt");
                break;
            case 7:
                    System.out.println("Pazar");
                break;
            default:                
                    System.out.println("Değerde hata var");        
        }
        
        switch (gunNumarasi){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta içi");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
               System.out.println("Yanlış değer.");
                break;
                    
        }
        
        int s5=7;
        String durum= s5%2==1?"tek":"çift";
        System.out.println(durum);
        
        /*
        2.Bölüme
        
        Döngüler
        
        Defalarca yapılması gereken standart kod bloklarını tekrar tekrar yazmak yerine döngü kullanarak koşula bağlayabiliriz.
        
        while, do...while, for
        
        Genel olarak adım sayısı, adım aralığı gibi durumlar belirli ise for döngüsü tercih edilir, ancak döngü daha çok koşula bağlı ise while döngüsü tercih edilir.
        do-while döngüsünde, döngü bloğu içindeki kod kısmı ne olursa olsun en az bır kez çalışır .
        
        
        */
        
        
        int s6=10;
        while(s6<7){        
            System.out.println("sayı 7 den küçük");
        }
        System.out.println("while döngüsü bitti.");
        
        
        do{
            System.out.println("sayı 7 den küçük");
        }
        while(s6<7);
        System.out.println(" do-while döngüsü bitti.");
        
       for(int s7=5,s8=30;s7<15 && s8<40;s7++,s8++){
           
           if (s7==11) {
               continue;
           }
           System.out.printf("s7 : %d s8: %d \n", s7,s8);
//           if (s7==8) {
//               break;
//           }
       }
        
       /*
       break,continue
       
       break : içerisinde bulunduğu döngüyü sonlandırır. Döngünün tamamlanmış olup olmaması farketmez
       continue : içerisinde bulunduğu döngünde kendisinden sonra gelen kod bloklarını atlar.
       */
        
       
    }

}
