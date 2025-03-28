package FunctionAndRecursion;

import java.util.Scanner;

public class Problem3 {
    public static String CheckForPrime(int n) {
        if (n <= 1) {
            return "Composite";
        }

        int divisorCount = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisorCount++;
            }

            if (divisorCount > 2) {
                return "Composite";
            }
        }

        return "Prime";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println(CheckForPrime(n));

        scanner.close();
    }
}
