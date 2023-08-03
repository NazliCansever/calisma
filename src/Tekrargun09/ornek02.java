package Tekrargun09;

import java.util.Scanner;

public class ornek02 {
    public static void main(String[] args) {
        //girilen iki sayidan buyuk olanini degerini ekrana yazdiriniz,
        // esit ise esit yazdiriniz

        Scanner oku=new Scanner(System.in);
        System.out.println("sayi1=");
        int sayi1= oku.nextInt();
        System.out.println("sayi2=");
        int sayi2= oku.nextInt();

        if (sayi1>sayi2)
            System.out.println("sayi 1 buyuk"+sayi1);
        if (sayi2>sayi1)
            System.out.println("sayi 2 buyuk"+sayi2);
        if (sayi1==sayi2)
            System.out.println("sayilar esit");
    }
}
