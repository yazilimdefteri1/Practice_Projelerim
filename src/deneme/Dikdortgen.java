package deneme;

public class Dikdortgen extends Sekil{

    double dikdortgenUzunKenar=1;
    double dikdortgenKisaKenar=1;

    double cevre =1;
    double alan =1;

    void dikdortgenAlan(double dikdortgenUzunKenar,double dikdortgenKisaKenar){
        this.dikdortgenUzunKenar=dikdortgenUzunKenar;
        this.dikdortgenKisaKenar=dikdortgenKisaKenar;
        alan =dikdortgenUzunKenar*dikdortgenKisaKenar;
        System.out.println("DikdortgenAlan  "+ alan);

    }
    void dikdortgenCevre(double dikdortgenUzunKenar,double dikdortgenKisaKenar){
        this.dikdortgenUzunKenar=dikdortgenUzunKenar;
        this.dikdortgenKisaKenar=dikdortgenKisaKenar;
        cevre = dikdortgenUzunKenar*2+dikdortgenKisaKenar*2;
        System.out.println("dikdortgen cevre  "+cevre);
    }
}
