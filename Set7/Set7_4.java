package Set7_4.java;
/*
4. Write a program to print the odd numbers from 910 to 543
*/
public class Set7_4
{
    public static void main(String[] args)
    {
        for(int iCnt = 910; iCnt >=543; iCnt--)
        {
            if(iCnt % 2 != 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
