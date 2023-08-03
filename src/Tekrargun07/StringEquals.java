package Tekrargun07;

public class StringEquals {
    public static void main(String[] args) {
        String s1="merhaba";
        String s2="MERHABA";

        boolean esitMi=s1.equals(s2);
        System.out.println("esitMi="+esitMi);

        System.out.println("esitmi="+s1.equals(s2));
        System.out.println("esitMi="+s1.equals("merhaba"));

    }
}
