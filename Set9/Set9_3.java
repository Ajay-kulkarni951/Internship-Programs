package Set9_3.java;
import java.util.Scanner;
/*
3. Write a program to get the following output
5
54
543
5432
54321
*/
public class Set9_3
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a number - ");
        int iNo = sobj.nextInt();

        for(int i = 5; i >= 1; i--)
        {
            for(int j = iNo; j >= i; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
