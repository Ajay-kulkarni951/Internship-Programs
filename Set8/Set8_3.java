/*Write a program to Print the prime no up to n*/
package set8_3;
import java.util.Scanner;

public class Set8_3 {

   
    public static void main(String[] args) {
        int i,j,n;
        System.out.println("Enter the number till which you want prime numbers");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=2;i<=n;i++)
        {
        int c=0;
        for(j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                c++;
            }
        }
         
       if(c==2)
        {
            System.out.println(i);
        }
        }
    }
    
}
