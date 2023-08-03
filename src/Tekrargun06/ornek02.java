package Tekrargun06;

import java.util.Scanner;

public class ornek02 {
    public static void main(String[] args) {

        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        Scanner okubool= new Scanner(System.in);

        System.out.print("Cadde=");
        String cadde= okuStr.nextLine();

        System.out.print("Sokak=");
        String Sokak= okuStr.nextLine();

        System.out.print("Posta kodu=");
        int Postakodu= okuInt.nextInt();

        System.out.print("ulke=");
        String ulke= okuStr.nextLine();

        System.out.print("ev sahibimisiniz=");
        boolean evsahibimisiniz= okubool.nextBoolean();

    }
}
