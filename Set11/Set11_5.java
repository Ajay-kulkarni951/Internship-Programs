/*5. Write a program to find the sum following series
 1- 1/3 + 1/6 – 1/10 + 1/15 -…….*/
package set11_5;


public class Set11_5 {


    public static void main(String[] args) {
        int iNo = 5, iSign = 1, iS = 0;
        double Sum = 0;
        for(int i = 1; i <= iNo; i++)
        {
            iS = iS + i;
            double v = (double) 1 / iS;
            v = v * iSign;
            Sum = Sum + v;
            iSign = - iSign;
        }
        System.out.println(Sum);
    }
    
}
