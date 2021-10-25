/*Write a program to find whether a given no is prime or not*/
package set8_2;
import java.util.Scanner;

public class Set8_2 {

    
    public static void main(String[] args) {
        int num = 0, i, flag = 0;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        num = n/2;
        if(n == 0 || n == 1)
        {
            System.out.println(n+" is not prime");
        }
        else
        {
            for (i=2;i<=num;i++)
            {
                if(n % 2 == 0)
                {
                    System.out.println(n+" is not prime");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                System.out.println(n+" is prime number");
        }
      
    }
    
}
