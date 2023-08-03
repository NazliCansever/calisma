package Gun06;

import java.util.Scanner;

public class _01_Ornek {
    // Kullaniciya ogrenci misiniz seklinde sorunuz.
    // Evet ise True , degil is False cevabini veriniz


    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.println("Ogrenci misiniz=");
        boolean cevap = oku.nextBoolean(); // True veya False

        System.out.println("cevabiniz="+ cevap);
    }
}
