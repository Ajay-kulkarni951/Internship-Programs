/*6. Write a program to accept the co efficient of a quadratic equation like a,b and c and then
find the Discriminant ( disc= ( b*b)- 4*a*c). And display the type of the roots*/

package set3_6;


public class Set3_6
{

    public static void main(String[] args)
    {
       int a = 1, b = 2, c = 1;
       int disc = (b*b) - (4*a*c);
       String result ;
       result = (disc > 0)? "Real and Distinct" : (disc == 0)? "Real and Repeated" : "Imaginary" ;
        System.out.println("Roots of Given equation is "+ result);
    }

}
