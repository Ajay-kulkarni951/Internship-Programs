/*6. Write a program to find the sum following series
 1! + 2! +3! + …. +n!
*/
package set11_6;


public class Set11_6 {

    public static void main(String[] args) {
        int iSum = 0, iNo = 5;
        for(int i = 0; i <= iNo; i++)
        {
            int fact = 1;
            for(int j = 1; j<= i; j++)
            {
                fact = fact * j; 
            }
            iSum = iSum + fact;
        }
        System.out.println(iSum);
    }
    
}
