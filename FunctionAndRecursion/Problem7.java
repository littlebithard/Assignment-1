package FunctionAndRecursion;

import java.util.Scanner;

public class Problem7 {
    public static String ReverseOrderArr(int[] arr, int n) {
        if (n == 0) {
            return "";
        }
        
        return arr[n - 1] + " " + ReverseOrderArr(arr, n - 1);
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

        System.out.println(ReverseOrderArr(arr, n));

        scanner.close();
    }
}
