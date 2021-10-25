package Set9_1.java;
import java.util.Scanner;
/*
1. Write a program to get the following output
1
22
333
4444
55555
 */
public class Set9_1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a number - ");
        int iNo = sobj.nextInt();

        for(int i = 1; i <= iNo; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
