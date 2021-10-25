/*3. Write a program to find the factorial of a number.*/

package set13_3;
import java.util.Scanner;

public class Set13_3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int number = sc.nextInt();
        
        int factorial = 1, i = 1;
        do
        {
            factorial = factorial * i;
            i++;
        }while(i <= number);
        
        System.out.println("Factorial of "+ number +" is "+factorial);
    }
}
