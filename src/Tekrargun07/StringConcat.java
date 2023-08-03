package Tekrargun07;

public class StringConcat {
    public static void main(String[] args) {

        String s1="merhaba";
        String s2="dunya";

        System.out.println("birlesik hali="+s1+s2);
        System.out.println("birlesik hali="+s1.concat(s2));
        System.out.println("birlesik hali="+s1.concat(" ").concat(s2));
        System.out.println("birlesik hali="+s1.concat(" "+s2));

        System.out.println("s1="+s1);
        System.out.println("s2="+s2);

    }
}
