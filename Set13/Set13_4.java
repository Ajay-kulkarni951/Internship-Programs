/*4. Write a program to print the number from 1 to 100 which are divisible by 4 and 5. */

package set13_4;
import java.util.Scanner;

public class Set13_4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = 100, i = 1;
        System.out.println("Numbers divisible by 4 and 5 are");
        do
        {
            if((i % 4 == 0) && (i % 5 == 0))
            {
                System.out.println(i);
            }
            i++;
        }while(i <= n);
    }
}
