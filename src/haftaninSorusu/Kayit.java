package haftaninSorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {

    List<Kullanici> kisiler = new ArrayList<>(); // bos list create edildi. kayıt al(method bu listeyi alacak

    public List<Kullanici> kayitAl(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Adinizi giriniz : ");
        String isim= scan.nextLine();
        Kullanici k1=new Kullanici(isim, LocalDateTime.now()); // kullaniici class'tan parametrli constructor ile obje create edildi
        kisiler.add(k1);

        return kisiler;
    }
    public void sansliKullanici(List<Kullanici> kll){
        for (Kullanici k: kll) {
            if (k.kayitZamani.getSecond() <= 10) {
                System.out.println("sansli kisisiniz" + k.name + " agam 5 kilo bal kazandin");
            } else
                System.out.println(" Maalesef " + k.name + " sansli kisi degilsiniz");
            }


        }
        public void listele(List<Kullanici> kullanicilar){

            for (Kullanici k: kullanicilar ) {

                System.out.println("Adi : "+k.name+" Kayit zamani : "+k.kayitZamani);

            }

            }


        }



