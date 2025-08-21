
package Lec4_ConditionalExpression.Lec4_ex;

import java.util.Scanner;
public class ex4 {
    public static void main(String[] args)
   {
       Scanner scanner = new Scanner(System.in);
       System.out.print("First number: ");
       int n = Integer.parseInt(scanner.nextLine());
       System.out.print("Second number: ");
       int x = Integer.parseInt(scanner.nextLine());
       System.out.print("Operator: ");
       String op = scanner.next();
       switch(op)
               {
                   case "+" : System.out.println(n+" + "+x+" = "+(n+x)) ;break;
                   case "-" : System.out.println(n+" - "+x+" = "+(n-x)) ;break;
                   case "*" : System.out.println(n + " * "+ x+ " = "+(n*x));break;
                   case "/" : if(x!=0) 
                   {
                       System.out.println(n + " / "+ x+ " = "+(n/x));
                   }
                   else
                   {
                       System.out.println("cannot be devided by 0");
                   }
                   break;
                   default:  System.out.println("Don't have operator!!!!");
               }
   }
}
