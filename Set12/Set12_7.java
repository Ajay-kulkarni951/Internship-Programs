/*7. Write a program which accept population of a country in crores and also growth rate per year 
and also accept number of years to predict the growth rate. And print the predicted 
population for every year till the given number of years.*/

package set12_7;
import java.util.Scanner;

public class Set12_7 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Population of City");
        long population = sc.nextLong();
        
        System.out.println("Enter Growth Rate of Population");
        float growthRate = sc.nextFloat();
        
        System.out.println("Enter the number of Years");
        int yrs = sc.nextInt();
        
        int  i = 1;
        System.out.println("Predicted Population until next "+ yrs +" years is");
        while(i <= yrs)
        {
            population = (long) (population + (population / 100) * growthRate);
            System.out.println(population);
            i++;
        }
    }
}
