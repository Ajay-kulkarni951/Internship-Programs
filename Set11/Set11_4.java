/*4. Write a program to find the sum following series
 1/22+ 1/42+ 1/62+ 1/82+ 1/102+……………n  */
package set11_4;


public class Set11_4 {


    public static void main(String[] args) {
        int iNo = 5;
        double iSum = 0;
        for(int i = 1; i <= iNo; i++)
        {
            iSum = iSum + (1 / Math.pow(i,2));
        }
        System.out.println(iSum);
    }
    
}
