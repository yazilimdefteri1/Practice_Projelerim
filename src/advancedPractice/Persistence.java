package advancedPractice;

public class Persistence {
    /*kalıcılık
    döngüler matematik sayılar
    Bir tamsayının toplam kalıcılığı, , tek basamaklı bir tamsayı olana kadar basamaklarının toplamı ile ndeğiştirmek zorunda olduğunuz sayıdır.nn
    Bir tamsayının çarpımsal kalıcılığı, , tek basamaklı bir tamsayı olana kadar basamaklarının çarpımı ile ndeğiştirmek zorunda olduğunuz sayıdır.nn
    Bir tamsayıyı bağımsız değişken olarak alan iki işlev oluşturun ve:
            1.	Katkı kalıcılığını döndürün.
2.	Çarpımsal kalıcılığını döndürün.
            Örnekler: Katkı Kalıcılığı
    additivePersistence(1679583) ➞ 3
// 1 + 6 + 7 + 9 + 5 + 8 + 3 = 39
// 3 + 9 = 12
// 1 + 2 = 3
// It takes 3 iterations to reach a single-digit number.

    additivePersistence(123456) ➞ 2
// 1 + 2 + 3 + 4 + 5 + 6 = 21
// 2 + 1 = 3

    additivePersistence(6) ➞ 0
// Because 6 is already a single-digit integer.
    Örnekler: Çarpımsal Kalıcılık
    multiplicativePersistence(77) ➞ 4
// 7 x 7 = 49
// 4 x 9 = 36
// 3 x 6 = 18
// 1 x 8 = 8
// It takes 4 iterations to reach a single-digit number.

    multiplicativePersistence(123456) ➞ 2
// 1 x 2 x 3 x 4 x 5 x 6 = 720
// 7 x 2 x 0 = 0

    multiplicativePersistence(4) ➞ 0
// Because 4 is already a single-digit integer.
    notlar
    Giriş nasla negatif değildir.*/

    public static void main(String[] args) {

        int sayi1=7583;
        int sayi2=1234;
        int additivePersistence = 0;
        int multiplicativePersistence= 1;

        additivePersistence(sayi1,additivePersistence);
        multiplicativePersistence(sayi2,multiplicativePersistence);

    }

    private static void multiplicativePersistence(int sayi2, int multiplicativePersistence) {
        do{
            multiplicativePersistence*=(sayi2%10);
            sayi2=sayi2/10;

            if( sayi2<10){
                sayi2=multiplicativePersistence*sayi2;
                multiplicativePersistence=1;
            }
        }while(sayi2>10);

        System.out.println(" Sayinin tek haneli rakamlari carpimii : "+sayi2);
    }

    private static void additivePersistence(int sayi1,int additivePersistence) {
        do{
            additivePersistence+=(sayi1%10);
            sayi1=sayi1/10;

            if( sayi1<10){
                sayi1=additivePersistence+sayi1;
                additivePersistence=0;
            }
        }while(sayi1>10);

        System.out.println(" Sayinin tek haneli rakamlari toplami : "+sayi1);
    }
}
