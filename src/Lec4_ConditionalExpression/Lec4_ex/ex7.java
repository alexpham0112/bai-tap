
package Lec4_ConditionalExpression.Lec4_ex;
import java.util.Scanner;
public class ex7 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integer: ");
        int x1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        if((x1-x2)>0&&(x1-x3)>0)
        {
            System.out.println("The largest number is "+x1);
        }
        else if((x2-x1)>0&&(x2-x3)>0)
        {
            System.out.println("The largest number is "+x2);
        }
        else
        {
            System.out.println("The largest number is "+x3);
        }
    }
}
