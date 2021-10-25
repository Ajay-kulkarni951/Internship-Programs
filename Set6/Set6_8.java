/*Write a program to print the colors of Rainbow on entering its first character of the color*/
package set6_8;
import java.util.Scanner;

public class Set6_8 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = sc.next().charAt(0);
       
        switch(ch)
        {
            case 'v' : System.out.println("Voilet");
                break;
               
            case 'i' : System.out.println("Indigo");
                break;
               
            case 'b' :System.out.println("Blue");
                break;
               
            case 'g' : System.out.println("Green");
                break;
             
            case 'y' : System.out.println("Yellow");
                break;
            
            case 'o'  : System.out.println("Orange");
                break;
             
            case 'r' : System.out.println("Red");
                break;
             
            default : System.out.println("Invalid Input");
                break;
               
      }
    }
    
}
