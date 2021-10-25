/*10. Write a program to find the sum of digits of given number*/
package set11_10;
import java.util.Scanner;

public class Set11_10
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int rem , sum = 0;
        while(n > 0)
        {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println(sum);
    }
    
}
