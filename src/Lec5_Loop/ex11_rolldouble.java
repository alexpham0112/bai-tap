
package Lec5_Loop;
import java.util.Random;
public class ex11_rolldouble {
   public static void main(String[] args)
   {
       Random rand = new Random();
       int n =0;
       int d1,d2;
       do
       {
           d1 = rand.nextInt(6)+1;
           d2 = rand.nextInt(6)+1;
           n++;
           System.out.println("Roll " + n +": "+ d1 +" and "+ d2);
       } while(d1!=d2);
           System.out.println("You rolled doubles after "+ n+" tries!");
   }
}
