
package Lec3_Scanner.Lec3_ex;
import java.util.Scanner;
public class ex9 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an interger: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter a sentence: ");
        String full = scanner.nextLine();
        System.out.println("Number: "+age+" , sentence: "+full);
    }
}
