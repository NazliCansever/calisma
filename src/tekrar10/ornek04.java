package tekrar10;

import java.util.Scanner;

public class ornek04 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("sayi giriniz=");
        int sayi= oku.nextInt();

        int kalan=sayi%1;

        if ((sayi>0) && (sayi%2==1))
        System.out.println("uygun sayi girildi");
        else

        System.out.println("uygun sayi girilmedi");


    }
}
