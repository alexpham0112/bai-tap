
package Lec4_ConditionalExpression.Lec4_ex;
import java.util.Scanner;
public class ex8 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter y: ");
        double y = Double.parseDouble(scanner.nextLine());
        if(x>0&&y>0)
        {
            System.out.println("Quadrant 1");
        }
        else if(x<0&&y>0)
        {
            System.out.println("Quadrant 2");
        }
        else if(x<0&&y<0)
        {
            System.out.println("Quadrant 3");
        }
        else if(x>0&&y<0)
        {
            System.out.println("Quadrant 4");
        }
        else
        {
            System.out.println("the point is on an axis");
        }
    }
}
