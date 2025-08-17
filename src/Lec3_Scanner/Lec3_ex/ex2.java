
package Lec3_Scanner.Lec3_ex;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter ages: ");
        int age = scanner.nextInt();
        System.out.print("Hello ");
        System.out.print(name);
        
        System.out.print(", you are ");
        System.out.print(age + " years old.");
    }
}
