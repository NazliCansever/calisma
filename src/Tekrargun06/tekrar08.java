package Tekrargun06;

import java.util.Scanner;

public class tekrar08 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.println("Adiniz ve soyadiniz=");
        String adSoyad=oku.nextLine();

        char ilkHarf=adSoyad.charAt(0);
        int boslukIndex=adSoyad.indexOf(" ");
        char soyadIlkharf= adSoyad.charAt(boslukIndex+1);

        System.out.println(ilkHarf+"."+soyadIlkharf+".");









    }
}
