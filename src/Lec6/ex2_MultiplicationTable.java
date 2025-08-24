
package Lec6;
import java.util.Scanner;
public class ex2_MultiplicationTable {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number from 2-9: ");
        int n = Integer.parseInt(scanner.nextLine());
        int s=0;
        for (int i=1;i<=10;i++)
        {
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
