package Set7_8.java;
import java.util.Scanner;
/*
8. Write a program to find the factorial of a number
*/
public class Set7_8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number - ");
        int iNo = sc.nextInt();
        int iFact = 1;
        for(int iCnt = iNo; iCnt >= 1; iCnt--)
        {
            iFact = iFact * iCnt;
        }
        System.out.println("Factorial of a given number is - "+ iFact);
    }
}
