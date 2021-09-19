/*3. Write a program to check whether a given number is even or odd using ternary operator.*/

package set3_3;


public class Set3_3
{

    public static void main(String[] args)
    {
       int num = 34;
       String result = (num % 2 == 0)? "Even" : "Odd";
        System.out.println("Given number is "+ result);
    }

}
