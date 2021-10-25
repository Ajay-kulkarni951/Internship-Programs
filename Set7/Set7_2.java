package Set7_2.java;
import java.util.Scanner;
/*
2. Write a program to Print number from 1 to n
*/
public class Set7_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number - ");
        int iNo = sc.nextInt();
        for(int iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println(iCnt);
        }
    }
}
