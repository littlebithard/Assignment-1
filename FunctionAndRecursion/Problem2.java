package FunctionAndRecursion;

import java.util.Scanner;

public class Problem2 {
    public static double Average(int[] arr, int n) {
        double avg = 0;
        
        for (int i = 0; i < n; i++) {
            avg += arr[i];
        }

        double result = avg / n;

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(Average(arr, n));

        scanner.close();
    }
}
