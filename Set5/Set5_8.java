/*Write a program to check whether a given character is vowel or consonant*/
package set5_8;
import java.util.Scanner;

public class Set5_8 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'|| ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println("Entered character is a Vowel");
        }
        else
            System.out.println("Entered character is a Consonant");
    }
    
}
