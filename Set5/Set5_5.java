/*Write a program to find biggest of three number’s by without logical operator*/
package set5_5;
import java.util.Scanner;

public class Set5_5 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 Numbers");
        int a=sc.nextInt();           
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a > b & a > c)
        {
            System.out.println("Biggest number is " + a);
            
        }
        else if(b > a & b > c)
        {
            System.out.println("Biggest number is " + b);
            
        }else
        {
            System.out.println("Biggest number is " + c);
        }
    }
    
}
