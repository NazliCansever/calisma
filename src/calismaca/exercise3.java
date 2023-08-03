package calismaca;

import java.util.Scanner;

public class exercise3 {
    //n'den m'e kadar olan sayilari yazdir
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = n; n <= m; i++) {

            System.out.println(i);

        }
    }
}
