/*2 .Write a program to find sum of n numbers.  */

package set13_2;
import java.util.Scanner;

public class Set13_2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int number = sc.nextInt();
        
        int i = 1, sum = 0;
        
        do
        {
            sum = sum + i;
            i++;
        }while(i <= number);
        
        System.out.println("Sum of "+ number +" is "+ sum);
    }
}
