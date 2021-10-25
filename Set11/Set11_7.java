/*
7. Write a program to find the sum following series
 1-1/2+ 1/3 - 1/4+ 1/5 - 1/6+……………
*/
package set11_7;

public class Set11_7
{

    public static void main(String[] args) 
    {
        double iSum = 0;
        int sign = 1,n = 5;
        for(int i = 1; i <= n; i++)
        {
            double v = (double)1/i;
            v = v * sign;
            iSum = iSum + v;
            sign = -sign;
        }
        System.out.println(iSum);
    }
    
}
