package Tekrargun03;

public class tekrar02 {
    public static void main(String[] args) {
        int sayi; //  hafizada int kadar yer kaplar, sadece tam sayi atilabilir
        // tam sayilar default int

        // tam sayilar
        byte byteDeger=7; // -128 - 127
        short shortDeger=1645;  // - 32000 - 32000
        int intDeger=2500000;
        long longDeger=34343434438787L;


        // ondalikli sayilar default double
        // ondalikli sayilar
        double doubleDeger= 3.354625756767; //noktadan sonra 16 haneye kadar hassasiyet var
        float floatDeger=3.63254f; // noktadan 5 hane hassasiyeti var , ama kararsiz

        // karakter ve harfler
        char basHarf='A'; // bir tane harf saklayabilir
        String isim="ismet"; // kelime veya cumle saklayabilir, uzunlugu degisken

        System.out.println("byteDeger="+byteDeger);
        System.out.println("shorDeger="+shortDeger);
        System.out.println("intDeger="+intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("isim = " + isim);




    }
}
