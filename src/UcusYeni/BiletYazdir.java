package UcusYeni;

import static Projects.UcusYeni.Kimlik.ad;
import static Projects.UcusYeni.Kimlik.soyAd;
import static Projects.UcusYeni.RunnerSon.*;
import static Projects.UcusYeni.UcusBilgileri.*;
import static Projects.UcusYeni.YasKontrol.yolcuS;

public class BiletYazdir {
    public static void BiletYazdir() {

        System.out.println("**************Ucus Biletiniz***************");
        System.out.println("*   Adi...................: "+ ad);
        System.out.println("*   Soyadiniz.............: " + soyAd);
        System.out.println("*   Kalkis Ulke...........: " + ulke);
        System.out.println("*   Varis Ulke............: " + ulkeV);
        System.out.println("*   Gidis Tarihi..........: "+gGun+"/"+gAy+"/"+gYil);
        if(tekCift.contains("C")) {
        System.out.println("*   Donus Tarihi..........: "+dGun+"/"+dAy+"/"+dYil);}
        System.out.println("*   Bilet Ucretiniz.......: " + biletFiyati+"$"+ "("+yolcuS + " Kisilik)");
        System.out.println("**********İyi Ucuslar Dileriz**************");
    }
}
