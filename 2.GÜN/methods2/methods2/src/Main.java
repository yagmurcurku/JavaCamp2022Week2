import java.awt.*;

public class Main {
    public static void main(String[] args) {    //args=arguments
        String mesaj ="Bugün hava çok güzel.";
        String yenimesaj = sehirVer();
        System.out.println(yenimesaj);
        int sayi = topla(5,7);
        System.out.println(sayi);
        int toplam = topla2(2,3,4,5,6,10);
        System.out.println(toplam);
    }
    //operasyon=method=fonksiyon

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Guncellendi");
    }

    public static int topla(int sayi1, int sayi2) {  //bu fonk. int türünde bir değer döndürür
        return sayi1+sayi2;
    }
    public static int topla2 (int... sayilar) //... = variable arguments
    {
        int toplam = 0;
        for (int sayi : sayilar)
        {
            toplam+=sayi;     //=> topla = topla + sayi
        }
        return toplam;
    }
    public static String sehirVer(){
        return "Ankara";
    }
    //void operasyon=emir kipi=yapılması istenen şeyi yapıyor
}