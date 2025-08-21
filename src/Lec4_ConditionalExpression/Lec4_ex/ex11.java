
package Lec4_ConditionalExpression.Lec4_ex;

import java.util.Scanner;
public class ex11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap b: ");
        int b = scanner.nextInt();
        System.out.print("Nhap c: ");
        int c = scanner.nextInt();
        if(a==0){
            if(b!=0){
                System.out.println(-c/b);
            }
            else if(b==0){
                if(c==0){
                    System.out.println("Phuong trinh vo so nghiem");
                }
                else if(c!=0){
                    System.out.println("Phuong trinh vo  nghiem");
                }
            }
        }
        else if(a!=0){
            double delta=b*b-4*a*c;
            double x1,x2;
            
            if(delta<0){
            System.out.println("phuong trinh vo nghiem");
            }
            else if(delta==0){
            System.out.println("Phuong trinh co nghiem kep: "+-b/2*a);
            }
            else if(delta>0){
                System.out.println("Phuong trinh co 2 nghiem");
                System.out.println("x1: "+ (x1 =-b + Math.sqrt(delta))/2*a);
                System.out.println("x2: "+ (x2 =-b - Math.sqrt(delta))/2*a);
            }
        }
    }
}
