package Tekrargun04;

public class TekrarNarrowingCasting {
    public static void main(String[] args) {
        int toplam=6700;
        byte sayi=5;


        sayi=(byte) toplam;

        System.out.println("sayi="+sayi);


        double oran=3.7;

        toplam=(int) oran;

        System.out.println("toplam="+toplam);




    }
}
