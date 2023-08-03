package Tekrargun07;

public class StringContains {
    public static void main(String[] args) {
        String cumle="Merhaba dunya";

        boolean varMi=cumle.contains("a");
        System.out.println("varMi a="+varMi);

        System.out.println("varmi a="+cumle.contains("a"));
        System.out.println("varMi ya="+cumle.contains("ya"));
        System.out.println("varMi z="+cumle.contains("z"));
    }
}
