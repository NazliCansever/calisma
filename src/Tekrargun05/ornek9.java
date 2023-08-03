package Tekrargun05;

import java.util.Scanner;

public class ornek9 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("kg=");

        double kg= oku.nextDouble();

        System.out.print("cm=");
        double cm= oku.nextDouble();

        System.out.print("boyunuz ve kolunuz="+kg+cm);

        double kitleindexi=kg/(cm*cm);
        System.out.print("kitle indexi="+kitleindexi);
    }
}
