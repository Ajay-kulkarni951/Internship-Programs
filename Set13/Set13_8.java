/*8. Write a program to print the colors of rainbow using switch case for the given character to the 
user and ask whether to continue or not. */

package set13_8;
import java.util.Scanner;

public class Set13_8 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char cont;
        do{
            System.out.println("Enter Your Choice");
            String s = sc.nextLine();
            char ch = s.charAt(0);
            switch(ch)
            {
                case 'v':
                    System.out.println("violet");
                    break;
                case 'V':
                    System.out.println("violet");
                    break;
                case 'i':
                    System.out.println("indigo");
                    break;
                case'I':
                    System.out.println("Indigo");
                    break;
                case 'b':
                    System.out.println("blue");
                    break;
                case 'B':
                    System.out.println("Blue");
                    break;
                case 'g':
                    System.out.println("green");
                    break;
                case 'G':
                    System.out.println("Green");
                    break;
                case 'y':
                    System.out.println("yellow");
                    break;
                case 'Y':
                    System.out.println("Yellow");
                    break;
                case 'o':
                    System.out.println("orange");
                    break;
                case 'O':
                    System.out.println("Orange");
                    break;
                case 'r':
                    System.out.println("red");
                    break;
                case 'R':
                    System.out.println("Red");
                    break;
                default :
                    System.out.println("Enter Valid Choice");
                    break;
            }
            System.out.println("Do you want to continue? (y/n)");
            String a = sc.nextLine();
            cont = a.charAt(0);
            
        }while(cont == 'y' || cont == 'Y');
    }
}
