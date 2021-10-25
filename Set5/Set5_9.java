/*Write a program to check whether a given number is even or odd*/
package set5_9;
import java.util.Scanner;

public class Set5_9 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        
        if(n % 2 == 0)
            System.out.println(n+" is a even number");
        else
            System.out.println(n+" is a odd number");
    }
    
}
