package Tekrargun09;

import java.util.Scanner;

public class ornek05 {
    public static void main(String[] args) {
        // girilen bir cumlede a harfinin gecip gecmedigini bulunuz , geciyor ise evet gecmiyor ise hayir yazdiriniz

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle girin: ");
        String cumle = scanner.nextLine();

        if (cumle.contains("a") || cumle.contains("A")) {
            System.out.println("Evet, cümlede 'a' harfi geçiyor.");
        } else {
            System.out.println("Hayır, cümlede 'a' harfi geçmiyor.");
        }
    }
}


