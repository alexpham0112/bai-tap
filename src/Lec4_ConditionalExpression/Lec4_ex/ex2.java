
package Lec4_ConditionalExpression.Lec4_ex;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter person's age: ");
        int n = Integer.parseInt(scanner.nextLine());
        if(n>0&&n<=12)
        {
            System.out.println("Child");
        }
        else if (n>=13&&n<=19)
        {
            System.out.println("Teenager");
        }
        else if (n>=20&&n<=59)
        {
            System.out.println("Adult");
        }
        else
        {
            System.out.println("Senior");
        }
    }
}
