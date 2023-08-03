package Gun04;

public class _01JavaString {
    public static void main(String[] args) {


        int sayac = 0; // int tipi' sayac adi, 0 baslangic degeri

        String ad = "ismet"; // kelime veya kelimeler saklayacaksan String

        System.out.println("sayac=" + sayac); //0 yazar
        System.out.println("ad=" + ad); //ismet

        String soyad = "Temur";
        System.out.println("soyad=" + soyad);

        String tamAd = ad + "" + soyad; // +isareti sayilarda toplar,kelimelerde yanyana birlesirler

        System.out.println("isim=" + tamAd); // ismet Temur

    }
}



