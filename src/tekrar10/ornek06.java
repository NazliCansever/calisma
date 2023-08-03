package tekrar10;

import java.util.Scanner;

public class ornek06 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("password=");
        String password= oku.nextLine();

        if (password.length()>=8 && password.length()<=12 && !password.toLowerCase().contains("pass"))
            System.out.println("uygun");
        else
            System.out.println("uygun degil");

    }
}
