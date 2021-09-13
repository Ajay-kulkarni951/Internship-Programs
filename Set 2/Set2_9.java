/*9. Write a program to solve this equation (sin(a) + cos(b)) / (x + y) ^ (1 / 5)*/

package set2_9;


public class Set2_9
{

    public static void main(String[] args)
    {
       int a = 8,b = 7,x = 3,y = 8;
       
       double numerator = (double) (Math.sin(a) + Math.cos(b));
        System.out.println(numerator);
        
       double denominator = (double) Math.pow(x + y, 0.2);
        System.out.println(denominator);
        
       double total = (double) numerator / denominator;
        System.out.println("Total is "+ total);
    }

}
