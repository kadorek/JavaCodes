package com.nevsehir.merhabajavaproject;

import java.util.Arrays;
import java.util.ArrayList;

public class Hafta14 {

    public static void main(String[] args) {
        int[] d1= {2,45,78,100,56,89,66};
        int[] d2= new int[4];
       
        
        for (int i = 0; i < d1.length; i++) {
            d2[i]=d1[i];
        }

        System.arraycopy(d1, 2, d2, 0, 4);
        System.out.println("1.dizi(d1)");
        DiziYaz(d1);
        System.out.println("2.dizi(d2)");
        DiziYaz(d2);
        DiziYaz(d1);
        Arrays.sort(d1,3,7);
        DiziYaz(d1);
        
        Object[] objectDizisi= new Object[3];
        objectDizisi[0]= new Object();
        objectDizisi[1]= new Object();
        objectDizisi[2]= new Object();
        
        objectDizisi[2]=null;

        //Haftanın 2.Bölümü
        //Listeler : ArrayList (esnek dizi gibi düşünülebilir.)
        ArrayList<String> liste1 = new ArrayList<String>();
        //veritipleri : değer ve referans olmak üzere ikiye ayrılır.        

        liste1.add("Ali");
        liste1.add("Veli");
        liste1.add("Ayşe");
        liste1.add(1, "Fatma");

        /*
            Önemli ArrayList metodları :
            add() : listeye eleman eklemek için kullanılır. gerekirse araya da eleman ekleyebilir.
            remove(): listeden ,belirtilen indis numarasında yer alan elemanı siler.
            set() : listede yer alan belirli bir elemanı güncelleme işlemi için kullanılır.
            clear() : listedeki tüm elemanları siler.
            indexOf() : listede istenilen bir elemanı arar. Bulursa indis numarasını döndürür. Bulamazsa -1 döndürür.
            size() : listenin eleman sayısını verir.
            get() : verilen indisdeki elemanı döndürür.
        
         */
        System.out.println("Oluşturulan listenin eleman sayısı : " + liste1.size());
        liste1.remove(3);
        System.out.println("Ayşe listenden silindi.");
        System.out.println(" listenin eleman sayısı : " + liste1.size());
        System.out.println(liste1);
        System.out.println("Ali listeden siliniyor");
        liste1.remove("Ali");
        System.out.println(" listenin eleman sayısı : " + liste1.size());
        System.out.println(liste1);
//        liste1.set(0, "Fatoş");
//        System.out.println(liste1);
        
        int fatmaninNumarasi=liste1.indexOf("Fatma");//0 dan listenin uzunluğunun 1 eksiğine kadar.
        if (fatmaninNumarasi!=-1) {
            liste1.set(fatmaninNumarasi, "Fatoş");
        }
        
        
        

    }

    public static void DiziYaz(int[] _d) {
        System.out.println("");
        for (int i = 0; i < _d.length; i++) {
            System.out.printf(" %d ", _d[i]);
        }
        System.out.println("\n");
    }

}
