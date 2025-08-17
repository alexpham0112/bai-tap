package Lec3_Scanner.Lec3_ex;
import java.util.Scanner;
public class ex6 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String full = scanner.nextLine();
        System.out.println("Your full name is : "+ full);
    }
}
