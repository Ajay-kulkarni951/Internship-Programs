package Set7_7.java;
import java.util.Scanner;
/*
7. Write a program to find sum up to n
*/
public class Set7_7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number - ");
        int iNo = sc.nextInt();
        int iSum = 0;
        for(int iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iSum = iSum + iCnt;
        }
        System.out.println("Sum upto n number is : "+iSum);
    }
}
