package Gun04;

public class _02_TipDonusumleri {
    public static void main(String[] args) {
        byte ogrNot1=98;
        byte ogrNot2=97;
        byte ogrNot3=99;
        byte ogrNot4=100;


        // int

        int toplamNot= ogrNot1+ogrNot2+ogrNot3+ogrNot4;
        System.out.println("toplamNot="+ toplamNot);

        ogrNot2 = (byte) toplamNot; // 394 u byte alana atiyorum
        System.out.println("ogrNot2="+ ogrNot2);
        // int-> byte atinca dur bakalim dedi  (DARALMA)
        // buyuk hafizaya ayrilmis bir alani, kucuk hafizaya ayrilmis alana atma islemi var.
        //veri kaybi ihtimali var
    }
}
