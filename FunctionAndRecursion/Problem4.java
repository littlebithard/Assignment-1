package FunctionAndRecursion;

import java.util.Scanner;

public class Problem4 {
    public static int Factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * Factorial(n - 1);
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println(Factorial(n));

        scanner.close();
    }
}
