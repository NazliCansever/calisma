package Gun04;

public class _06_Ornek2 {
    public static void main(String[] args) {
        String bagis1="500"; // kelime
        String bagis2="1500"; // kelime

        // bana toplam bagis miktari lazim
        // int toplam=bagis1+bagis2; bu olmadi
        // bunlarin int e yani rakama donusturulmesi lazim.


        int rakamBagis1= Integer.parseInt(bagis1);
        int rakamBagis2= Integer.parseInt(bagis2);
        int toplam=rakamBagis1+rakamBagis2;

        System.out.println("toplam="+toplam);
    }
}
