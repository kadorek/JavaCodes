
package com.nevsehir.merhabajavaproject;

import java.util.Arrays;

public class Hafta14 {
   
    public static void main(String[] args) {        
        int[] d1= {2,45,78,100,56,89,66};
        int[] d2= new int[4];
        
//        for (int i = 0; i < d1.length; i++) {
//            d2[i]=d1[i];
//        }

//        System.arraycopy(d1, 2, d2, 0, 4);
//        System.out.println("1.dizi(d1)");
//        DiziYaz(d1);
//        System.out.println("2.dizi(d2)");
//        DiziYaz(d2);
        DiziYaz(d1);
        Arrays.sort(d1,3,7);
        DiziYaz(d1);
    }
    
    public static void DiziYaz(int[] _d){
        System.out.println("");
        for (int i = 0; i < _d.length; i++) {
            System.out.printf(" %d ",_d[i]);
        }
        System.out.println("\n");        
    }
    
    
}
