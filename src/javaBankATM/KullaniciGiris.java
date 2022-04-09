package javaBankATM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class KullaniciGiris {
   public static String kartNoGir;
    public static String sifreGir;
    public static List<String> kartNo = new ArrayList<String>(Arrays.asList("1234567890123456", "1234567890123457", "1234567890123458"));
    public static List<String> sifre = new ArrayList<String>(Arrays.asList("1111", "2222", "3333"));
    public static List<String> kayitliAlicilar = new ArrayList<>(Arrays.asList("ALICAN"));
    public static boolean kontKart = false;
    public static boolean kontSif = false;
    public static boolean kartSifUygunluk = false;

    public static void Kullanici() {

        Scanner scan = new Scanner(System.in);
        //String kartNoGir;
        //String sifreGir;




            do {
                System.out.print("Lutfen kullanici adinizi giriniz : ");
                kartNoGir = scan.nextLine();
                kartNoGir = kartNoGir.replaceAll("\\s","");

                if (kartNo.contains(kartNoGir)) {
                    kontKart = true;
                }
            }
            while (kontKart == false);


            do { //  sifrede kullanici adi ile sifre uyuşma kontrolü yaptık.
                System.out.print("Lutfen sifrenizi giriniz : ");
                sifreGir = scan.nextLine();
                sifreGir = sifreGir.trim();

                if (sifre.contains(sifreGir)) {
                    if (kartNo.indexOf(kartNoGir) == sifre.indexOf(sifreGir)) {
                        kontSif = true;
                    }
                }
            } while (kontSif == false);
        }


}



