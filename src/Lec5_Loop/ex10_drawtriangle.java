
package Lec5_Loop;
import java.util.Scanner;
public class ex10_drawtriangle {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu cao cua tam giac can: ");
        int h = Integer.parseInt(scanner.nextLine());
        for (int i =1 ;i <= h;i++)
        {
        for(int j = 1;j <= h-i;j++)
        {
            System.out.print(" ");
        }
        for (int k = 1;k <= 2*i-1;k++)
        {
            System.out.print("*");
        }
        System.out.println();
        }
    }
}
