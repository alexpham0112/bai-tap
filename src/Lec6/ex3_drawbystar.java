
package Lec6;
import java.util.Scanner;
public class ex3_drawbystar {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height: ");
        int h = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter width: ");
        int w = Integer.parseInt(scanner.nextLine());
        for(int i= 1;i<=h;i++)
        {
            System.out.println("");
            for(int j=1;j<=w;j++)
            {
                System.out.print("*");
            }
        }
    }
}
