/*
 8.Write a program to find the sum following series
 1/22 + 1/42 + 1/82 + 1/162 + 1/322 +……………
 */
package set11_8;

public class Set11_8 
{

    public static void main(String[] args) 
    {
        double iSum = 0;
        int n = 5, x = 2;
        for(int i = 0; i < n; i++)
        {
            double d = (double) 1 / Math.pow(x,2);
            iSum = iSum + d;
            x = x * 2;
        }
        System.out.println(iSum);
    }
    
}
