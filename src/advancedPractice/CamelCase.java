package advancedPractice;

import java.util.Scanner;

public class CamelCase {
     /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case
       input:
          I lIVe in uSa
      Result should be
           I Live In Usa
     */
    /*     Soru 1:
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
            büyük harfe çevirip geri döndüren metodun yazınız.
             input:
           I lIVe in uSa
      Result should be
           I Live In Usa
     */

    /*CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
    büyük harfe çevirip geri döndüren metodun yazınız.

            Örnek:  bugün hava çok güzel    Result : Bugün Hava Çok Güzel*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bir metin giriniz : ");
        String str = scan.nextLine();

        CamelCase(str);

    }

    private static void CamelCase(String str) {
        String arr[] = str.split(" ");

        String a;
        String yeniStr = "";

        for (int i = 0; i < arr.length; i++) {
            a = arr[i];
            yeniStr += a.toUpperCase().charAt(0) + a.substring(1) + " ";
        }
        System.out.println(yeniStr);

    }
}
