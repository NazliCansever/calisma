package Tekrargun04;

public class tekrarTipdonusumleri {
    public static void main(String[] args) {
        byte ogrNot1=98;
        byte ogrNot2=97;
        byte ogrNot3=99;
        byte ogrnot4=100;


        int toplamNot= ogrNot1+ogrNot2+ogrNot3+ogrnot4;
        System.out.println("toplamNot="+toplamNot);

        
        ogrNot2=(byte) toplamNot;
        System.out.println("ogrNot2="+ogrNot2);

    }
}
