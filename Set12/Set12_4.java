//4. Write a program to find decimal equivalent of a given binary number

package set12_4;
import java.util.Scanner;

public class Set12_4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a binary number ");
        int iNum = sc.nextInt();
        
        int decimal = 0,base = 1;
        
        while(iNum > 0)
        {
            int rem = iNum % 10;
            decimal = decimal + (rem * base);
            base= base * 2;
            iNum = iNum / 10;
        }
        System.out.println("Decimal equivalent of given number is "+ decimal);
    }
}
