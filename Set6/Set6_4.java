/*Write a program to find grade of an employee based on the following given table.*/
package set6_4;
import java.util.Scanner;

public class Set6_4 {

    
    public static void main(String[] args) 
    {
        System.out.println("Enter the Salary");
        Scanner sc = new Scanner(System.in);
        int sal = sc.nextInt();
        System.out.println("Grade of the Employee is: ");
   
        if(sal >= 0 && sal <= 15000)
        {
                System.out.println("Peon");
        }
        else
        {
            if(sal >= 15001 && sal <=25000)
            {
                System.out.println("2nd Division Clerk");
            }
            else
            {
                if(sal >= 25001 && sal <= 35000)
                {
                    System.out.println("1st Division Clerk");
                }
                else
                {
                    if(sal >= 35001 && sal <= 45000)
                    {
                        System.out.println("Assistant Manager");
                    }
                    else
                    {
                        if(sal >= 45001 && sal <= 60000)
                        {
                            System.out.println("Manager");
                        }
                        else
                        {
                            System.out.println("Invalid Entry");
                        }
                    }
                }
            }
        }
    }
}
    
