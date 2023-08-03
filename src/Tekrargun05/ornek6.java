package Tekrargun05;

import java.util.Scanner;

public class ornek6 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.print("karenin kenarini giriniz=");

        int kenar=oku.nextInt();

        int cevre=kenar+kenar+kenar+kenar;

        System.out.println("cevre="+cevre);

        int alan=kenar*kenar;

        System.out.println("alan="+alan);
    }
}
