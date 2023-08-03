package tekrar10;

import java.util.Scanner;

public class ornek01 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("sifreniz=");
        String sifre=oku.nextLine();
        System.out.println("sifreniz tekrar=");
        String sifreTekrar=oku.nextLine();

        if (sifre==sifreTekrar)
            System.out.println("AYNI ==");

        if (sifre.equals(sifreTekrar)==true)
            System.out.println("AYNI");

        if (sifre.equals(sifreTekrar)== false)
            System.out.println("DEGIL");
    }
}
