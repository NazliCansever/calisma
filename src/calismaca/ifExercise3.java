package calismaca;

import java.util.Scanner;

public class ifExercise3 {
    //konsoldan bi sayi al ciftse cift, tekse tek yazdir.
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int sayi= in.nextInt();
        if (sayi % 2 == 0){
            System.out.println("bu bir cift sayidir");
        }else{
            System.out.println("bu bir tek sayidir");
        }
    }
}
