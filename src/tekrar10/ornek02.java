package tekrar10;

import java.util.Scanner;

public class ornek02 {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        System.out.println("notu giriniz=");
        int ogrNot= oku.nextInt();

        if (ogrNot>=50)
            System.out.println("gectiniz");
        else
            System.out.println("kaldiniz");

    }
}
