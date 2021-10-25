/*5. Write a program to print the numbers upto n and print line after each 4 numbers. */

package set13_5;
import java.util.Scanner;

public class Set13_5 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int count = 1;
        
        do
        {
            System.out.println(count);
            if(count % 4 == 0)
                System.out.println("-----------------------------------------------");
            count++;
        }while(count <= number);
    }
}
