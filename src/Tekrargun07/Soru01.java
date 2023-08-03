package Tekrargun07;


import java.util.Scanner;

public class Soru01 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("adiniz ve soyadiniz=");
        String adSoyad= oku.nextLine();

        int boslukIndex= adSoyad.indexOf(" ");
        String ad=adSoyad.substring(0,boslukIndex);
        String soyad= adSoyad.substring(boslukIndex+1);

        System.out.println("ad="+ad);
        System.out.println("soyad="+soyad);





    }
}