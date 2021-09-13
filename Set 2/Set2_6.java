//6. Write a program to solve this equation ((a + b) ^ (1 / x + y)) / (x + y).

package set2_6;


public class Set2_6
{

    public static void main(String[] args)
    {
        double a = 10, b = 20, x = 5, y =15;
        
        double n = a + b;
        double e = (1 / (x + y));
        double d = (x + y);
        
        double k = Math.pow(n , e);       //calculates ((a + b) ^ (1 / x + y)) 
        double L = k / d;
        
        System.out.println("Answer is "+ L);
    }

}
