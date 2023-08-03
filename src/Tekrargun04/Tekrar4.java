package Tekrargun04;

public class Tekrar4 {
    public static void main(String[] args) {
        String not1="83";
        String not2="95";
        String not3="56";


        int intNot1=Integer.parseInt(not1);
        int intNot2=Integer.parseInt(not2);
        int intNot3=Integer.parseInt(not3);

       int toplamNot=intNot1+intNot2+intNot3;

        System.out.println("toplamNot="+toplamNot);

        double ort=toplamNot/(double)3;
        System.out.println("ort="+ort);



    }
}
