//6. Write a program to print the first n prime numbers

package set12_6;
import java.util.Scanner;

public class Set12_6 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number ");
        int number = sc.nextInt();
        
        int i = 2, count = 0;
        
        System.out.println("First "+ number +" prime numbers are : ");
        
        while(count <= number)
        {
            boolean flag = true;
            for(int j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
