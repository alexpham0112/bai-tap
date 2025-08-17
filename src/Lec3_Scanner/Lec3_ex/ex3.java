
package Lec3_Scanner.Lec3_ex;
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter a number int 1: ");
        int n1 = scanner.nextInt();
        System.out.println ("EnterScanner a number int 2: ");
        int n2 = scanner.nextInt();
        System.out.println ("sum is " + (n1+n2));
    }
}
