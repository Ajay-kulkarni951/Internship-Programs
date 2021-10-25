/*Write a program to find biggest of two numbers*/
package set5_3;
import java.util.Scanner;


public class Set5_3 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b)
            System.out.println("Biggest number is "+a);
        else
            System.out.println("Biggest number is "+b);
    }
    
}
