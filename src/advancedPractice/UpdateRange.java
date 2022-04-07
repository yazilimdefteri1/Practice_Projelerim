package advancedPractice;

import java.util.Arrays;
import java.util.Scanner;

public class UpdateRange {


    /*

    Update a method uRange

    parameters are int array and two ints

    if the int array has a number between the two int change it to -1

    for Example
    int array = 1,6,12,15,22,18,30,16

    int 1 = 10

    int 2 = 20

    result should be 1,6,-1,-1,22,-1,30,-1

     */


   /*
        UpdateRange
   URange isminde bir metod yazınız,
   Bu metod parametre olarak int Array ve 2 adet int almalı.
   Metod kendisine gönderilen Array ın içindeki elemanlardan, yine kendisine gönderilen
   rakamlar arasında olanlarına -1 değerini atasın.oluşan yeni diziyi göndersin.main de yazdırınız.

   Örnek:

    int array = 1,6,12,15,22,18,30,16

    int 1 = 10

    int 2 = 20

    sonuc  1,6,-1,-1,22,-1,30,-1  olmalı.
         */

    public static void main(String[] args) {

        int arr[]={1,6,12,15,22,18,30,16};

        System.out.println(Arrays.toString(URange(arr)));



    }

    private static int[] URange(int[] arr) {
        int sayi1;
        int sayi2;
        int bkKontrol;


        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 1. sayiyi giriniz..: ");
        sayi1 = scan.nextInt();
        System.out.print("Lutfen 2. sayiyi giriniz..: ");
        sayi2 = scan.nextInt();

        if (sayi1>sayi2){  //  ilk olarak ilk girilen sayinin ikinci girilen sayidan büyük olup olmadiği kontrol ediliyor
            bkKontrol=sayi1;  //  Eger ilk sayi büyükse Arasinda kontrolümüz çalışmasi icin
            sayi1=sayi2;       // sayi1 ile sayi2 yer degistiriliyor
            sayi2=bkKontrol;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>sayi1 && arr[i]<sayi2){
                arr[i]=-1;
            }
        }
        return arr;
    }


}
