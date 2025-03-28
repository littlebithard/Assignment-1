package FunctionAndRecursion;

import java.util.Scanner;

public class Problem8 {
    public static String CheckForINT(String s) {

        for (char c : s.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            return "No";
            }
        }
        
        return "Yes";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        System.out.println(CheckForINT(s));

        scanner.close();
    }
}
