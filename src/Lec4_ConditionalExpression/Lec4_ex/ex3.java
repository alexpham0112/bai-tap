
package Lec4_ConditionalExpression.Lec4_ex;
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int n = Integer.parseInt(scanner.nextLine());
        if(n%4==0&&n%100!=0||n%400==0)
        {
            System.out.println(n+ " is a leap year");
        }
        else
        {
            System.out.println(n+" is not a leap year");
        }
    }
}
