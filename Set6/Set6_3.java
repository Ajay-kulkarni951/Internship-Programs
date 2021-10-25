/*Write a program to find the grade of a student of a subject based on given table*/
package set6_3;
import java.util.Scanner;

public class Set6_3 {

    
    public static void main(String[] args) {
       System.out.println("Enter the marks of Student");
       
       Scanner sc = new Scanner(System.in);
       int marks = sc.nextInt();
       
       System.out.println("Grade is: ");
   
   
   
   if(marks >= 0 && marks <= 35)
   {
       System.out.println("FAIL");
   }else
   {
       if(marks >= 36 && marks <= 40)
       {
           System.out.println("PASS");
       }else
       {
           if(marks >= 41 && marks <=50)
           {
               System.out.println("3rd Division");
           }else{
               if(marks >= 51 && marks <= 60)
               {
                   System.out.println("2nd Division");
               }else{
                   if(marks >= 61 && marks <= 70)
                   {
                       System.out.println("1st Division");
                   }else
                   {
                       if(marks >= 71 && marks <= 100)
                       {
                           System.out.println("Distinction");
                           
                       }else
                       {
                           System.out.println("Invalid Entry");
                       }
                   }
               }
               
           }
       }
   }
    }
    
}
