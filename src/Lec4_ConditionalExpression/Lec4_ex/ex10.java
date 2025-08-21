
package Lec4_ConditionalExpression.Lec4_ex;

import java.util.Scanner;
public class ex10 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter legths of three sides: ");
        int x1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        if(x1+x2>x3&&x1 + x3 > x2&& x2+x3>x1)
        {
        if(x1 == x2 && x1==x3)
        {
            System.out.println("This is an equilateral triangle");
        }
        else if(x1 == x2 || x1==x3||x2==x3)
        {
            System.out.println("This is an isosceles triangle");
        }
        else
        {
            System.out.println("This is an scalane triangle");
        }
        }
        else 
        {
            System.out.println("these sides cannot form a triangle");
        }
    }
}
