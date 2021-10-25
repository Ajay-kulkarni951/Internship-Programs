/*Write program to print the numbers from 1 to n with a line after every 3 numbers.*/
package set8_4;
import java.util.Scanner;

public class Set8_4 {

    
    public static void main(String[] args) {
        
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            System.out.println(i);
            if(i%3 == 0)
            {
                System.out.println("-------------------------------------------------------------------------------------------------------");                
            }
        }
    }
    
}
