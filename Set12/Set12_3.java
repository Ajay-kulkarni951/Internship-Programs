//3. Write a program to find the binary equivalent of a given number

package set12_3;
import java.util.Scanner;

public class Set12_3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number ");
        int iNum = sc.nextInt();
        
        int rem = 0, binary = 0, base = 1;
        
        while(iNum > 0)
        {
            rem = iNum % 2;
            binary = binary + rem * base;
            base = base * 10;
            iNum = iNum / 2;
        }
        System.out.println("Binary equivalent of given number is "+ binary);
    }
}
