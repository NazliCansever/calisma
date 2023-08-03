package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {
        int toplam=6700;
        byte sayi=5;

        sayi=(byte) toplam; // veri kaybi olmasa bile dikkatli yapilmali
        System.out.println("sayi="+ sayi); // veri kaybi var

        double oran = 3.7; // ben tam sayi kismini almak istiyorum
        toplam=(int) oran; // bilerek sadece tam sayi kismini aldim
        sayi=(byte) oran;
        System.out.println("toplam="+toplam);
        // veri kaybi var, fakat bilerek yaptigim icin sorun yok
        }
    }

