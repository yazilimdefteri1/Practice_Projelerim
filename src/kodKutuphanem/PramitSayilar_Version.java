package kodKutuphanem;

import java.util.Scanner;

public class PramitSayilar_Version {
    public static void printPyramid(int n){
        int num = 0;
        for(int i= 0 ; i < n ; i++) {
            for(int j=0 ; j<= i ; j++)
                System.out.print(++num);
            for(int j=0 ; j< i ; j++)
                System.out.print(--num);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPyramid(4);

        Scanner scan =  new Scanner(System.in);
        System.out.print("Lutfen Piramit sayisini giriniz : ");
        int n = scan.nextInt();
        int i, j, k, m;
        for(i=1; i<=n; i++)
        {
            m = i;
            for(j=1; j<=i; j++)
                System.out.print(m++);
            m = m - 2;
            for(k=1; k<i; k++)
                System.out.print(m--);
            System.out.println();
        }
    }
}
