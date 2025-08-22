
package Lec5_Loop;

import java.util.Scanner;
public class ex12_PrimeNumberCheck {
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap 1 so nguyen bat ki: ");
    int n = Integer.parseInt(scanner.nextLine());
    int m = 0;
    for (int i =2;i<=Math.sqrt(n);i++)
    {
       if(n%i==0)
       {
           m++;
       }
    }
     if(m==0)
        {
            System.out.println(n+" is a prime number ");
        }
        else
        {
            System.out.println(n+" is not a prime number ");
        }
    }
}
