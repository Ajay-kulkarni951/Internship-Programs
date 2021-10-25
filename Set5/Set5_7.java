/*Write a program to check whether a given number is positive or negative */
package set5_7;
import java.util.Scanner;

public class Set5_7 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non-zero number");
        int n = sc.nextInt();
        
        if(n > 0)
        {
            System.out.println(n+" is a positive number");
        }
        else
        {
            System.out.println(n+" is a negative number");
        }
    }
    
}
