package UcusYeni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static UcusYeni.RunnerSon.*;

public class UlKont {

    static List<String> ulke1 = new ArrayList<String>(Arrays.asList("ABD", "KANADA", "MEKSİKA", "KUBA", "PANAMA", "ARJANTİN", "BREZİLYA", "PERU", "URUGUAY"));
    static List<String> ulke2 = new ArrayList<String>(Arrays.asList("TURKIYE", "IRAN", "RUSYA", "CIN", "AZERBAYCAN", "HINDISTAN","UKRAYNA", "JAPONYA","GUNEYKORE"));
    static List<String> ulke3 = new ArrayList<String>(Arrays.asList("ALMANYA", "HOLLANDA","BELCIKA","FRANSA","YUNANISTAN","ISVEC", "ISVICRE","ITALYA","INGILTERE"));
    static List<String> ulke4 = new ArrayList<String>(Arrays.asList("SENEGAL","NIJERYA","GANA","KENYA","TANZANYA","UGANDA","FAS","CEZAYIR","KAMERUN","ARABISTAN","TUNUS","MISIR"));

    public static void UlKont() {
        do {
            if (ulke1.contains(ulke)) {
                uKont = 1;
            } else if (ulke2.contains(ulke)) {
                uKont = 2;
            } else if (ulke3.contains(ulke)) {
                uKont = 3;
            } else if (ulke4.contains(ulke)) {
                uKont = 4;
            } else {
                System.out.print("Girmis oldugunuz Ulke ismi yanlis. Lutfen tekrar giriniz  : ");
                uKont = 5;
                ulke = scan.nextLine().toUpperCase();
            }

        } while (uKont > 4);
    }
        public static void UlKontV() {
            do {
                if (ulke1.contains(ulkeV)) {
                    uKont = 1;
                } else if (ulke2.contains(ulkeV)) {
                    uKont = 2;
                } else if (ulke3.contains(ulkeV)) {
                    uKont = 3;
                } else if (ulke4.contains(ulkeV)) {
                    uKont = 4;
                } else {
                    System.out.print("Girmis oldugunuz Ulke ismi yanlis. Lutfen tekrar giriniz  : ");
                    uKont = 5;
                    ulkeV = scan.nextLine().toUpperCase();
                }

            } while (uKont > 4);
        }
    public static double UlKontBilet() {
        if (ulke1.contains(ulke) && ulke1.contains(ulkeV)) {
            biletFiyati = 300;
        } else if (ulke1.contains(ulke) && ulke2.contains(ulkeV)) {
            biletFiyati = 400;
        }else if (ulke1.contains(ulkeV) && ulke2.contains(ulke)) {
            biletFiyati = 400;
        } else if(ulke1.contains(ulke) && ulke3.contains(ulkeV)) {
            biletFiyati = 500;
        } else if(ulke1.contains(ulkeV) && ulke3.contains(ulke)) {
            biletFiyati = 500;
        } else if (ulke1.contains(ulke) && ulke4.contains(ulkeV)) {
            biletFiyati = 600;
        } else if (ulke1.contains(ulkeV) && ulke4.contains(ulke)) {
            biletFiyati = 600;
        } else if (ulke2.contains(ulke) && ulke2.contains(ulkeV)) {
            biletFiyati = 300;
        } else if (ulke2.contains(ulke) && ulke3.contains(ulkeV)) {
            biletFiyati = 400;
        }else if (ulke2.contains(ulkeV) && ulke3.contains(ulke)) {
            biletFiyati = 400;
        } else if(ulke2.contains(ulke) && ulke4.contains(ulkeV)) {
            biletFiyati = 500;
        } else if(ulke2.contains(ulkeV) && ulke4.contains(ulke)) {
            biletFiyati = 500;
        }else if (ulke3.contains(ulke) && ulke3.contains(ulkeV)) {
            biletFiyati = 300;
        } else if (ulke3.contains(ulke) && ulke4.contains(ulkeV)) {
            biletFiyati = 400;
        } else if (ulke3.contains(ulkeV) && ulke4.contains(ulke)) {
            biletFiyati = 400;
        }

        return biletFiyati;
    }
}
