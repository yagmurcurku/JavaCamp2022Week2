public class Main {
    public static void main(String[] args)
    {
        sayiBulmaca();  //sayiBulmaca methodunu main içerisinde çağırdık
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
    }
    public static void sayiBulmaca()
    {
        int[] sayilar = new int[] {1,2,5,7,9,0};
        int aranacakSayi = 8;
        boolean varMi = false;

        for (int sayi : sayilar)
        {
            if (sayi == aranacakSayi)
            {
                varMi=true;
                break;
            }
            else
            {
                varMi=false;
            }
        }
        String mesaj = "";
        if (varMi)
        {
            mesaj = (aranacakSayi + " sayısı listede mevcuttur");
            mesajVer(mesaj);
        }
        else
        {
            mesajVer(aranacakSayi + " sayısı listede mevcut değildir!");
        }
    }
    public static void mesajVer (String mesaj)
    {
        System.out.println(mesaj);
    }
}

//class isimleri PascalCase yazılır.
//method isimleri camelCase yazılır.