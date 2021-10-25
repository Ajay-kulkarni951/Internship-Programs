/*5. Write a program which accepts principal amount and rate of interest per month as input and 
print the amount at the end of the each year till principal amount get doubled.*/

package set12_5;
import java.util.Scanner;

public class Set12_5 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Principle Amount ");
        double principle = sc.nextDouble();
        
        System.out.println("Enter Rate of Interest ");
        int roi = sc.nextInt();
     
        double doublePrinciple = 2 * principle;
        
        while(principle <= doublePrinciple)
        {
            principle = principle + ((principle / 100) * roi);
            System.out.println("Amount is "+ principle);
        }
    }
}
