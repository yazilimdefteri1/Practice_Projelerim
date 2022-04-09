package javaBankATM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static javaBankATM.KullaniciGiris.*;


public class AnaEkran {

    public static Scanner scan = new Scanner(System.in);
    public static int bakiye = 1000;

    public static void Ekran() {

        List<String> kayitliAlicilar = new ArrayList<>(Arrays.asList("AYHAN"));



        System.out.println("*******************************");
        System.out.println("*   ATM'ye Hosgeldiniz :-)    *");
        System.out.println("*  Bakiyeniz = " + bakiye);
        System.out.println("*************İSLEMLER**********\n");
        System.out.println("*  1. Para Çekme");
        System.out.println("*  2. Para Yatırma");
        System.out.println("*  3. Bakiye sorgulama");
        System.out.println("*  4. Para Gönderme");
        System.out.println("*  5. Sifre Degistirme");
        System.out.println("*  0. Cikis");

        System.out.print("\nİsleminizi Seciniz: ");
        int islem = scan.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Bakiyeniz = " + bakiye);
                System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                int tutar = scan.nextInt();
                if (tutar > bakiye) {
                    System.out.print("Yetersiz bakiye. Tekrar giriniz: ");
                    tutar = scan.nextInt();
                }
                bakiye -= tutar;
                System.out.println("Yeni bakiyeniz = " + bakiye);
                Cikis();
                break;
            case 2:
                System.out.println("Bakiyeniz = " + bakiye);
                System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                tutar = scan.nextInt();
                bakiye += tutar;
                System.out.println("Yeni bakiyeniz = " + bakiye);
                Cikis();
                break;

            case 3:
                System.out.println("Bakiyeniz = " + bakiye);
                Cikis();
                break;
            case 4:
                kontSif=false;
                System.out.println("Bakiyeniz = " + bakiye);
                int eftTutar;
                String iban;
                Scanner scan = new Scanner(System.in);
                System.out.print("Göndermek istediğiniz iban numarasini giriniz : ");

                do {
                    iban = scan.nextLine();
                    iban = iban.replaceAll("\\s", "");
                    if (iban.length() == 26) {
                        if (iban.startsWith("TR")) {
                            kontSif = true;
                        }
                    } else {
                        System.out.print("Geçersiz iban Lutfen yeniden giriniz : ");
                    }
                } while (kontSif==false);

                System.out.println("Girmiş olduğunuz iban gecerli");
                String aliciAdi;

                System.out.print("Alıcı adını giriniz..: ");
                do {
                    aliciAdi = scan.next().toUpperCase();
                    if (!kayitliAlicilar.contains(aliciAdi)) {/*ipara gönderielcek kişiin sistemede kayıtlı olup olmadıgını kontrol etmek icin */
                        System.out.print("Gecerli kullanıcı adı bulunamadi. Lutfen gecerli alici adi giriniz..: ");
                    }
                } while (!kayitliAlicilar.contains(aliciAdi));
                System.out.println("Alici adi : " + aliciAdi);
                do {
                    System.out.print("Göndermek istediginiz tutari giriniz..: ");
                    eftTutar = scan.nextInt();
                    if (eftTutar > bakiye) {
                        System.out.println("Bakiyeniz yetersiz");
                    }
                } while (eftTutar > bakiye);
                bakiye -= eftTutar;
                System.out.println("Işleminiz basaiyla gerceklestirildi");
                System.out.println("****Bakiyeniz**** : " + bakiye);
                Cikis();
                break;

            case 5:
                kontSif=false;

                Scanner s=new Scanner(System.in);
                String yeniSifreGir;
                System.out.print("Lutfen eski sifrenizi giriniz : ");
                do{
                    sifreGir = s.nextLine();
                    sifreGir = sifreGir.trim();

                        if (sifre.contains(sifreGir)) {
                          if (kartNo.indexOf(kartNoGir) == sifre.indexOf(sifreGir)) {
                             kontSif = true;
                            }
                        }else {
                    System.out.print("Eski sifrenizi hatali girdiniz. Yeniden Giriniz..: ");
                }
               }while (kontSif == false);
                kontSif=false;
                System.out.print("Lutfen yeni sifrenizi giriniz..: ");

                //do {
                    yeniSifreGir = s.nextLine();
                while(yeniSifreGir.equals(sifreGir)) {
                    System.out.print("Sifreniz eski şifre ile ayni olamaz.Yeni sifre giriniz.: ");
                    yeniSifreGir = s.nextLine();
                }
                while(yeniSifreGir.length()!=4 ) {
                    System.out.print("Sifrenizi hatali girdiniz. Yeniden Giriniz..: ");
                    yeniSifreGir = s.nextLine();
                }

                sifre.set(sifre.indexOf(sifreGir),yeniSifreGir);
                System.out.println("Sifreniz basarili bir sekilde degistirildi");
                Cikis();
            break;

            case 0:
                System.out.println("isleminiz basariyla gerceklestirilmistir.");
                break;
            default:
                System.out.println("Yanlıs islem secitiniz. Tekrar giriniz.");
        }
    }

    private static void Cikis() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Isleme devam etmek istiyorsaniz 1'i Cikis işlemi icin 0'ı tklayınız");
        int secim2 = scan.nextInt();// cıkıs methodunda secim yaptırdık secim 1 ise tekrar yeni bir secim yaptırdık
        if (secim2 == 1) {
            Ekran();

        } else if (secim2 == 0) {// 0 sa cıkısını sağladık
            System.out.println("Isleminiz basariyla gerceklestirilmistir.");
        } else {//0 veya 1 girmediyse tekrar cıkısa yönlendirdik
            System.out.println("Lütfen 1 yada 0 girin");
            Cikis();
        }
    }

}
