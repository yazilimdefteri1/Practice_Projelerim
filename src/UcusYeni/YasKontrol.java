package UcusYeni;

import static Projects.UcusYeni.RunnerSon.*;

public class YasKontrol {
    static int yolcuS;
    static int yolcuY[];
    static double yasIndirimY[];

    public static void YasKontrol() {

        System.out.println("yolcu sayisni giriniz :");
        yolcuS = scan.nextInt();
        yolcuY = new int[yolcuS];
        yasIndirimY = new double[yolcuS];
        for (int j = 0; j < yolcuS; j++) {
            System.out.println((j + 1) + ". kisinin yasini giriniz..: ");
            yolcuY[j] = scan.nextInt();

            if (yolcuY[j] < 0) {
                System.out.println("Lutfen yasinizi yeniden giriniz : ");
            } else if (yolcuY[j] < 12) {
                yasIndirimY[j] = 0.5;
            } else if (yolcuY[j] >= 12 && yolcuY[j] < 24) {
                yasIndirimY[j] = 0.9;
            } else if (yolcuY[j] >= 24 && yolcuY[j] < 65) {
                yasIndirimY[j] = 1.0;
            } else if (yolcuY[j] >= 65) {
                yasIndirimY[j] = 0.7;
            }
        }

    }
}
