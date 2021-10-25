/*9. Write a program to find factorial of a number*/
package set11_9;
import java.util.Scanner;

public class Set11_9 
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        long fact = 1;
        int  i = 1;
        while(i < n)
        {
            fact = fact * i;
            i++;
        }
        System.out.println(fact);
    }
    
}
