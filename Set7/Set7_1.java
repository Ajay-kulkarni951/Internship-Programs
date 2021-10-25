package Set7_1.java;
import java.util.Scanner;
/*
1. Write a program to perform the different arithmetic operations based on the user choice
in symbolic form using Switch Case
*/
public class Set7_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("For various Arithmetic operations enter your choice from options below");
        System.out.println("1.Addition(+)  \t 2.Subtraction(-) \t 3.Multiplication(*) \t 4.Division(/) - ");
        int ch = sc.nextInt();

        switch(ch)
        {
            case 1:
                System.out.println("Enter Two Numbers for Addition - ");
                int iNo1 = sc.nextInt();
                int iNo2 = sc.nextInt();
                int iSum = iNo1 + iNo2;
                System.out.println("Addition of Two Numbers is : "+ iSum);
                break;

            case 2:
                System.out.println("Enter Two Numbers for Subtraction - ");
                iNo1 = sc.nextInt();
                iNo2 = sc.nextInt();
                int iSub = iNo1 - iNo2;
                System.out.println("Subtraction of Two Numbers is : "+ iSub);
                break;

            case 3:
                System.out.println("Enter Two Numbers for Multiplication - ");
                iNo1 = sc.nextInt();
                iNo2 = sc.nextInt();
                int iMul = iNo1 * iNo2;
                System.out.println("Multiplication of Two Numbers is : "+ iMul);
                break;

            case 4:
                System.out.println("Enter Two Numbers for Division - ");
                iNo1 = sc.nextInt();
                iNo2 = sc.nextInt();
                int iDiv = iNo1 / iNo2;
                System.out.println("Division of Two Numbers is : "+ iDiv);
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
