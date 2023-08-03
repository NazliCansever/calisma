package tekrar10;

import java.util.Scanner;

public class ornek03 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("sayi giriniz=");
        int sayi= oku.nextInt();

        int kalan= sayi%2;
        if (kalan == 0)
            System.out.println("cift");
        else
            System.out.println("tek");


    }
}
