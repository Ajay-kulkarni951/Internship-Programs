/*2. Write a program to find reverse of a number*/

package set12_2;
import java.util.Scanner;

public class Set12_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number ");
        int iNo = sc.nextInt();
        
        int rem ,iReverse = 0 ;
        
        while(iNo > 0)
        {
            rem = iNo % 10;
            iReverse = (iReverse * 10) + rem;
            iNo = iNo / 10;
        }
        System.out.println("Reverse of a given number is "+ iReverse);
    }
    
}
