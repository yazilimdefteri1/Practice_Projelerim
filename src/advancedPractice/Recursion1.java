package advancedPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Recursion1 {
       /* Belirli bir dize (bölünmüş ve bir boyuta göre gruplanmış) ardışık artan sayılar kümesi içerecekse true  ,
    aksi takdirde return false döndürecek bir işlev yazın .

    Örnekler
    ascending("123124125") ➞ true
// Contains a set of consecutive ascending numbers
// if grouped into 3's : 123, 124, 125

    ascending("101112131415") ➞ true
// Contains a set of consecutive ascending numbers
// if grouped into 2's : 10, 11, 12, 13, 14, 15

    ascending("32332432536") ➞ false
// Regardless of the grouping size, the numbers can't be consecutive.

    ascending("326325324323") ➞ false
// Though the numbers (if grouped into 3's) are consecutive but descending.

    ascending("666667") ➞ true
// Consecutive numbers: 666 and 667.*/

    public static void main(String[] args) {

        String sayi = "10111213141516171819";
        int arr2[] = new int[sayi.length() / 2];
        int arr3[] = new int[sayi.length() / 3];
        int j = 0;
        int sayac = 1;

        if (sayi.length() % 2 == 0) {
            for (int i = 0; i < sayi.length(); i += 2) {
                if (sayi.length() - 1 != i) {
                    arr2[j] = Integer.parseInt(sayi.substring(i, i + 2));
                    j++;
                } else {
                    break;
                }
            }
        }

        j = 0;
        if (sayi.length() % 3 == 0) {
            for (int k = 0; k < sayi.length(); k += 3) {
                if (sayi.length() - 2 != k) {
                    arr3[j] = Integer.parseInt(sayi.substring(k, k + 3));
                    j++;
                } else {
                    break;
                }
            }
        }

        if (sayi.length() % 2 == 0) {
            for (int i = 0; i < arr2.length - 1; i++) {
                if (arr2[i + 1] == arr2[i] + 1) {
                    sayac++;
                }
            }
        } else if (sayi.length() % 3 == 0) {
            for (int i = 0; i < arr3.length - 1; i++) {
                if (arr3[i + 1] == arr3[i] + 1) {
                    sayac++;
                }
            }
        }
        boolean kontrol = false;
        if (sayac == sayi.length() / 2) {
            kontrol = true;
            System.out.println("'" + sayi + "'" + " Sayisi Ardışık artan sayılar 2'li kümeler " + Arrays.toString(arr2) +
                    " içeriyor " + "Return = " + kontrol);
        } else if (sayac == sayi.length() / 3) {
            kontrol = true;
            System.out.println("'" + sayi + "'" + " Sayisi Ardışık artan sayılar 3'lü kümeler " + Arrays.toString(arr2) +
                    " içeriyor " + "Return = " + kontrol);
        } else {
            System.out.println("'" + sayi + "'" + " Sayisi Ardışık artan sayılar kümesi içermiyor " + "Return = " + kontrol);
        }
    }

}

