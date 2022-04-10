package kodKutuphanem;

public class RakamlarToplami_Degisik {
    //function that finds the sum of digits of a number
    static int findSum(int number)
    {
//returns sum
//if number is not equal to 0 then execute code after colon (:), else print 0
//the method findSum() is recursively called
        return number == 0 ? 0 : number % 10 +findSum(number/10) ;
    }
    //driver code
    public static void main(String args[])
    {
        int number = 1234567;
//calling the user-defined method and prints the result
        System.out.println("The sum of digits: "+findSum(number));
    }
}
