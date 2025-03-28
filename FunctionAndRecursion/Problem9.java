package FunctionAndRecursion;

import java.util.Scanner;

public class Problem9 {
    public static int binomialCoef(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }

        return binomialCoef(n - 1, k - 1) + binomialCoef(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        System.out.println(binomialCoef(n, k));

        scanner.close();
    }
}

