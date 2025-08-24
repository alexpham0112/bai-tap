
package Lec6;
import java.util.Scanner;
public class ex6_SumofDigits {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = Integer.parseInt(scanner.nextLine());
        int m=0;
        while(n>0)
        {
            m += n%10;
            n /=10;
        }
        System.out.println("The sum of the digits is: "+m);
    }
}
