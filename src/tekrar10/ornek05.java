package tekrar10;

import java.util.Scanner;

public class ornek05 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("cumle giriniz=");
        String cumle= oku.nextLine();

        if (cumle.length()>10 && cumle.toLowerCase().contains("study"))
            System.out.println("evet");
        else
            System.out.println("hayir");


    }
}
