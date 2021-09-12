/*5. Write a program to swap two integers & display the result before swapping & after
        swapping (hint: use third variable).*/

package set1_5;

public class Set1_5
{
    public static void main(String[] args)
    {
        int a = 3 , b = 7 , temp;
        System.out.println(" Before Swapping a is "+a+" and b is "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println(" After Swapping a is "+a+" and b is "+b);
    }
}

