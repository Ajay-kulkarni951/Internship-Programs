/*8. Write a program to solve this equation (b^2 / |c|) + sqrt(3)*(A^2) + sqrt(8B)*/

package set2_8;

public class Set2_8
{

    public static void main(String[] args)
    {
       int b = 4, c = 2, A = 5, B = 2;
       
       double first = (double) (Math.pow(b,2) / Math.abs(c));
       
       double second = (double) (Math.sqrt(3) * Math.pow(A,2));
       
       double third = (double) Math.sqrt(8 * B);
       
       double total = first + second + third;
       
        System.out.println(total);
    }

}
