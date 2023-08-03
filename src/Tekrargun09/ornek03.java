package Tekrargun09;

import java.util.Scanner;

public class ornek03 {
    public static void main(String[] args) {
        // girilen bir sayinin tek mi cift mi oldugunu yazdiriniz

        Scanner oku=new Scanner(System.in);
        System.out.println("sayi giriniz=");
        int sayi= oku.nextInt();
        if (sayi%2 == 1)
            System.out.println("tek");
        if (sayi%2 == 0)
            System.out.println("cift");


    }
}
