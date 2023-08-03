package calismaca;

import java.util.Scanner;

public class ifExercise1 {
    //0'dn n'e kadar olan cift sayilari yazdir
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int n = in.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) { //( esitse == degilse !=)
                System.out.println(i);

            }
        }

    }
}
