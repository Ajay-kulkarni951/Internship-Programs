/*7. Write a program to perform 5 arithmetic operations based on users given choice and ask the 
user to continue or not. */

package set13_7;
import java.util.Scanner;

public class Set13_7 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char cont;
        do
        {
            System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Modulus");
            
            System.out.println("Enter Your Choice");
            int choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter two numbers");
                    
                    System.out.println("Enter number 1");
                    float number1 = sc.nextFloat();
                    
                    System.out.println("Enter number 2");
                    float number2 = sc.nextFloat();
                    
                    float addition = number1 + number2;
                    
                    System.out.println("Addition is "+ addition);
                    
                    break;
                    
                case 2:
                    System.out.println("Enter two numbers");
                    
                    System.out.println("Enter number 1");
                    float number3 = sc.nextFloat();
                    
                    System.out.println("Enter number 2");
                    float number4 = sc.nextFloat();
                   
                    float subtraction = number3 - number4;
                    
                    System.out.println("Subtraction is "+ subtraction);
                    
                    break; 
                 
                case 3:
                    System.out.println("Enter two numbers");
                    
                    System.out.println("Enter number 1");
                    float number5 = sc.nextFloat();
                    
                    System.out.println("Enter number 2");
                    float number6 = sc.nextFloat();
                   
                    float multiplication = number5 * number6;
                    
                    System.out.println("Multiplication is "+ multiplication);
                    
                    break;
                    
                case 4:
                    System.out.println("Enter two numbers");
                    
                    System.out.println("Enter number 1");
                    float number7 = sc.nextFloat();
                    
                    System.out.println("Enter number 2");
                    float number8 = sc.nextFloat();
                   
                    float division = number7 / number8;
                    
                    System.out.println("Division is "+ division);
                    
                    break;    
                        
                case 5:
                    System.out.println("Enter two numbers");
                    
                    System.out.println("Enter number 1");
                    float number9 = sc.nextFloat();
                    
                    System.out.println("Enter number 2");
                    float number10 = sc.nextFloat();
                   
                    float remainder = number9 % number10;
                    
                    System.out.println("Remainder is "+ remainder);
                    
                    break; 
                
                default:
                    System.out.println("Enter Valid Choice");
                    break;
            }
            System.out.println("Do you want to continue? (y/n)");
            String a = sc.next();
            cont = a.charAt(0);
            
        }while(cont == 'y' || cont == 'Y');
    }
}
