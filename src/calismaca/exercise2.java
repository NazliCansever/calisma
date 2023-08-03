package calismaca;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        //1'den n e kadar olan sayilari yazdir.
        Scanner in=new Scanner(System.in);

        System.out.println("sayi giriniz");
        int n=in.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.print(i+" ");


        }

    }
}
