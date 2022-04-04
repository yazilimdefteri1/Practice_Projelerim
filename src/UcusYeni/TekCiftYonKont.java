package UcusYeni;

import static Projects.UcusYeni.RunnerSon.*;


public class TekCiftYonKont {

    public static double TekCiftYonKont() {
        boolean kk;
        do {
            kk = false;

            if (tekCift.contains("T")) {
                tekCiftYonIndirim = 1.0;
                kk = true;
            } else if (tekCift.contains("C")) {
                tekCiftYonIndirim = 0.80;
                kk = true;
            } else {
                kk = false;
                System.out.println("Yanlis Girdiniz." + "\n Lutfen Tek Yon icin 'T' - Cift Yon icin 'C' Giriniz ");
                tekCift = scan.nextLine().toUpperCase();
            }

        } while (kk == false);

        return tekCiftYonIndirim;
    }

}
