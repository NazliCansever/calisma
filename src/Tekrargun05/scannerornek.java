package Tekrargun05;

import java.util.Scanner;

public class scannerornek {
    // //soru3: Kullanıcıdan üç kenar uzunluğu girişi alıp üçgenin çevresini hesaplayan bir program yazınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("kenar = ");


        int kenar = oku.nextInt();

        System.out.print("kenar2 = ");

        int kenar2 = oku.nextInt();

        System.out.print("kenar3 = ");

        int kenar3 = oku.nextInt();

        int cevre = kenar+kenar2+kenar3;



        System.out.println("cevre = "+cevre);


    }


}
