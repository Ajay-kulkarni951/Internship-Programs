package Set7_6.java;
/*
6. Write a program to print the numbers from 567 to 134 which are divisible 9 and not by 6
*/
public class Set7_6
{
    public static void main(String[] args)
    {
        for(int iCnt = 567; iCnt >= 134; iCnt--)
        {
            if((iCnt % 9 == 0) && (iCnt % 6 != 0))
            {
                System.out.println(iCnt);
            }
        }
    }
}
