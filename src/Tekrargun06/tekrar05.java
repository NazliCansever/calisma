package Tekrargun06;

import java.util.Scanner;

public class tekrar05 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("kelime giriniz=");
        String kelime=oku.nextLine();



        int uzunluk=kelime.length();

        char sonHarf=kelime.charAt(uzunluk-1);
        System.out.println("sonHarf="+sonHarf);


    }
}
