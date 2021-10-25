/*Write a program to check whether a given number is even or odd */
package set6_7;
import java.util.Scanner;

public class Set6_7 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
     
        switch(n % 2)
        {
            case 0: System.out.println(n+" is even number");
                break;
                
            case 1: System.out.println(n+" is odd number");
                break;
        }
    }
    
}
