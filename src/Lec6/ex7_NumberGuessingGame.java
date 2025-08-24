
package Lec6;
import java.util.Scanner;
import java.util.Random;
public class ex7_NumberGuessingGame {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int k =0;
        k = rand.nextInt(100)+1;
        System.out.print("Your guess: ");
        int n = Integer.parseInt(scanner.nextLine());
        if(n!=k)
        {
        do
        {
           if(n>k)
           {
               System.out.println("Your number is higher than the secret number");
           }
           else
           {
            System.out.println("Your number is lower than the secret number");
           }
            System.out.print("Your guess: ");
            n = Integer.parseInt(scanner.nextLine());
        }while(n!=k);
        }
            System.out.println("Congratulations! You guessed correctly");
    }
}
