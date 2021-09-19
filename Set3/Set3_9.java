/*9. Write a program to find the grade of a student of a subject based on given table using
ternary operator.*/

package set3_9;


public class Set3_9
{

    public static void main(String[] args)
    {
       int marks = 85 ;
       String Result;
       Result = (marks <=35)? "Fail" : (marks >= 36 && marks <= 40)? "Pass" : 
               (marks >= 41 && marks <= 50)? "In 3rd div" : (marks >= 51 && marks <= 60)? " In 2nd div" :
               (marks >= 61 && marks <= 70)? "In 1st div" : (marks >= 75 && marks <= 100)? " In Distinction" : "Invalid Input";
               System.out.println("Student is "+Result);
    }

}
