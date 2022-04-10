package haftaninSorusu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GirisPaneli {
    public static void panel(){
        Kayit yeniKayit=new Kayit();
        Scanner scan= new Scanner(System.in);

        List<Kullanici> kisi=new ArrayList<>();


        boolean cikilsinMi=false;

        while(!cikilsinMi) {
            System.out.println("Lutfen \n1: Kayit al\n2: Sansli kisi bul\n3: Kisileri listele\n4: Cikis");
            System.out.print("isleminizi seciniz : ");
            int islem=scan.nextInt();
            switch(islem){
                case 1:
                    kisi=yeniKayit.kayitAl();
                    break;
                case 2:
                    yeniKayit.sansliKullanici(kisi);
                    break;
                case 3:
                    yeniKayit.listele(kisi);
                    break;
                case 4:
                    cikilsinMi=true;
                    break;

                default:
                    System.out.println("Hatali veri girdiniz");

            }

        }

    }
}
