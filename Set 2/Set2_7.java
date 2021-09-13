/*7. Write a program to solve this equation (sqrt(m + n + p) ^ (x + y)) / ((a + b + c) / (m + n)) */

package set2_7;


public class Set2_7
{

    public static void main(String[] args)
    {
       int m = 8, n = 7, p = 10, x = 2, y = 2, a = 5, b = 6, c = 8;
       
       double n1 = (double) Math.sqrt(m + n + p);   
       
       int z = x + y;
       
       double numerator = (double) Math.pow(n1,z);    
       
       double denominator = (double) (a + b + c) / (m + n);  
       
       double total = numerator / denominator;
       
        System.out.println("Total is = "+total);
    }

}
