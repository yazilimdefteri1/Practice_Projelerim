package javaBankATM;

public class Musteri {
    private String isim;
    private String soyad;
    private String iban;


    public Musteri(String isim, String soyad, String iban) {
        this.isim = isim;
        this.soyad = soyad;
        this.iban = iban;
    }

    @Override
    public String toString() {
        return "Musteri : " +
                "İsim: " + isim +
                ", Soyad: " + soyad +
                ", IBAN: " + iban;
    }
}
