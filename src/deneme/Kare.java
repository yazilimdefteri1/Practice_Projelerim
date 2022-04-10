package deneme;

public class Kare extends Dikdortgen {


    double kareKenar = 1;


    double cevre = 1;
    double alan = 1;

    void kareAlan(double kareKenar) {
        this.kareKenar = kareKenar;
        alan=kareKenar*kareKenar;
        System.out.println("Kare Alan  "+alan);
    }

    void kareCevre(double kareAlan) {
        this.kareKenar = kareKenar;
        cevre = kareAlan*4;
        System.out.println("Kare cevre  "+ cevre);
    }
}
