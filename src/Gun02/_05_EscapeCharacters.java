package Gun02;

public class _05_EscapeCharacters {
    public static void main(String[] args) {

        //  \n = yeni satir ac, alt satira gecer
        //  \t = tab tusuna bas, 2,3 harflik bosluk olusturur
        //  \b = backspace etkisi olusturur, yani 1 karakter geri siler
        //  \\ = ekrana birtane \ yazar
        //  \r = satir basina git


        System.out.println("MerhabaDunya");    //MerhabaDunya
        System.out.println("Merhaba\nDunya");  //Merhaba yazar, sonra alt satira gecer
        System.out.println("Merhaba\tDunya");  //Merhaba Dunya (tab tusu kadar bosluk)
        System.out.println("Merhaba\bDunya");  //MerhabaDunya
        System.out.println("Merhana\"Dunya");  //Merhaba"Dunya
        System.out.println("Merhaba\\Dunya");  //Merhaba\Dunya
        System.out.println("Merhaba\rDunya");  //Dunya





    }
}
