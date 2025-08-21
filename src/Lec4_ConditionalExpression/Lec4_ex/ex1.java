
package Lec4_ConditionalExpression.Lec4_ex;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an interger number: ");
        int n = Integer.parseInt(scanner.nextLine());
        if(n%2==0)
        {
            System.out.println(n+" is a even number");
        }
        else
        {
            System.out.println(n+" is an odd number");
        }
    }
}
