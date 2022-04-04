package UcusYeni;

import java.util.Scanner;

import static Projects.UcusYeni.BiletHesapla.BiletHesapla;
import static Projects.UcusYeni.BiletYazdir.BiletYazdir;
import static Projects.UcusYeni.Karsilama.Karsilama;
import static Projects.UcusYeni.Kimlik.Kimlik;
import static Projects.UcusYeni.UcusBilgileri.UcusBilgileri;
import static Projects.UcusYeni.YasKontrol.YasKontrol;

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




