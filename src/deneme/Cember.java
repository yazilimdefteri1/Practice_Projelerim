package deneme;

public class Cember extends Sekil {
    double yaricap=1;
    double cevre =1;
    double alan =1;
    double pi =3.14;

    void cemberAlan(double yaricap){
        this.yaricap=yaricap;
        alan = pi*yaricap*yaricap;
        System.out.println("cemberAlan  " +yaricap);
    }
    void cemberCevre(double yaricap){
        this.yaricap=yaricap;
        cevre = 2*pi*yaricap;
        System.out.println("cembercevre  " +cevre);
    }

}
