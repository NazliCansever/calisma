package Tekrargun09;

import java.util.Scanner;

public class ornek01 {
    public static void main(String[] args) {

        // girilen bir sayinin pozitif mi negatif mi oldugunu yazdiriniz
        // sifir ise sifir yazdiriniz

        Scanner oku=new Scanner(System.in);
        System.out.println("sayi giriniz=");
        int sayi=oku.nextInt();

        if (sayi>0)
        System.out.println("pozitif");

        if (sayi<0)
            System.out.println("negatif");
        if (sayi==0)
            System.out.println("sifir");

    }
}
