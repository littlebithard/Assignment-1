package FunctionAndRecursion;

import java.util.Scanner;

public class Problem6 {
    public static int Power(int n, int a) {
        if (a == 0) {
            return 1;
        }

        else if (a == 1) {
            return n;
        }

        else {
            int pow = n * Power(n, a - 1);
            return pow;
        }

    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.println(Power(n, a));

        scanner.close();
    }
}
