package Tekrargun05;

import java.util.Scanner;

public class ornek7 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("kisa kenar giriniz=");

        int kenar1=oku.nextInt();

        System.out.print("uzun kenar giriniz=");

        int kenar2=oku.nextInt();

        int cevre=kenar1+kenar2+kenar1+kenar2;

        System.out.println("cevre="+cevre);

        int alan=kenar1*kenar2;

        System.out.println("alan="+alan);


    }
}