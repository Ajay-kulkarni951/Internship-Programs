/*10. Write a program to find the sum of the series */

package set12_10;
import java.util.Scanner;

public class Set12_10 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int number = sc.nextInt();
        
        double sum = 0, i = 1;
        
        while(i <= number)
        {
            double div = (double) 1/ Math.pow(i,i);
            sum = sum + div;
            i++;
        }
        System.out.println(sum);
    }
}
