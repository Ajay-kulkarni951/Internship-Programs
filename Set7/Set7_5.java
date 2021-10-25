package Set7_5.java;
import java.util.Scanner;
/*
5. Write a program to Print the number which are divisible by 3 and 7 from 1 to n
*/
public class Set7_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number - ");
        int iNo = sc.nextInt();

        for(int iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iCnt % 3 == 0) && (iCnt % 7 == 0))
            {
                System.out.println(iCnt);
            }
        }
    }
}
