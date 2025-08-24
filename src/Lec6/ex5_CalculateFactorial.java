
package Lec6;
import java.util.Scanner;
public class ex5_CalculateFactorial {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = Integer.parseInt(scanner.nextLine());
        int s=1;
        for(int i = 1;i<=n;i++)
        {
            s*=i;
        }
        System.out.println("The factorial of "+n+" is: "+s);
    }
}
