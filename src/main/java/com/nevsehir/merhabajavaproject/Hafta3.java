package com.nevsehir.merhabajavaproject;

public class Hafta3 {

    public static void main(String[] args) {
        // TODO code application logic here
        String metin = "13.45";//ali,araba,ev,asdbc önemli : çift tırnak içerisindeki her ifade metinsel ifadedir.
        int sayi1=0;
        double sayi2=0;
        
        sayi2=Double.valueOf(metin);
        sayi1=(int)sayi2;
        
        //System.out.println("sayi 1 : "+sayi1);
        //System.out.println("sayi 2 : "+sayi2);
                
        String metin2= "Ali13";
        //sayi1=Integer.valueOf(metin2); //uygun olmayan tip dönüşümü
        //sayi1=Integer.parseInt(metin2);
        //System.out.println(sayi1);
        
        String metin3="22 nokta";
       // sayi1=Integer.valueOf(metin3);
        //sayi1=Integer.parseInt(metin3);
        sayi2=Double.parseDouble(metin); /// TipAdı.parse[tipAdı]();
        //System.out.println(sayi1);
                
        /*
        
        Yazılım tasarımı esnasında programda 2 çeşit hata çıkabilir. 
        1. Compile Time Error : Derleme zamanı hataları. Örnek : satır sonunda noktalı virgül unutması
        2. Run Time Error : Çalışma anında çıkan hata. Örnek : Yanlış tip dönüşümü.
        
        */
        
        
        /***   JAVA operatörler   ***/
        
        /*
            Temel matematiksel operatörler : +,-,*(çarpma),/(bölme)
            Diğer matematiksel operatörler : %(mod) Örnek : 7%2=1 , --(adım adım eksiltme), ++(adım adım arttırma)
            Atama operatörleri : =,+=,-=,*=,/=,%=
            Karşılaştırma operatörleri : ==,>,<,>=,<=,!=   -->  sayısal değerlere özgüdür
            Mantıksal operatörler : &&(ve),||(veya),!(değil)
        */
        
//        int sayi5=7;
//        int sayi6=2;
//        System.out.println(sayi5%sayi6);
//        
//        int sayi7=sayi6++;
//        System.out.println("sayı6 : "+sayi6);
//        System.out.println("sayi7 : "+sayi7);
        
        
        int deneme=5;        
        int son=++deneme%4;
        System.out.println(son);
        
        
        int d2=5;
        d2+=3; //d2 değişkeni ile 3 sayısını topla ve d2 değişkenine ata.
        System.out.println("d2 : "+d2);

        int d3=10;
        int d4=3;
        d3-=++d4;//önce eşittirin sağ tarafoına baktık. ++d4 demek d4 değişkenini 1 arttır demektir.-= : çıkar ata demektir. d3=d3-d4;
        System.out.println("d3 : "+d3);

        
        int d5=4;
        int d6=8;
        d5-=++d6;
        System.out.println("d5 : "+d5);
        
        
        int d7=5;
        int d8=6;
        boolean b1=d7>d8;
        boolean b2=d7!=d8;
        System.out.println("b1 : "+b1);
        System.out.println("b2 : "+b2);
        
        
        boolean b3=true;
        boolean b4=false;
        
        boolean b5=!b3;  //! işareti mantıksal değeri tersine çevirir. true-> false ,false-> true
        boolean b6=b3&&b4; //&& -> and (ve) anlamına gelir. iki durum da true ise sonuç true olur. diğer tüm durumlarda sonuç false
        boolean b7=b3||b4; // || -> or (veya) anlamına gelir. eğer iki durum da false olursa sonuç false olur. diğer tüm durumlarda sonuç true olur.
        
        System.out.println("b5 : "+b5);
        System.out.println("b6 : "+b6);
        System.out.println("b7 : "+b7);
        
        //Kod blokları
        {
       
            //blok 1
            int b1d=5;            
            {
                //blok 2
                int b2d=10;
                System.out.println("b1d: "+ b1d);              
        
            }
            { 
                //blok3
                int b3d=20;
                System.out.println("b1d : "+b1d);
                //System.out.println("b2d : "+b2d);  -> hatalı çağırma
                {
                    //blok 4
                    System.out.println("b1d : "+b1d);
                    //System.out.println("b2d : "+b2d);   -> hatalı çağırma
                }
            }
            //System.out.println("b2d : "+b2d);  -> hatalı çağırma
        }
        
        /*
        Ödev : 
            
            1 - if-elsi if-else kontrol yapılarını kullanarak iki sayıyı karşılaştıran ve ekrana yazdıran bir java programı
            2 - while döngüsü kullanarak 1-10 arsındaki sayıların toplamını ekrana yazdıran java programı
        
        */
        
    }

}
