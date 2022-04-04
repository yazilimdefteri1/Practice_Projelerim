package UcusYeni;

import static UcusYeni.RunnerSon.*;
import static UcusYeni.YasKontrol.yasIndirimY;
import static UcusYeni.RunnerSon.biletFiyati;
import static UcusYeni.RunnerSon.tekCiftYonIndirim;
import static UcusYeni.YasKontrol.yasIndirimY;

public class BiletHesapla {
    public static double BiletHesapla() {
        for (int i = 0; i <yasIndirimY.length ; i++) {
            biletFiyati+=(biletFiyati*tekCiftYonIndirim*yasIndirimY[i])-biletFiyati;
         }

        return biletFiyati;

    }
}
