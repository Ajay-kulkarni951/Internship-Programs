/*6. Write a program to print first n Fibonacci numbers */

package set13_6;
import java.util.Scanner;

public class Set13_6 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int count = 1, f1 = 0, f2 = 1;
        
        do
        {
            int f3 = f1 + f2;
            System.out.println(" "+f3);
            f1 = f2;
            f2 = f3;
            count++;
        }while(count <= number);
    }
}
