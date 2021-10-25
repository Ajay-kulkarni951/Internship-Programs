/*9. Writer a program to print the sum of the following series 1+1/2+1/3+1/4+1/5 .........n */

package set13_9;
import java.util.Scanner;

public class Set13_9 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int number = sc.nextInt();
        
        int i = 1;
        double sum = 0;
        
        do
        {
            sum = (double) sum + (1/i);
            i++;
        }while(i <= number);
        System.out.println("Sum of the series is "+ sum);
    }
}
