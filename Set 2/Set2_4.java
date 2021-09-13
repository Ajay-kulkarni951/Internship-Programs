/*4. Write a program to find the area of triangle when three sides are given. (Hint: use heron’s
equation A =√(S-a)(S-b)(S-c) And S=(a+b+c)/2 , S=Semi –Perimeter).*/

package set2_4;

public class Set2_4
{

    public static void main(String[] args)
    {
       int a = 10, b = 12, c = 8;
       
       double S = (double) (a + b +c) / 2;
       double R = (S - a) * (S - b) * (S - c);
       double A = Math.sqrt(R);      //calculates square root of (S - a) * (S - b) * (S - c)
       
        System.out.println("Area of Triangle is "+ A);
    }

}
