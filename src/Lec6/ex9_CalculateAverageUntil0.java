
package Lec6;
import java.util.Scanner;
public class ex9_CalculateAverageUntil0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int m = 0;
        int i = 0;

        System.out.print("Enter a number (enter 0 to stop): ");
        n = scanner.nextInt();

        while (n != 0) {
            m += n;
            i++;

            System.out.print("Enter a number (enter 0 to stop): ");
            n = scanner.nextInt();
        }

        if (i > 0) {
            double average = (double) m / i;
            System.out.println("The average is: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}
