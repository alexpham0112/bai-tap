
package Lec4_ConditionalExpression.Lec4_ex;

import java.util.Scanner;
public class ex6 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an average score: ");
        double n = Double.parseDouble(scanner.nextLine());
        if(n>=9.0&&n<=10)
        {
            System.out.println("excellent");
        }
        else if (n>=8.0&&n<=8.9)
        {
            System.out.println("good");
        }
        else if (n>=6.5&&n<=7.9)
        {
            System.out.println("fair");
        }
        else if(n>=5.0&&n<=6.4)
        {
            System.out.println("average");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
