/*10. Write a program to find grade of an employee based on the following given table using
ternary operator.*/

package set3_10;


public class Set3_10
{

    public static void main(String[] args)
    {
       int salary = 35001 ;
       String grade;
       grade = (salary <=15000)? "Peon" : (salary >= 15001 && salary <= 25000)? "2nd div Clerk" : 
               (salary >= 25001 && salary <= 35000)? "1st div Clerk" : (salary >= 35001 && salary <= 45000)? 
               "Assistant Manager" : (salary >= 45001 && salary <= 60000)? "Manager" : "Invalid Input";
               System.out.println("Employee Grade is "+grade);
    }

}
