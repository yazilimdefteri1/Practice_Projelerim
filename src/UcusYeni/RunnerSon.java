package UcusYeni;

import java.util.Scanner;

import static UcusYeni.BiletHesapla.BiletHesapla;
import static UcusYeni.BiletYazdir.BiletYazdir;
import static UcusYeni.Karsilama.Karsilama;
import static UcusYeni.Kimlik.Kimlik;
import static UcusYeni.UcusBilgileri.UcusBilgileri;
import static UcusYeni.YasKontrol.YasKontrol;

public class RunnerSon {
    static Scanner scan = new Scanner(System.in);
    static String ulke = "";
    static String ulkeV = "";
    static String tekCift = "";
    static int uKont;
    static double biletFiyati;
    static double tekCiftYonIndirim;



    public static void main(String[] args) {

        Karsilama();
        UcusBilgileri();
        Kimlik();
        YasKontrol();
        BiletHesapla();
        BiletYazdir();



    }


}




