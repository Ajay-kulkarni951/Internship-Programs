/*Write a program to take sides of a triangle and check the type of the triangle*/
package set6_1;
import java.util.Scanner;

public class Set6_1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a == b && b == c)
        {
            System.out.println("Equilateral Triangle");
            
        }else if(a == b || b == c || c == a)
        {
            System.out.println("Isoceles Triangle");
            
        }else
        {
             System.out.println("Scalene Triangle");
        }
    }
    
}
