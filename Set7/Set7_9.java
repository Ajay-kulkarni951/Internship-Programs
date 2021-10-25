package Set7_9.java;
import java.util.Scanner;
/*
9.Wrtie a program to print 1,4,9,16.25,36,49,64,81,100
*/
public class Set7_9
{
    public static void main(String[] args)
    {
        for(int iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.println((int)(Math.pow(iCnt,2)));
        }
    }
}
