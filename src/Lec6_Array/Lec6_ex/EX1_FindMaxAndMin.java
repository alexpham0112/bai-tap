package Lec6_Array.Lec6_ex;

import java.util.*;

public class EX1_FindMaxAndMin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of int: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] number = new int[n];
        System.out.print("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
        }
        int M = number[0];
        int m = number[0];
        for (int i = 0; i < n; i++) {
            if (number[i] > M) {
                M = number[i];
            }
            if (number[i] < m) {
                m = number[i];
            }
        }
        System.out.println("The maximum value is: " + M);
        System.out.println("The minimum value is: " + m);
    }
}
