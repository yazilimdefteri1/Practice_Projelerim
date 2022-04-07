package advancedPractice;

import java.util.Scanner;

public class ThreeEvenOdd {
    static Scanner scan= new Scanner(System.in);
    static boolean sonuc=false;
    /*

    Given an int array as a parameter
    return true if the array contains either 3 even or 3 odd values .

    for Example:

    intArray([2, 1, 3, 5]) result should be true
    intArray([2, 1, 2, 5]) result should be  false
    intArray([2, 4, 2, 5]) result should be  true

     */


    /*

   Parametre olarak int dizisi verildiğinde
   array 3 tane çift veya 3 tane  tek değer içeriyorsa true değerini döndürür.


   Örnek:

   intArray([2, 1, 3, 5]) sonuc  true olmalı
   intArray([2, 1, 2, 5]) sonuc   false olmalı
   intArray([2, 4, 2, 5]) sonuc   true olmalı

    */
    public static void main(String[] args) {

        int array [] = {2, 1, 2, 5};

       System.out.println(threeEvenOrOdd(array));
    }

    private static boolean threeEvenOrOdd(int[] array) {
        int tekSayac=0;
        int ciftSayac=0;
        for (int i = 0; i <array.length; i++)  {
            if(array[i]%2 == 0){
                ciftSayac++;
            }else if (array[i]%2!=0){
                tekSayac++;
            }
        }
        if (tekSayac>2 || ciftSayac>2){
            sonuc=true;
        }
        return sonuc;
        }

    }


