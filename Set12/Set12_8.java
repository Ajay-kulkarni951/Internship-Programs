//8. Write a program to find the GCD of 2 numbers

package set12_8;
import java.util.Scanner;

public class Set12_8 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First number");
        int number1 = sc.nextInt();
        
        System.out.println("Enter Second number");
        int number2 = sc.nextInt();
        
        int remainder = number1 % number2;
        
        while(remainder != 0)
        {
            number1 = number2;
            number2 = remainder;
            remainder = number1 % number2;
        }
        System.out.println("GCD of is "+ number2);
    }
}
