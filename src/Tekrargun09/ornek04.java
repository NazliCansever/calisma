package Tekrargun09;

import java.util.Scanner;

public class ornek04 {
    public static void main(String[] args) {
        // girilen bir ogrencinin notuna gore  50den buyuk - esit ise gectiniz , kucuk ise kaldiniz yazdirin


        Scanner oku=new Scanner(System.in);
        System.out.println("ogrenci notu=");
        int ogrnot= oku.nextInt();

        if (ogrnot >= 50)
            System.out.println("gectiniz");
        if (ogrnot <50)
            System.out.println("kaldiniz");
    }
}
