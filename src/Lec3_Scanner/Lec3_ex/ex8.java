package Lec3_Scanner.Lec3_ex;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        while(scanner.hasNext())
        {
            String word = scanner.next();
            System.out.println("word: "+word);
        }
    }
    
}
