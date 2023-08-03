package Tekrargun08;

public class StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll: replace gibi calsir. farki Kriter (regex) verilebiliyor
        //regex : regular expression / duzenli ifade

        String text="Merhaba1 Dunya234";

        System.out.println("text="+text);
        System.out.println("abn -> _"+text.replaceAll("[abn]","_"));

        System.out.println("A-Z->+"+text.replaceAll("[A-Z]","_"));

        System.out.println("0-9 arasini sil="+text.replaceAll("[0-9]",""));
        System.out.println("0-9 disindakileri sil="+text.replaceAll("[^0-9]",""));
    }
}
