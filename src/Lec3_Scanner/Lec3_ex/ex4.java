
package Lec3_Scanner.Lec3_ex;
import java.util.Scanner;
public class ex4 {
 public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter a number 1: ");
        float n1 = scanner.nextFloat();
        System.out.println ("Enter a number 2: ");
        float n2 = scanner.nextFloat();
        System.out.println ("average is " + ((n1+n2)/2));
    }
}
