/*Write a program to find biggest of three no’s by using logical operator*/
package set5_4;
import java.util.Scanner;

public class Set5_4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b && a > c)
        {
            System.out.println("Biggest no is " + a);           
        }
        else if(b > a && b > c) 
                {
                    System.out.println("Biggest number is " +b);                   
                }
        else
        {
            System.out.println("Biggest number is "+ c);
        }
    }
    
}
