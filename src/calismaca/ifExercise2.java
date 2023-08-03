package calismaca;

import java.util.Scanner;

public class ifExercise2 {
    //n den me kadar olan tek sayilari yazdir.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = n; i <= m; i++) {
            if (i % 2 != 0) {
                System.out.println(i);

            }
        }
    }
}
