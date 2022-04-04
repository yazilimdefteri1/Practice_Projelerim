package UcusYeni;

import static UcusYeni.RunnerSon.*;
import static UcusYeni.TekCiftYonKont.TekCiftYonKont;
import static UcusYeni.UlKont.*;

public class UcusBilgileri {
    static int gGun=0;
    static int gAy=0;
    static int gYil=0;
    static int dGun=0;
    static int dAy=0;
    static int dYil=0;



    public static void UcusBilgileri() {
        System.out.println("**************Lutfen Ucus Bilgilerinizi Girinizr***************");
        System.out.print("NEREDEN.............: ");
        ulke=scan.nextLine().toUpperCase();
        UlKont();
        System.out.print("NEREYE.............: ");
        ulkeV=scan.nextLine().toUpperCase();
        UlKontV();
        System.out.print("Biletiniz Tek Yon mu? - Cift Yon Mu?..........( T / C ): ");
        tekCift = scan.nextLine().toUpperCase();
        TekCiftYonKont();
        UlKontBilet();
         if (tekCift.contains("T")) {
             System.out.print("Gidis Tarihi.............: ");
             gGun=scan.nextInt(); System.out.print("/"); gAy=scan.nextInt(); System.out.print("/"); gYil=scan.nextInt();
         } else if(tekCift.contains("C")) {
             System.out.print("Gidis Tarihi.............: ");
             gGun=scan.nextInt(); System.out.print("/"); gAy=scan.nextInt(); System.out.print("/"); gYil=scan.nextInt();
             System.out.print("Donus Tarihi.............: ");
             dGun=scan.nextInt(); System.out.print("/"); dAy=scan.nextInt(); System.out.print("/"); dYil=scan.nextInt();
        }
        TekCiftYonKont();


    }
}
