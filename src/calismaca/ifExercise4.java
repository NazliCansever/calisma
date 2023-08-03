package calismaca;

import java.util.Scanner;

public class ifExercise4 {
    //n den m e kadar olan cift sayilarin topla
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("n : ");
        int n = in.nextInt();
        System.out.println("m : ");
        int m = in.nextInt();
        int sum = 0;
        for (int i = n; i <= m; i++) {

            if (i % 2 == 0) {
                sum = sum + i;
                System.out.println(i);
            }
        }
                System.out.println("toplam = " + sum);
                }

    }

