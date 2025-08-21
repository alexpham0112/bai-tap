
package Lec4_ConditionalExpression.Lec4_ex;
import java.util.Scanner;
public class ex9 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = Integer.parseInt(scanner.nextLine());
        int gttd = (x>=0) ? x : -x;
        System.out.println("the absolute value is "+gttd);
    }
}
