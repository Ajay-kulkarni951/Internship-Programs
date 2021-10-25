/*10. Write a program to perform the different arithmetic operations based on the user choice 
in numerical form.*/

package set6_10;

import java.util.Scanner;

public class Set6_10 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your choice");
        System.out.println("'+' for Addition");
        System.out.println("'-' for Subtraction");
        System.out.println("'*' for Multiplication");
        System.out.println("'/' for Division");
        System.out.println("'%' for Modulus");
        String str = sc.nextLine();
        
        switch(str)
        {
            case "+": 
                System.out.println("Enter two numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Addition is : "+ (a + b));
                break;
                
            case "-":
                System.out.println("Enter two numbers");
                int c = sc.nextInt();
                int d = sc.nextInt();
                System.out.println("Subtraction is : "+ (c - d));
                break;
                
            case "*":
                System.out.println("Enter two numbers");
                int e = sc.nextInt();
                int f = sc.nextInt();
                System.out.println("Multiplication is : "+ (e * f));
                break;
                
            case "/":
                System.out.println("Enter two numbers");
                int g = sc.nextInt();
                int h = sc.nextInt();
                System.out.println("Division is : "+ (g / h));
                break;    
            
            case "%":
                System.out.println("Enter two numbers");
                int i = sc.nextInt();
                int j = sc.nextInt();
                System.out.println("Mod is : "+ (i % j));
                break;    
                
            default:
                System.out.println("Enter valid choice");
                break;
        }
    }
}
