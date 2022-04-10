package kodKutuphanem;

public class Recursion_Ozyineleme {

    //verilen sayiiyi 1'e kadar yazdirip tekrar verilen sayiya kadar yazdirma (simetrisi)
    static void printFun(int test)
    {
        if (test < 1)
            return;

        else {
            System.out.printf("%d ", test);

            // Statement 2
            printFun(test - 1);

            System.out.printf("%d ", test);
            return;
        }
    }

    public static void main(String[] args)
    {
        int test = 10;
        printFun(test);
    }
}
