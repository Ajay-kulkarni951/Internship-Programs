package Set7_3.java;
/*
3. Write a program to Print even number from 372 to 853
*/

public class Set7_3
{
    public static void main(String[] args)
    {
        for(int iCnt = 372; iCnt <= 853; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
