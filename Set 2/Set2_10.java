/*10. Write a program to solve this equation u = (- b + sqrt(| b ^ 2 - 4*a*c |)) / 2a */

package set2_10;

public class Set2_10
{

    public static void main(String[] args)
    {
      int a = 4, b = 2, c = 3;
      
      double n1 = (double)  Math.abs((Math.pow(b,2) - (4 * a * c)));
      
      double n2 = (double) Math.sqrt(n1);
      
      double numerator = (double) (-b + n2);
      
      double denominator = (double) 2 * a;
      
      double u = numerator / denominator;
      
        System.out.println("Total is "+ u); 
    }

}
