
package Lec6;
import java.util.Scanner;
public class ex1_calculaterSum {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = Integer.parseInt(scanner.nextLine());
        int s =0;
        for (int i = 1 ;i<=n;i++)
        {
            s += i;
        }
        System.out.println("The sum of numbers from 1 to "+n+" is : "+s);
    }
}
