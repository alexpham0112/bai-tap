
package Lec6;
import java.util.Scanner;
public class ex8_InputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number from 1 to 10: ");
            number = scanner.nextInt();

            if (number < 1 || number > 10) {
                System.out.println("Invalid number, please try again.");
            }

        } while (number < 1 || number > 10);

        System.out.println("You entered the number: " + number);
    }
}
