/*6. Write a program to swap two integers without using third variable & display the result
        before swapping & after swapping.*/

package set1_6;

public class Set1_6
{
    public static void main(String[] args)
    {
        int a = 15 , b = 10;
        System.out.println(" Before Swapping a is "+a+" and b is "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(" After Swapping a is "+a+" and b is "+b);
    }
}

