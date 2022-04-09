package javaBankATM;

import static javaBankATM.AnaEkran.Ekran;
import static javaBankATM.KullaniciGiris.Kullanici;



class JavaBankAtm {
   /*      ATM
        ---  Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        ----Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

        Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.

        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,       */

    public static <MusteriBilgileri> void main(String[] args) {
        System.out.println("***TOSUN BANKA HOSGELDİNİZ***");
        System.out.println("***Dolandırılmak icin bizi sectiginiz icin tesekkür ederiz***");
        Kullanici();
        Ekran();
        Musteri tosun= new Musteri( "Ahmet", "Tosun", "TR123412341234123412341234");
        System.out.println(tosun);

    }



}


