package Tekrargun07;

public class StringToUpperCase {
    public static void main(String[] args) {
        String text="Merhab Dunya";

        System.out.println("orjinal hali="+text);
        System.out.println("text.toUpperCase()="+text.toUpperCase());

        boolean bununlaBasliyormu= text.toUpperCase().startsWith("M");
        System.out.println("M veya m ile basliyor mu="+ bununlaBasliyormu);

    }
}
