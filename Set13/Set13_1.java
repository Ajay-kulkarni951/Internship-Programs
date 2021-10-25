/*1. Write a program to find sum of the series */

package set13_1;
import java.util.Scanner;

public class Set13_1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int x = 2, i = 1, sign = 1, n = 2;
        
        while(i <= n)
        {
            double v = (double) i/ (x + i);
            v = v * sign;
            sum = sum + v;
            sign = -sign;
            i++;
        }
        System.out.println("Sum of series is "+ sum);
    }
}
