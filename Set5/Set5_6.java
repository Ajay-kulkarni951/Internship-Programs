/*Write a program to check whether a given year is leap or not */
package set5_6;
import java.util.Scanner;

public class Set5_6 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        
        if(year % 4 == 0)
        {
            System.out.println(year+" is a Leap Year");
        }
        else
            System.out.println(year+" is NOT a Leap Year");
    }
    
}
