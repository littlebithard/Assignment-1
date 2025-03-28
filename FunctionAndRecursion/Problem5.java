package FunctionAndRecursion;

import java.util.Scanner;

public class Problem5 {
    public static int FibonacciSeq(int n) {
        if (n == 0) {
            return 0;
        }
        
        else if (n == 1) {
            return 1;
        }

        int fib = FibonacciSeq(n - 1) + FibonacciSeq(n - 2);

        return fib;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println(FibonacciSeq(n));

        scanner.close();
    }
}
