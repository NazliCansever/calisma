package Tekrargun07;

public class StringLowerCase {
    public static void main(String[] args) {
        String text="Merhab Dunya";
        System.out.println("orjinal hali="+text);

        System.out.println("text");
        System.out.println("text.toLowerCase()="+text.toLowerCase());

        boolean basliyorMu=text.startsWith("M");
        boolean basliyorMu2=text.startsWith("m");
        boolean basliyorMuIgnoreCase=text.toLowerCase().startsWith("m");

        System.out.println("basliyorMu="+basliyorMu);
        System.out.println("basliyorMu2="+basliyorMu2);
        System.out.println("basliyorMuIgnoreCase="+basliyorMuIgnoreCase);
    }
}
