package Set9_2.java;
import java.util.Scanner;
/*
2. Write a program to get the following output
54321
5432
543
54
5
*/
public class Set9_2
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a number - ");
        int iNo = sobj.nextInt();

        for(int i = 1; i <= iNo; i++)
        {
            for(int j = iNo; j >= i; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
