
package Lec3_Scanner.Lec3_ex;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ex11 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id: ");
        String id = scanner.next();
        scanner.nextLine();
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();
        System.out.print("Birthday: ");
        String date = scanner.nextLine();
        SimpleDateFormat birthday = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Major: ");
        String major = scanner.nextLine();
        System.out.print("GPA: ");
        Float GPA = scanner.nextFloat();
        System.out.println("id: "+id +"|name: "+name+ "|birthday: "+date+ "|major: "+major+"|GPA: "+GPA);
    }
}
