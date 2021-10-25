/*10. WAP to print even number using continue statements. */

package set13_10;
import java.util.Scanner;

public class Set13_10 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number until you want to display even numbers");
        int number = sc.nextInt();
        
        System.out.println("Even number are");
        
        for(int i = 1; i <= number; i++)
        {
            if(i % 2 == 0)
                System.out.println(i);
            else
                continue; 
        }
    }
}
