package kodKutuphanem;

public class RakamlarToplami_SumOfDigit {
    // Method to check sum of digit using recursion

    static int SumOfDigit(int n) {

        // If the n value is zero then we (n degeri sifir ise)
        // return sum as 0. (0 döndür)
        if (n == 0)
            return 0;

        // Last digit + recursivly calling n/10 son rakam + yinelemeli arama
        return (n % 10 + SumOfDigit(n / 10));
    }

    // Driver code
    public static void Main() {
        int n = 18595;
        int ans = SumOfDigit(n);
        System.out.println("Sum = " + ans);
    }

    public static void main(String[] args) {
        Main();

    }

}
