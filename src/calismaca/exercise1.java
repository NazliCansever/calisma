package calismaca;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercise1 {
    //0'dan n'e kadar olansayilari yazdir.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Bir sayi gir!");
        int n = in.nextInt();
        if (n > 10) {
            System.out.println("10 dan buyuk");

        } else {
            System.out.println("10dan kucuk");
        }

    }
}


