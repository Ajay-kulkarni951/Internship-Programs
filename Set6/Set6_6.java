/*Write a Program to check whether a given character is Lower Character Alphabet or
Upper Character Alphabet or Digits.*/
package set6_6;
import java.util.Scanner;

public class Set6_6 {

    
    public static void main(String[] args)
    {
        System.out.println("Enter the character");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = str.charAt(0);
                 
        System.out.print("The Character  is  a ");
      
                  
                  
        if(ch >= 48 && ch <= 57)
        {
            System.out.println("Digit ");
        }
        else
        {
            if(ch >= 65 && ch <= 90)
            {
                System.out.println("Upper Case ");
            }
            else
            {
                if(ch >= 97 && ch <= 122)
                {
                    System.out.println("Lower Case");
                }
                else
                {
                    System.out.println("Special Character");
                }
            }
        }
    }
    
}
