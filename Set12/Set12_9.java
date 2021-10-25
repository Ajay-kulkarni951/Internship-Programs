/*9. Write a program to find the sum of the series  */

package set12_9;
import java.util.Scanner;

public class Set12_9 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number ");
        int number = sc.nextInt();
        
        int i = 1;
        double sum = 0;
        
        while(i <= number)
        {
            double fact = 1;
            for(int j = 1; j <= i; j++)
                fact = fact * j;
            
            double s = i / fact;
            
        sum = sum + s;    
        i++;    
        }
        System.out.println(sum);
    }
}
