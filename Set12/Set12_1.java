/*1. Write a program to find the sum up to a number*/
package set12_1;
import java.util.Scanner;

public class Set12_1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        double iNo = sc.nextInt();
        int iSum = 0, i = 1;
        while(i <= iNo)
        {
            iSum = iSum + i;
            i++;
        }
        System.out.println("Sum up to given number is "+ iSum);
    }
    
}
