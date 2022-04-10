package deneme;

import java.util.Scanner;

public class Giris {



    static double yaricap=0;
    static double uzunluk=0;
    static double genislik=0;

     public static void giris11() {

        Scanner scan = new Scanner(System.in);
        System.out.println("İhtiyaca göre yaricap, uzunluk ve genişlik giriniz.\nKullanmayacaklarınıza 0 giriniz");

        try {
            System.out.print("yaricap = ");
            yaricap = scan.nextDouble();
            System.out.print("uzunluk = ");
            uzunluk = scan.nextDouble();
            System.out.print("genislik = ");
            genislik = scan.nextDouble();
        } catch (Exception e) {
            System.out.println("hatali giris yaptiniz");
            giris11();
        }


        secim22();

    }

    private static void secim22() {


        if( yaricap>0) {
            Cember obj1 = new Cember();
            obj1.cemberAlan(yaricap);
            obj1.cemberCevre(yaricap);
        }if (uzunluk==genislik){
            Kare obj1 = new Kare();
            obj1.kareAlan(uzunluk);
            obj1.kareCevre(uzunluk);
        }else if ( uzunluk>0 && genislik>0) {
            Dikdortgen obj2 = new Dikdortgen();
            obj2.dikdortgenAlan(uzunluk, genislik);
            obj2.dikdortgenCevre(uzunluk, genislik);
        }else if (uzunluk>0){
            Kare obj1 = new Kare();
            obj1.kareAlan(uzunluk);
            obj1.kareCevre(uzunluk);

        }else if (genislik>0) {
            Kare obj3 = new Kare();
            obj3.kareAlan(genislik);
            obj3.kareCevre(genislik);

        }else System.out.println("lütfen doğru değerleri giriniz");
    }
}
