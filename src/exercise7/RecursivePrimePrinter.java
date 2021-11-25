package exercise7;

import java.util.Scanner;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printPrimes(n);
    }

    public static void printPrimes(int n) {
        if(n <= 0) {
            return;
        }

        if(isPrime(n)) {
            System.out.println(n);
        }

        printPrimes(n-1);
    }

    public static boolean isPrime(int n) {
        int divider = 2;
        boolean primeNumber = true;
        while(divider <= n/2) {
            if(n%divider == 0) {
                primeNumber = false;
            }
            divider++;
        }
        return primeNumber;
    }
}
