/*2. Write a program to find biggest of three numbers using ternary operator.*/

package set3_2;


public class Set3_2
{

    public static void main(String[] args)
    {
       int a = 17, b = 30, c = 23;
       int biggest = (a > b && a > c)? a : (b > a && b > c)? b : c;
        System.out.println("Biggest among three number is "+ biggest);
    }

}
